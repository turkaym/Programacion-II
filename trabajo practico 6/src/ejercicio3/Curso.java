/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author marco
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    public Curso(String codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
   
    public void setProfesor(Profesor p) {
   
        if (this.profesor != null && this.profesor != p) {
            this.profesor.getCursos().remove(this);
        }

      
        this.profesor = p;

        // 3) Si hay nuevo profesor, asegurarnos de estar en su lista
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }
    }

    public void mostrarInfo() {
        String nomProf = (profesor == null) ? "Sin profesor" : profesor.getNombre();
        System.out.println(codigo + " - " + nombre + " | Profesor: " + nomProf);
    }

    public String getCodigo() {
        return codigo; 
    }
    
    
    public String getNombre() {
        return nombre; 
    }
    
    
    public Profesor getProfesor() { 
        return profesor; 
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo='" + codigo + "', nombre='" + nombre + "'}";
    }
}
