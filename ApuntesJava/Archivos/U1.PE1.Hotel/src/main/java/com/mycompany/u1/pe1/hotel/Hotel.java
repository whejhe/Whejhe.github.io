package com.mycompany.u1.pe1.hotel;

public class Hotel {
    //Propiedades
    public int numTotalHabitaciones, numHabitacionesOcupadas;
    public double precioHabitacionDiario, suplementoPrecioTemporadaAlta;
    public boolean temporadaAlta;
    
    //Métodos
    public void estableceNumTotalHabitaciones(int numTotal){
        numTotalHabitaciones = numTotal;
    }
    public void establecePrecioHabitacionDiario(double nuevoPrecio){
        precioHabitacionDiario = nuevoPrecio;
    }
    public void estableceSuplementoPrecioTemporadaAlta(double nuevoIncremento){
        suplementoPrecioTemporadaAlta = nuevoIncremento;
    }
    public int obtieneNumHabitacionesOcupadas(){
        return numHabitacionesOcupadas;
    }
    public int obtieneNumTotalHabitaciones(){
        return numTotalHabitaciones;
    }
    public void ocupaUnaHabitacion(){
        numHabitacionesOcupadas++;
    }
    public void liberaUnaHabitacion(){
        numHabitacionesOcupadas--;
    }
    public void comienzaTemporadaAlta(){
        temporadaAlta = true;
        precioHabitacionDiario = (suplementoPrecioTemporadaAlta + precioHabitacionDiario);
    }
    public void finalizaTemporadaAlta(){
        temporadaAlta = false; 
        precioHabitacionDiario = (precioHabitacionDiario - suplementoPrecioTemporadaAlta);
    }
    public double calculaBeneficioDiario(){
        double precioDiario;
        precioDiario = (precioHabitacionDiario * numHabitacionesOcupadas);
        return precioDiario;
    }
    
}
