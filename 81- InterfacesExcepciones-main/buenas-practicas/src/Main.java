
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BuenasPracticas b = new BuenasPracticas();

        b.agregarMensajero(new PalomaMensajera());
        b.agregarMensajero(new Telefono());
        b.agregarMensajero(new PalomaMensajera());
        b.agregarMensajero(new Persona());
        b.agregarMensajero(new Telefono());
        b.agregarMensajero(new PalomaMensajera());
        b.agregarMensajero(new Telefono());

        b.hacerCampania();
    }
}