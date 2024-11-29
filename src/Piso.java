
import java.util.ArrayList;
import java.util.List;

public class Piso {
    public int numero;
    public List<Plaza> plazas;

    public Piso(int numero) {
        this.numero = numero;
        this.plazas = new ArrayList<>();
    }

    public void agregarPlaza(Plaza plaza) {
        plazas.add(plaza);
    }

    public void mostrarInformacion() {
        System.out.println("Piso - Número: " + numero);
        for (Plaza plaza : plazas) {
            plaza.mostrarInformacion();
        }
    }
}

