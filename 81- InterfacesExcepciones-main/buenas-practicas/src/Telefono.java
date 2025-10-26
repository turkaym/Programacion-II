
public class Telefono extends Dispositivo implements EnviadorDeMensaje {

    public void llamar() {
        System.out.println("Llamando...");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        encender();
        System.out.println("Enviando un mensaje de WhatsApp que dice: " + mensaje);
    }
}
