/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author marco
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos;
    
    public Profesor(String id, String nombre, String especialidad){
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    public void agregarCurso(Curso curso){
       if (curso == null) return;
        if (!cursos.contains(curso)) {
            cursos.add(curso);
        }
        
        if (curso.getProfesor() != this) {
            curso.setProfesor(this);
        }
    }
    
    public void eliminarCurso(Curso c) {
        if (c == null) return;
        if (cursos.remove(c)) {
            if (c.getProfesor() == this) {
                c.setProfesor(null); // rompe relación del otro lado
            }
        }
    }
    
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("(sin cursos)");
            return;
        }
        for (Curso c : cursos) {
            System.out.println("- " + c.getCodigo() + " | " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " | Esp.: " + especialidad +
                " | Cursos: " + cursos.size());
    }

    // ==== Getters ====
    public String getId() {
        return id; 
    }
    
    
    public String getNombre() { 
        return nombre; 
    }
    
    
    public String getEspecialidad() {
        return especialidad; 
    }
    
    
    public ArrayList<Curso> getCursos() { 
        return cursos; 
    }

    @Override
    public String toString() {
        return "Profesor{" + "id='" + id + "', nombre='" + nombre + "', especialidad='" + especialidad + "'}";
    }
 }

