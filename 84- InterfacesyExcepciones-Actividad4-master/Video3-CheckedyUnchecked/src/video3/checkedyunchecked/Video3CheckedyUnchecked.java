/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package video3.checkedyunchecked;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Bruno
 */
public class Video3CheckedyUnchecked {

    public static void main(String[] args) {
        
        /***Excepciones CHECKED y UNCHECKED en Java***/ 
        
        VisorDeTXTs v = new VisorDeTXTs();
        try {
            v.mostrarTxt("D:\\Documentos\\Tec. Promgramacion\\Practicas Profesionales\\Interfaces y Excepciones-Actividad4\\Video3-CheckedyUnchecked\\src\\video3\\checkedyunchecked\\MENSAJE_OCULTO_VIDEO3.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe");
        } catch (IOException ex) {
            System.out.println("Error de E/S");
            System.out.println(ex.getMessage());
        }
    }
    
    private static class VisorDeTXTs {
        
        public void mostrarTxt(String ruta) throws FileNotFoundException, IOException {
            File elArchivo = new File(ruta);
            BufferedReader br = new BufferedReader(new FileReader(elArchivo));
            System.out.println(br.readLine());
        }
    }
    
}
