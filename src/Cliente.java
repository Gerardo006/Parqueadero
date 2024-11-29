
public class Cliente extends Persona {
    public Cliente(String nombre, String cedula, String email, String telefono) {
        super(nombre, cedula, email, telefono);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Cliente: " + nombre + ", Cédula: " + cedula + ", Email: " + email + ", Teléfono: " + telefono);
    }
}
