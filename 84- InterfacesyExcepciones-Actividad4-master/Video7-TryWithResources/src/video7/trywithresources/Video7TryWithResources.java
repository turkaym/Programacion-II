/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package video7.trywithresources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Bruno
 */
public class Video7TryWithResources {

    public static void main(String[] args) {

        /***TRY-WITH-RESOURCES en Java***/
        VisorDeTXTs v = new VisorDeTXTs();
        v.mostrarTxt("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\Interfaces_y_Excepciones_ActvIV\\src\\interfaces_y_excepciones_actviv\\MENSAJE_OCULTO_VIDEO3.txt");
    }

    private static class VisorDeTXTs {

        public void mostrarTxt(String ruta) {
            File elArchivo = new File(ruta);
            try (BufferedReader br = new BufferedReader(new FileReader(elArchivo));) {
                System.out.println(br.readLine());
            } catch (IOException e) {
                System.out.println("Error de E/S: " + e.getMessage());
                throw new RuntimeException("Error inesperado en el catch");
            }
        }
    }
    
}
