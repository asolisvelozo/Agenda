
package agendaok;


public class Trabajo extends Contacto {
    private String empresa;
    public Trabajo(String n, String d, int t, String e,String trb) {
        super(n, d, t, e);
        this.empresa=e;
    }

    public String getTrabajo() {
        return empresa;
    }

    public void setTrabajo(String empresa) {
        this.empresa = empresa;
    }

    /**
     *
     * @return
     */
    @Override
    public String dameSQL(){
        String grupo="Trabajo";
        String sql="insert into Contactos (nombre,direccion,telefono,email,empresa,grupo)"
        +"values('"+this.getNombre()+"','"+this.getDireccion()+"',"+this.getTelefono()+",'"+
        this.getEmail()+"','"+this.getTrabajo()+"','"+grupo+"')";
        
        return sql;
        
    }
}
