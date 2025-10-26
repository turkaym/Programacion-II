package excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marco
 */
public class TryWithResourcesBufferedReader {
    
    public void Lector(String ruta) {
        File archivo = new File(ruta);
         
        try (BufferedReader br = new BufferedReader(new FileReader(archivo));){
            System.out.println(br.readLine());
        }catch (IOException ex){
            System.out.println("Error: " + ex.getMessage());
            System.out.println("Error inesperado en el catch");
            ex.printStackTrace(System.out);
        }
            
    }
    
}
