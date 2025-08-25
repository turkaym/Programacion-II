/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg06.estructura.condicional;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class ejercicioSwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        char simbolo;
        
        System.out.println("Ingresa el primer numero:  ");
        num1 = Integer.parseInt(input.nextLine());
    
        System.out.println("Ingresa el segundo numero:  ");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println("[+] Sumar A + B");
        System.out.println("[-] Restar A - B");
        System.out.println("[x] Multiplicar A x B");
        System.out.println("[/] Dividir A / B");
        simbolo = input.nextLine().charAt(0);
        
        switch (simbolo){
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 'x':
            case 'X':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + ((double) num1 / num2));
                } else {
                    System.out.println("No se puede divir por 0.");
                };
                break;
            default:
                System.out.println("Operacion invalida.");
                
        }
                
    }
    
}
