package com.mycompany.u1.pe1.hotel;

public class PruebaHotel {
    public static void main(String[] args) {
        Hotel h = new Hotel();
        
        h.estableceNumTotalHabitaciones(20);
        h.establecePrecioHabitacionDiario(50);
        h.estableceSuplementoPrecioTemporadaAlta(25);
        
        h.ocupaUnaHabitacion();
        h.ocupaUnaHabitacion();
        h.ocupaUnaHabitacion();
        h.ocupaUnaHabitacion();
        h.ocupaUnaHabitacion();
        
        int numTotal = h.obtieneNumTotalHabitaciones();
        int numOcupadas = h.obtieneNumHabitacionesOcupadas();
        System.out.println("Hay "+numOcupadas+ " habitaciones ocupadas de un total de "+numTotal);

        h.liberaUnaHabitacion();
        
        numOcupadas = h.obtieneNumHabitacionesOcupadas();
        System.out.println("Liberamos una. Número habitaciones ocupadas = "+numOcupadas);
        
        double beneficio = h.calculaBeneficioDiario();
        System.out.println("Beneficio diario actual = "+beneficio+" euros");
        
        h.comienzaTemporadaAlta();
        
        beneficio = h.calculaBeneficioDiario();
        System.out.println("Con temporada alta el beneficio diario actual = "+beneficio+" euros");
        
        h.finalizaTemporadaAlta();
        
        beneficio = h.calculaBeneficioDiario();
        System.out.println("Con temporada baja el beneficio diario actual = "+beneficio+" euros");
    }
}
