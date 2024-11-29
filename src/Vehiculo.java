
public class Vehiculo {
    public String placa;
    public TipoVehiculo tipo;

    public Vehiculo(String placa, TipoVehiculo tipo) {
        this.placa = placa;
        this.tipo = tipo;
    }

    public void mostrarInformacion() {
        System.out.println(tipo + " - Placa: " + placa);
    }
}
