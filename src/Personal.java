
public class Personal extends Persona {
    public Rol rol;

    public Personal(String nombre, String cedula, String email, String telefono, Rol rol) {
        super(nombre, cedula, email, telefono);
        this.rol = rol;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Personal: " + nombre + ", Cédula: " + cedula + ", Rol: " + rol);
    }
}
