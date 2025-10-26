/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package video6.pkgfinally;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Bruno
 */
public class Video6Finally {

    public static void main(String[] args) {

        /***FINALLY en Java: Cuándo usarlo***/
        VisorDeTXTs v = new VisorDeTXTs();
        v.mostrarTxt("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\Interfaces_y_Excepciones_ActvIV\\src\\interfaces_y_excepciones_actviv\\MENSAJE_OCULTO_VIDEO3z.txt");       
    }
    
    private static class VisorDeTXTs {

        public void mostrarTxt(String ruta) {
            File elArchivo = new File(ruta);
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(elArchivo));
                System.out.println(br.readLine());
            } catch (IOException e) {
                System.out.println("Error de E/S: " + e.getMessage());
                throw new RuntimeException("Error inesperado en el catch");
            } finally {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println("No se pudo liberar el br");
                }
            }
        }
    }
    
}
