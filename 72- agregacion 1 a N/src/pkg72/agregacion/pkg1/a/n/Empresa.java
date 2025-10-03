/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg72.agregacion.pkg1.a.n;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author marco
 */
public class Empresa {
    private String nombre;
    private List empleados;
    
    public Empresa(String nombre){
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }
    
    // metodos para manipular la lista
    public void agregarEmpleado(Empleado emp){
        if (emp != null && !empleados.contains(emp)) { // el empleado no tiene que estar en la lista para  que se lo puede agregar
            empleados.add(emp);
        }
    }
    
    public void removerEmpleado(Empleado emp){
        if (emp != null && empleados.contains(emp)) { // el empleado tiene que estar contenido en la lista porque o sino no lo puede eliminar
            empleados.remove(emp);
        }
    }
    
    public List<Empleado> getEmpleado(){
        return Collections.unmodifiableList(empleados);
    }
    
    public String getNombre() {
        return nombre;
    }
}
