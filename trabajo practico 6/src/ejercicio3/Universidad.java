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
public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;
    
    public Universidad(String nombre){
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
  
    public void agregarProfesor(Profesor p) {
        if (p != null) profesores.add(p); 
    }
    
    
    public void agregarCurso(Curso c) {
        if (c != null) cursos.add(c); 
    }
    

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor); // usa la regla de sincronización
        }
    }

    public void listarProfesores() {
        if (profesores.isEmpty()) { 
            System.out.println("(sin profesores)"); 
            return; 
        }
        for (Profesor p : profesores) System.out.println(p);
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("(sin cursos)");
            return; 
        }
        for (Curso c : cursos) c.mostrarInfo();
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) 
                return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) 
                return c;
        }
        return null;
    }

    // Debe romper la relación con su profesor si lo hubiera
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            if (curso.getProfesor() != null) {
                curso.setProfesor(null); // corta relación del otro lado
            }
            cursos.remove(curso);
        }
    }

    // Antes de remover, dejar null los cursos que dictaba
    public void eliminarProfesor(String id) {
        Profesor prof = buscarProfesorPorId(id);
        if (prof != null) {
            // recorrer copia para evitar ConcurrentModification
            ArrayList<Curso> copia = new ArrayList<>(prof.getCursos());
            for (Curso c : copia) {
                c.setProfesor(null);
            }
            profesores.remove(prof);
        }
    }


    public void reporteCursosPorProfesor() {
        if (profesores.isEmpty()) { System.out.println("(sin profesores)"); return; }
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + " dicta " + p.getCursos().size() + " curso(s).");
        }
    }
    
}
