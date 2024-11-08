package agendaok;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class EJECUTABLE {

public static void main(String[] args) {
Agenda ac = new Agenda();
String resp="entra";
while (!resp.equals("Finalizar")){
String[]opciones = {"Agregar Contacto",
"Eliminar Contacto",
"Modificar Contacto",
"Mostrar Contacto"}; 

String nombre="";
String direccion="";  
int telefono=0; 
String email="";
String cumple="";
String grupo="";
 
resp = (String) JOptionPane.showInputDialog(null,"Seleccione una opcion","opciones",JOptionPane.DEFAULT_OPTION, null,opciones,opciones [0]);



if (resp.equals("Agregar Contacto")) {
String[] tipos = {"Amigo","Familiar","Trabajo","Eventuales"};
String op = (String) JOptionPane.showInputDialog(null,"Seleccione tipo de contacto","Tipos",JOptionPane.DEFAULT_OPTION, null,tipos,tipos[0]);

Contacto c; 

switch(op){
case "Amigo":nombre=JOptionPane.showInputDialog(null,"Ingrese nombre");
direccion=JOptionPane.showInputDialog(null,"Ingrese direccion");
telefono=Integer.parseInt((JOptionPane.showInputDialog(null,"Ingrese telefono")));
email=JOptionPane.showInputDialog(null,"Ingrese email");
cumple=JOptionPane.showInputDialog(null,"Ingrese cumpleaños");
grupo=JOptionPane.showInputDialog(null,"Ingrese grupo");

c = new Amigo (nombre,direccion,telefono,email,cumple);
ac.insertarcontacto(c);
break;

case "Familiar":nombre=JOptionPane.showInputDialog(null,"Ingrese nombre");
direccion=JOptionPane.showInputDialog(null,"Ingrese direccion");
telefono=Integer.parseInt((JOptionPane.showInputDialog(null,"Ingrese telefono")));
email=JOptionPane.showInputDialog(null,"Ingrese email");
String parentezco = JOptionPane.showInputDialog(null,"Ingrese parentezco");
grupo=JOptionPane.showInputDialog(null,"Ingrese grupo");

c = new Familiar (nombre,direccion,telefono,email,parentezco);
ac.insertarcontacto(c);
break;

case "Trabajo":nombre=JOptionPane.showInputDialog(null,"Ingrese nombre");
direccion=JOptionPane.showInputDialog(null,"Ingrese direccion");
telefono=Integer.parseInt((JOptionPane.showInputDialog(null,"Ingrese telefono")));
email=JOptionPane.showInputDialog(null,"Ingrese email");
String empresa = JOptionPane.showInputDialog(null,"Ingrese empresa");
grupo=JOptionPane.showInputDialog(null,"Ingrese grupo");

c = new Trabajo (nombre,direccion,telefono,email,empresa);
ac.insertarcontacto(c);
break;

case "Eventuales":nombre=JOptionPane.showInputDialog(null,"Ingrese nombre");
direccion=JOptionPane.showInputDialog(null,"Ingrese direccion");
telefono=Integer.parseInt((JOptionPane.showInputDialog(null,"Ingrese telefono")));
email=JOptionPane.showInputDialog(null,"Ingrese email");
String particularidad = JOptionPane.showInputDialog(null,"Ingrese empresa");
grupo=JOptionPane.showInputDialog(null,"Ingrese grupo");

c = new Eventuales (nombre,direccion, telefono, email, particularidad);
ac.insertarcontacto(c);
break;

}
} 
if (resp.equals("Eliminar Contacto")) {
                String[] tipos = {"Amigo","Familiar","Trabajo", "Eventuales" };
                String op = (String) JOptionPane.showInputDialog(null,"Seleccione tipo de contacto","Tipos",JOptionPane.DEFAULT_OPTION, null,tipos,tipos[0]);
           
                String n; 
                
                switch(op){
                    
                    case "Amigo":nombre=JOptionPane.showInputDialog(null,"Ingrese nombre");
                          
                                
                        n = new String (nombre);
                        ac.eliminarContacto(n);
                        break;
                        
                    case  "Familiar":nombre=JOptionPane.showInputDialog(null,"Ingrese nombre");
                               
                                
                        n = new String (nombre);
                        ac.eliminarContacto(n);
                        break;
                        
                    case  "Trabajo":nombre=JOptionPane.showInputDialog(null,"Ingrese nombre");
                             
                                
                        n = new String (nombre);
                        ac.eliminarContacto(n);
                        break;
                        
                    case  "Eventuales":nombre=JOptionPane.showInputDialog(null,"Ingrese nombre");
                        
                        n = new String (nombre);
                        ac.eliminarContacto(n);
                        break;    
                        
   
        }
    
 }
            if (resp.equals("Modificar Contacto")) {
                String[] tipos = {"Amigo","Familiar","Trabajo","Eventuales"};
                String op = (String) JOptionPane.showInputDialog(null,"Seleccione tipo de contacto","Tipos",JOptionPane.DEFAULT_OPTION, null,tipos,tipos[0]);
           
           
                       
                     Contacto c;
                         
                
                 switch(op){
                    
                    case "Amigo":nombre=JOptionPane.showInputDialog(null,"Ingrese nombre");
                                 telefono=Integer.parseInt((JOptionPane.showInputDialog(null,"Ingrese telefono")));
                                 
                                    String cu=JOptionPane.showInputDialog(null,"Ingrese cumpleaños");
                                     grupo=JOptionPane.showInputDialog("Ingrese grupo");
                                
                        
                        ac.modificarContactos(nombre,telefono,email);
                        break;
                        
                    case  "Familiar":
                                 nombre=JOptionPane.showInputDialog(null,"Ingrese nombre");
                                 telefono=Integer.parseInt((JOptionPane.showInputDialog(null,"Ingrese el nuevo numero de telefono")));
                                
                                 String p = JOptionPane.showInputDialog("Ingrese parentezco");
                                 
                                
                        
                        ac.modificarContactos(nombre,telefono,email);
                        break;
                        
                        case  "Trabajo":nombre=JOptionPane.showInputDialog(null,"Ingrese nombre");
                                 telefono=Integer.parseInt((JOptionPane.showInputDialog(null,"Ingrese telefono")));
                                 
                                 String tdp= JOptionPane.showInputDialog(null,"Ingrese tipotrabajo");
                                 grupo=JOptionPane.showInputDialog("Ingrese grupo");
                                
                       
                        ac.modificarContactos(nombre,telefono,email);
                        break;
                        
                        case  "Eventuales":nombre=JOptionPane.showInputDialog(null,"Ingrese nombre");
                                 telefono=Integer.parseInt((JOptionPane.showInputDialog(null,"Ingrese telefono")));
                                 
                                 String parti= JOptionPane.showInputDialog(null,"Ingrese particularidad");
                                 grupo=JOptionPane.showInputDialog("Ingrese grupo");
                                
                       
                        ac.modificarContactos(nombre,telefono,email);
                        break;
                        
 }
                       
 }
    
                        
                   
                        
            
            
            
            
 
     if (resp.equals("Mostrar Contacto")) {
                String[] tipos = {"Amigo","Familiar","Trabajo", "Eventuales"};
                String op = (String) JOptionPane.showInputDialog(null,"Seleccione tipo de contacto","Tipos",JOptionPane.DEFAULT_OPTION, null,tipos,tipos[0]);
           
    
   
                
                switch(op){
                    
                    case "Amigo":
                                 
                                
                        
                        ac.imprimirListaContactos();
                        break;
                        
                    case  "Familiar":
                                 
                                 
                                 
                        
                        ac.imprimirListaContactos();
                        break;
                        
                    case  "Trabajo":nombre=JOptionPane.showInputDialog(null,"Ingrese nombre");
                                 
                                
                        
                        ac.imprimirListaContactos();
                        break;
                        
                    case  "Eventuales":
                                 
                                 
                                 
                        
                        ac.imprimirListaContactos();
                        break;
    
     }    
         }
           
                       

                        
}
    }
}



