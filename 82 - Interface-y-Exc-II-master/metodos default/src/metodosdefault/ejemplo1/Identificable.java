package metodosdefault.ejemplo1;

public interface Identificable {

    public default void mostrarIdentificacion() {
        System.out.println(hashCode());
    }
}
