public class Persona implements EnviadorDeMensaje {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("He hecho este código " + mensaje);
    }
}
