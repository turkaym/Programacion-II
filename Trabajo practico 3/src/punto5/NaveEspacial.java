/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto5;

/**
 *
 * @author marco
 */
public class NaveEspacial {
    // Constantes
    public static final int MAX_COMBUSTIBLE = 100;
    public static final int COSTO_DESPEGUE  = 5;
    public static final int CONSUMO_POR_UNIDAD = 1; // combustible por unidad de distancia

    // Atributos encapsulados
    private String nombre;
    private int combustible;
    private boolean enVuelo;

    
    public void despegar() {
        if (enVuelo) {
            System.out.println("La nave ya está en vuelo.");
            return;
        }
        if (combustible < COSTO_DESPEGUE) {
            System.out.println("No hay combustible suficiente para despegar (mínimo "
                               + COSTO_DESPEGUE + ").");
            return;
        }
        combustible = combustible - COSTO_DESPEGUE; // costo de despegue
        enVuelo = true;
        System.out.println("¡Despegó " + nombre + "! Combustible: " + combustible);
    }

    public void avanzar(int distancia) {
        if (distancia <= 0) {
            System.out.println("La distancia debe ser > 0.");
            return;
        }
        if (!enVuelo) {
            System.out.println("No puede avanzar sin despegar.");
            return;
        }
        int necesario = distancia * CONSUMO_POR_UNIDAD;
        if (combustible >= necesario) {
            combustible = combustible - necesario;
            System.out.println(nombre + " avanzó " + distancia +
                               " unidades. Combustible: " + combustible);
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia +
                               ". Necesita " + necesario + " y tiene " + combustible + ".");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a recargar debe ser > 0.");
            return;
        }
        int nuevo = combustible + cantidad;
        if (nuevo > MAX_COMBUSTIBLE) {
            int sobrante = nuevo - MAX_COMBUSTIBLE;
            combustible = MAX_COMBUSTIBLE;
            System.out.println("Tanque lleno (" + MAX_COMBUSTIBLE + "). Sobraron " + sobrante + " unidades.");
        } else {
            combustible = nuevo;
            System.out.println("Recargado. Combustible: " + combustible);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + " | En vuelo: " + enVuelo);
    }

    public String getNombre() {
        return nombre; 
    }
    
    public void setNombre(String n) {
        if (n != null && !n.trim().isEmpty()) { nombre = n.trim(); }
        else { System.out.println("Nombre inválido."); }
    }

    public int getCombustible() {
        return combustible; 
    }
    
    public void setCombustible(int c) {
        if (c < 0) c = 0;
        if (c > MAX_COMBUSTIBLE) c = MAX_COMBUSTIBLE;
        combustible = c;
    }

    public boolean isEnVuelo() {
        return enVuelo; 
    }
                
}
