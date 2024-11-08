package agendaok;


public class Eventuales extends Contacto{
    
    private String particularidad;

    public Eventuales(String n,String d,int t,String e,String particularidad) {
        super(n,d,t,e);
        this.particularidad = particularidad;
    }

    public String getParticularidad() {
        return particularidad;
    }

    public void setParticularidad(String particularidad) {
        this.particularidad = particularidad;
    }

    public String dameSQL(){
        String grupo="Eventual";
        String sql="insert into Contactos (nombre,direccion,telefono,email,particularidad,grupo)"
        +"values('"+this.getNombre()+"','"+this.getDireccion()+"',"+this.getTelefono()+",'"+
        this.getEmail()+"','"+this.getParticularidad()+"','"+grupo+"')";
        
        return sql;
        
    }
    
}
