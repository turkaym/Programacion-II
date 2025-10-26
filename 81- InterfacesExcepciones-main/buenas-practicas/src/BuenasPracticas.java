import java.util.ArrayList;
import java.util.List;

public class BuenasPracticas {

    private List<EnviadorDeMensaje> mensajeros;

    public BuenasPracticas() {
        mensajeros = new ArrayList<>();
    }

    public void agregarMensajero(EnviadorDeMensaje mensajero) {
        this.mensajeros.add(mensajero);
    }

    public void hacerCampania() {
        for (EnviadorDeMensaje mensajero : mensajeros) {
            mensajero.enviarMensaje("Implementando interfaces");
        }
    }

}
