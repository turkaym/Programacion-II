/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01.clase.objeto.atributo;

public class Principal {

    public static void main(String[] args) {
        Auto a = new Auto();
        System.out.println(a);
        a.marca = "Chevrolet";
        a.patente = "CEP1234";
        a.color = "Verde";
        a.kms = 1500;
        a.conAire = true;
        System.out.println(a);
        
        Auto a2 = new Auto();
        a2.marca = "Ford";
        a2.patente = "PEC3216";
        a2.color = "Rojo";
        a2.kms = 2000;
        System.out.println(a2);
    }
    
}
