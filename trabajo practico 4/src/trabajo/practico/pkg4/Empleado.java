/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg4;

/**
 *
 * @author marco
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0; //variable de clase
    
    //constructor con todos los atributos inicializados
    public Empleado(int id, String nombre, String puesto, double salario){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;    
    }
    
    //constructor con atributo nombre, puesto y salario
    public Empleado(String nombre, String puesto, double salario){
        totalEmpleados++;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    
    //metodo para actualizar salario con porcentaje
    public void actualizarSalario(double porcentaje){
        this.salario += this.salario * (porcentaje / 100);
    }
    //meotodo par actualizar salario con cantidad 
    public void actualizarSalario(int cantidad){
        this.salario += cantidad;
    }
    
    //metodo para mostrar total de empleados
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
  
    //metodo toString()
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
}
