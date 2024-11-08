
package agendaok;


public class Familiar extends Contacto{
    
    private String parentezco;
    
    public Familiar(String nombre, String direccion, int telefono, String email,String parentezco) {
        super(nombre, direccion, telefono, email);
        this.parentezco=parentezco;
    }

    public String getParentezco() {
        return parentezco;
    }

    public void setParentezco(String parentezco) {
        this.parentezco = parentezco;
    }

    public String dameSQL(){
        String grupo="Familiar";
        String sql="insert into Contactos (nombre,direccion,telefono,email,parentezco,grupo)"
        +"values('"+this.getNombre()+"','"+this.getDireccion()+"',"+this.getTelefono()+",'"+
        this.getEmail()+"','"+this.getParentezco()+"','"+grupo+"')";
        
        return sql;
        
    }
}
