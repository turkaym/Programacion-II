/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asociacion.bidereccional.pkg1.a.pkg1;

/**
 *
 * @author marco
 */
public class Coche {
    private String modelo;
    private Matricula matricula;
    
    public Coche(String modelo){
        this.modelo = modelo;
    }
    
    public void setMatricula(Matricula matricula){
       this.matricula = matricula;
        if (matricula != null && matricula.getCoche() != this) {
            matricula.setCoche(this);
        }
    }
    
    public Matricula getMatricula(){
        return matricula;
    }
    
    public String getModelo(){
        return modelo;
    }    
}
