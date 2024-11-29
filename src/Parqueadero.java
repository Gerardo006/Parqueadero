
import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    public String nombre;
    public String direccion;
    public List<Piso> pisos;

    public Parqueadero(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pisos = new ArrayList<>();
    }

    public void agregarPiso(Piso piso) {
        pisos.add(piso);
    }

    public void mostrarInformacion() {
        System.out.println("Parqueadero - Nombre: " + nombre + ", Dirección: " + direccion);
        for (Piso piso : pisos) {
            piso.mostrarInformacion();
        }
    }
}

