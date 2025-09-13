/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asociacion.bidereccional.pkg1.a.pkg1;

/**
 *
 * @author marco
 */
public class Matricula {
    private String numero;
    private Coche coche;
    
    public Matricula(String numero){
        this.numero = numero;
    }
    
    public void setCoche(Coche coche){
        this.coche = coche;
        if (coche != null && coche.getMatricula() != null) {
            coche.setMatricula(this);
        }
    }
    
    public Coche getCoche(){
        return coche;
    }
    
    public String getNumero(){
        return numero;
    }

}
