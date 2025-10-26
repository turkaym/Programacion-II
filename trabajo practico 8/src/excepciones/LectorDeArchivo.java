/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author marco
 */
public class LectorDeArchivo {
    
    public void mostrarTxt(String ruta) throws FileNotFoundException, IOException{
        File archivo = new File(ruta);
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        System.out.println(br.readLine());
    }
}
