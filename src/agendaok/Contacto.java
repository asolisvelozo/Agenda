
package agendaok;

import javax.swing.JOptionPane;


public class Contacto {
    
    private String nombre;
    private String direccion;
    private int telefono;
    private String email;
    private String grupo;
    
    public  Contacto (String n,String d,int t,String e){
        this.nombre=n;
        this.direccion=d;
        this.telefono=t;
        this.email=e;
        
        
    }

  
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
        // no se como terminarlo xd jaja soy un fracaso//
        
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String dameSQL() {
       return null;
    }
}

    