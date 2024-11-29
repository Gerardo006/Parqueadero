
import java.util.Date;

public class Factura {
    public int numero;
    public Reserva reserva;
    public Date fechaEmision;
    public float montoTotal;

    public Factura(int numero, Reserva reserva, Date fechaEmision, float montoTotal) {
        this.numero = numero;
        this.reserva = reserva;
        this.fechaEmision = fechaEmision;
        this.montoTotal = montoTotal;
    }

    public void mostrarInformacion() {
        System.out.println("Factura - Número: " + numero + ", Fecha emisión: " + fechaEmision + ", Monto total: " + montoTotal);
        reserva.mostrarInformacion();
    }
}
