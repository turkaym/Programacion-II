/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg70.atributos.de.tipo.coleccion;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author marco
 */
public class Concesionaria {
    private String nombre;
    private ArrayList<Auto> autos;
    
    public Concesionaria(String nombre){
        this.nombre = nombre;
        this.autos = new ArrayList<>(); // DEBEMOS INSTANCIAR EL ARRAYLIST DESDE EL CONSTRUCTOR PARA EVITAR EL NULL.POINTER.EXCEPTION
    }
    
    public void agregarAuto(Auto auto){ // creo metodo para asegurar el encapsulamiento y permitir que la concesionaria agregue autos
        this.autos.add(auto);
    }
    
    public void mostrarAutos(){
        if (autos.isEmpty()) {
            System.out.println("No hay Autos en la concesionaria");
        } else {
            for (int i = 0; i < autos.size(); i++) {
                System.out.println(autos.get(i));
            }
        }
    }
}
