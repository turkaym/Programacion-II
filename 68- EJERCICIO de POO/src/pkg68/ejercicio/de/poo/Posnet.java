/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg68.ejercicio.de.poo;

/**
 *
 * @author marco
 */
public class Posnet {
    public static final double RECARGO_POR_CUOTA = 0.03;
    public static final int MIN_CANT_CUOTAS = 1;
    public static final int MAX_CANT_CUOTAS = 6;
    
    
    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double montoAAbonar, int cantCuota){
        Ticket elTicket = null; // el ticket va a ser null hasta que se pueda efecturar el pago

        // primero validamos los datos que llegan por fuera y creo un metado que va atener la logica 
        if (datosValidos(tarjeta,montoAAbonar, cantCuota)) {
            // Calculamos el monto final
            double montoFinal = montoAAbonar + montoAAbonar * recargoSegunCuotas(cantCuota);
            // Si ya sabemos el monto final, nos quedaria saber si podemos pagar con la tarjeta que nos llego por parametro y tenia un saldo disponible
            // Aplicamos el principio TELL, DON'T ASK. En lugar de que la logica la hago el POSNET, se la delegamos a la TarjetaDeCredito()
            // el posnet le pregunta a la tarjeta si tiene saldo
            if (tarjeta.tieneSaldoDisponible(montoFinal)) {
                // principio tell, don´t ask descontar() 
                tarjeta.descontar(montoFinal);
                // Actualizamos a elTicket para que ahora sea true y devuelva un OBJETO TICKET que al no existir, tendriamos que crearlo
                //El constructor del ticket nos va a pedir el nombre y apellido del cliente, monto total (el cual ya lo tenemos) y monto por cuota 
                // 1ro obtenemos el nombre y apellido del cliente que esta en la clase Persona, pidiendole a la tarjeta de credito que lo haga
                String nombreYapellido = tarjeta.nombreCompletoDelTitular();
                // 2do Ahora obetenemos el monto por cuota pero lo hacemos directamete aca
                double montoPorCuota = montoFinal / cantCuota;
                elTicket = new Ticket(nombreYapellido, montoFinal, montoPorCuota); 
            }
            
        }
        
        return elTicket; // si el ticket no se efectua retorna null
    }
    
    //metodo que valida que los datos sean correctos
    private boolean datosValidos(TarjetaDeCredito tarjeta,double monto, int canCuotas){
        boolean esTarjetaValida = tarjeta != null; // una tarjeta es valida cuando es distinta de null != null
        boolean esMontoValido = monto > 0;
        boolean cantCuotasValidas = canCuotas >= MIN_CANT_CUOTAS && canCuotas <= MAX_CANT_CUOTAS;
        
        return esTarjetaValida && esMontoValido && cantCuotasValidas; //  todas tiene que ser validas
    }
    
    private double recargoSegunCuotas(int cantCuota){
        // si cantCuotas es igual a 1 entonces tendriamos "cantCuotas que es igual a 1 - 1 y daria 0
        return (cantCuota - 1) * RECARGO_POR_CUOTA;
    }
    
    
    
}
