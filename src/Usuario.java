

public class Usuario extends Cliente implements IReserva {
    public boolean suscripcionActiva;
    public String metodoPago;

    public Usuario(String nombre, String cedula, String email, String telefono, boolean suscripcionActiva, String metodoPago) {
        super(nombre, cedula, email, telefono);
        this.suscripcionActiva = suscripcionActiva;
        this.metodoPago = metodoPago;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Usuario: " + nombre + ", Cédula: " + cedula + ", Email: " + email + ", Teléfono: " + telefono + ", Suscripción activa: " + suscripcionActiva + ", Método de pago: " + metodoPago);
    }

    @Override
    public boolean hacerReserva() {
        System.out.println("Reserva creada con éxito.");
        return true;
    }

    @Override
    public void modificarReserva(Reserva reserva) {
        System.out.println("Reserva con ID " + reserva.identificador + " modificada.");
    }

    @Override
    public boolean cancelarReserva(Reserva reserva) {
        System.out.println("Reserva con ID " + reserva.identificador + " cancelada.");
        return true;
    }
}
