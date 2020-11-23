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
public class CalculadoraDigital extends Calculadora{
    private double x,y,resultado;

    public CalculadoraDigital() {
    }

    public CalculadoraDigital(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    
}
