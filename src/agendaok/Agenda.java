
package agendaok;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
 

public class Agenda {
    private Connection conexion;
    private Statement comandos;
    private ResultSet tabla;
            
            

    public  Agenda (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection("jdbc:mysql://localhost/agenda","root","");
            comandos=conexion.createStatement();
            tabla=comandos.executeQuery("select * from contactos");
           
            while(tabla.next()){
                System.out.println(tabla.getString("nombre"));
                System.out.println(tabla.getString("direccion"));
                System.out.println(tabla.getString("telefono"));
                System.out.println(tabla.getString("email"));
                System.out.println(tabla.getString("parentezco"));
                System.out.println(tabla.getString("cumple"));
                System.out.println("---------------------------");
            }
        } catch (ClassNotFoundException ex) {
            
        Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE,null,ex);
        }catch (SQLException ex){
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE,null,ex);
        }
   
    
    }
    
    public void insertarcontacto(Contacto c){
        String sql=c.dameSQL();
        System.out.println(sql);
        try{
            comandos.execute(sql);
            System.out.println(sql);
            
        }catch (SQLException se){
            System.out.println(se.getMessage());
            
        }
        
    }
    public void eliminarContacto (String n){
        String sql="DELETE from contactos where nombre='"+n+"'";
        try{
            comandos.execute(sql);
            System.out.println("Se elimino el registro");
        }catch (SQLException ex)  {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
      public void modificarContactos(String no,int t,String e){
            String sql="UPDATE contactos SET telefono ='"+t+"'WHERE nombre= '"+no+"'";
            try{comandos.execute(sql);
            comandos.execute(sql);
         System.out.println("Se modifico el telefono");
                
            }catch (SQLException ex){
                Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        
      
        public void imprimirListaContactos() {
            ArrayList<Contacto> aux=this.dameListaContactos();
            System.out.println("lista de contactos de Facundo");
            for (Contacto c: aux) {
                System.out.println(c.toString()+"\n");
        }
        }
       
        
        public ArrayList<Contacto> dameListaContactos() {
            ArrayList<Contacto> listAux= new ArrayList();
            
            String sql="select * from contactos";
            
        try {
            tabla=comandos.executeQuery(sql);
            while(tabla.next()){
                String grupo=tabla.getString("grupo");
                int id=tabla.getInt("id");
                String nombre=tabla.getString("nombre");
                String direccion=tabla.getString("direccion");
                int telefono=tabla.getInt("telefono");
                String email=tabla.getString("email");                
                switch(grupo){
                    case "Amigo":String cumple=tabla.getString("cumple");
                                 Amigo a=new Amigo(nombre, direccion, telefono, email, cumple);
                                 listAux.add(a);
                    case "Familiar":String parentezco=tabla.getString("parentezco");
                                 Familiar f=new Familiar(nombre, direccion, telefono, email, parentezco);
                                 listAux.add(f);
                    case "Trabajo":String tipotrabajo=tabla.getString("tipotrabajo");
                                 Trabajo t=new Trabajo(nombre, direccion, telefono, email, tipotrabajo);
                                 listAux.add(t);    
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
            
                
            
        return listAux;
          }
}

    
    