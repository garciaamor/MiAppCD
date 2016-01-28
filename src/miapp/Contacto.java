package miapp;

public class Contacto {
    
    private String nombre;
    private String apellidos;
    private String telefono;
    private String correoElec;
    private int id;

    public Contacto() {
    }

    
    public Contacto(String nombre, String apellidos, String telefono, String correoElec, int id) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correoElec = correoElec;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElec() {
        return correoElec;
    }

    public void setCorreoElec(String correoElec) {
        this.correoElec = correoElec;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String texto;
        texto=getNombre() + "nombre" + getApellidos() + "apellidos" + getTelefono() + "telefono" + getCorreoElec() + "correoElec";
        return texto;
    }
    
    
}
