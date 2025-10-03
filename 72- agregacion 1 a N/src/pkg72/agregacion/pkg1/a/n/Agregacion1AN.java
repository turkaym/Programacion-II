/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg72.agregacion.pkg1.a.n;

/**
 *
 * @author marco
 */
public class Agregacion1AN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instancio la empresa
        Empresa sservicios = new Empresa("SS Servicios");
        // Instancio los empleados
        Empleado marcos = new Empleado("Marcos Salomon", "Desarrollador Back-End");
        Empleado farid = new Empleado("Farid Curtti", "Ingeniero de Base de Datos");
        Empleado alfredo = new Empleado("Alfredo Antonio", "Abogado");
        
        //Agrego los empleados a la empresa
        sservicios.agregarEmpleado(marcos);
        sservicios.agregarEmpleado(farid);
        sservicios.agregarEmpleado(alfredo);
        
        // muestro por pantalla la empresa
        mostrarEmpleado(sservicios);
        System.out.println("//////////////////////////////////");
        System.out.println("Eliminamos un empleado");
        sservicios.removerEmpleado(farid);
        System.out.println("//////////////////////////////////");
        mostrarEmpleado(sservicios);
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("Imprimimos el empleado eliminado para ver que existe en mi programa");
        System.out.println("Empleado despedido " + farid.getNombre()); // aqui imprimimos desde el objeto empleado "farid" para mostrar que 
    }                                                                  // ambos objetos Empleado y Empresa una vez que se desvinculan siguen existiendo 
    
    public static void mostrarEmpleado(Empresa empresa){
        System.out.println("La empresa "+  empresa.getNombre() + " tiene los siguientes empleados: ");
        System.out.println("|||||||||||||||||||||||||||||||||||");
        for (Empleado emp: empresa.getEmpleado()) {
            System.out.println("Empleado: " + emp.getNombre());
            System.out.println("Puesto: " + emp.getPuesto());
            System.out.println("--------------------------------");
        }
    }
    
    
}
