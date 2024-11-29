
public class Plaza {
    public int identificador;
    public Estado estado;
    public String ubicacion;
    public TipoPlaza tipo;
    public Tarifa tarifa;

    public Plaza(int identificador, Estado estado, String ubicacion, TipoPlaza tipo, Tarifa tarifa) {
        this.identificador = identificador;
        this.estado = estado;
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.tarifa = tarifa;
    }

    public void mostrarInformacion() {
        System.out.println("Plaza - ID: " + identificador + ", Estado: " + estado + ", Ubicación: " + ubicacion + ", Tipo: " + tipo + ", Tarifa: " + tarifa.monto + " (" + tarifa.descripcion + ")");
    }
}
