
import java.util.Date;

public class Reserva {
    public int identificador;
    public Date fecha;
    public String horaInicio;
    public String horaFin;
    public Plaza plaza;

    public Reserva(int identificador, Date fecha, String horaInicio, String horaFin) {
        this.identificador = identificador;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public void asignarPlaza(Plaza plaza) {
        this.plaza = plaza;
        plaza.estado = Estado.OCUPADA;
        System.out.println("Plaza asignada: " + plaza.identificador);
    }

    public void mostrarInformacion() {
        System.out.println("Reserva - ID: " + identificador + ", Fecha: " + fecha + ", Hora inicio: " + horaInicio + ", Hora fin: " + horaFin);
        if (plaza != null) {
            plaza.mostrarInformacion();
        }
    }
}
