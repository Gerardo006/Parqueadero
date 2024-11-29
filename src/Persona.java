
abstract class Persona {
    public String nombre;
    public String cedula;
    public String email;
    public String telefono;

    public Persona(String nombre, String cedula, String email, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.telefono = telefono;
    }

    public abstract void mostrarInformacion();
}
