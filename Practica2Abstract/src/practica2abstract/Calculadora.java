/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2abstract;

/**
 *
 * @author venm9
 */
public abstract class Calculadora {
    //protected double x,y;
    
    public double sumar(double x, double y){
        double suma = x + y;
        return suma;
    }
    
    public double restar (double x, double y){
        double restar = x - y;
        return restar;
    }
    
    public double multiplicar (double x, double y){
        double multiplicar = x * y;
        return multiplicar;
    }
    
    public double dividir (double x, double y){
        double dividir = x / y;
        return dividir;
    }
    
    public boolean isNumeric(String cadena){
        try {
            Double.parseDouble(cadena);
            return false;
        }
        catch (NumberFormatException nfe){
            return true;
        }
    }
}
