import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear un Parqueadero
        Parqueadero parqueadero = new Parqueadero("Parqueadero Central", "Avenida Principal 123");

        // Crear un Piso y agregar Plazas
        Piso piso1 = new Piso(1);
        Plaza plaza = new Plaza(1, Estado.LIBRE, "A1", TipoPlaza.CUBIERTA, new Tarifa(15.0f, "Cubierta"));
        piso1.agregarPlaza(plaza);  // Reutilizando la misma plaza para demostración
        parqueadero.agregarPiso(piso1);

        // Mostrar información del Parqueadero y del Piso
        System.out.println("Información del Parqueadero:");
        parqueadero.mostrarInformacion();

        // Crear un Cliente
        Cliente cliente = new Cliente("Juan Perez", "123456789", "juan@gmail.com", "1234567890");
        System.out.println("Información del Cliente:");
        cliente.mostrarInformacion();

        // Crear un Personal
        Personal personal = new Personal("Ana Lopez", "987654321", "ana@gmail.com", "0987654321", Rol.CAJERO);
        System.out.println("Información del Personal:");
        personal.mostrarInformacion();

        // Crear un Usuario
        Usuario usuario = new Usuario("Luis Torres", "543216789", "luis@gmail.com", "1239874560", true, "Tarjeta de Débito");
        System.out.println("Información del Usuario:");
        usuario.mostrarInformacion();

        // Crear una Reserva
        Reserva reserva = new Reserva(1, new Date(), "10:00", "12:00");
        System.out.println("Reserva creada:");
        reserva.mostrarInformacion();

        // Asignar la Plaza a la Reserva
        reserva.asignarPlaza(plaza);
        System.out.println("Información de la Plaza después de la asignación:");
        plaza.mostrarInformacion();


        // Crear una Factura
        Factura factura = new Factura(1001, reserva, new Date(), 15.0f);
        System.out.println("Información de la Factura:");
        factura.mostrarInformacion();

        // Crear Vehículos y mostrar su información
        Vehiculo auto = new Vehiculo("ABC-1234", TipoVehiculo.AUTOMOVIL);
        System.out.println("Información del Automóvil:");
        auto.mostrarInformacion();

        Vehiculo moto = new Vehiculo("XYZ-9876", TipoVehiculo.MOTOCICLETA);
        System.out.println("Información de la Motocicleta:");
        moto.mostrarInformacion();
    }
}



