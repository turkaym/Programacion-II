package metodosdefault.ejemplo2;

public interface Estudiante {

    public default void realizarTarea() {
        System.out.println("Realizo tarea porque necesito practicar para el examen");
    }
}
