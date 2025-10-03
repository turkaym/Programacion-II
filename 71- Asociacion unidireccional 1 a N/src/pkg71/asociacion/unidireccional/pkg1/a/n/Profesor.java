/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg71.asociacion.unidireccional.pkg1.a.n;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author marco
 */
public class Profesor {
    private String nombre;
    private List<Curso> cursos = new ArrayList<>();
    
    public Profesor(String nombre){
        this.nombre = nombre;
    }
    
    // METODOS PARA GESTIONAR LA COLECCION
    public void agregarCurso(Curso curso){
        cursos.add(curso);
    }
    
    public void eliminarCurso(Curso curso){
        cursos.remove(curso);
    }
    
    // GETTERS
    public List<Curso> getCursos(){
        return Collections.unmodifiableList(cursos);
    }
    
    public String getNombre(){
        return nombre;
    }
}
