package metodosdefault.ejemplo2;

public interface Empleado {

    public default void realizarTarea() {
        System.out.println("Realizo tarea porque me pagan por ello");
    }
}
