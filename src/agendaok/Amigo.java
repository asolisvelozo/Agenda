
package agendaok;


public class Amigo extends Contacto {
    
    private String cumple;
    private String comandos;
    
    
    public Amigo (String n,String d,int t,String e,String cum){
        super(n,d,t,e);
        this.cumple=cum;
    }

    

    

   

    public String getCumple() {  
        return cumple;
    }

    public void setCumple(String cumple) {
        this.cumple = cumple;
    }

    public String getComandos() {
        return comandos;
    }

    public void setComandos(String comandos) {
        this.comandos = comandos;
    }
    

public String dameSQL(){
        String grupo="Amigo";
        String sql="insert into Contactos (nombre, direccion, telefono, email, cumple, grupo)"
        +"values('"+this.getNombre()+"','"+this.getDireccion()+"',"+this.getTelefono()+",'"+
        this.getEmail()+"','"+this.getCumple()+"','"+grupo+"')";
        
        return sql;
        
    }

    
}
 