
public class PalomaMensajera extends Ave implements EnviadorDeMensaje {
    public void volarRapido() {
        System.out.print("Volando rápidamente...");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        volarRapido();
        System.out.println(" Tirando un papelito que dice: " + mensaje);
    }

}
