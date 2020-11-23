/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2interface;

/**
 *
 * @author venm9
 */
public interface Productos {
    double oriente = 15;
    double occidente = 20;
    double central = 5;
    String nombreProducto = "";
    String categoria = "";
    double precio = 0;
    Integer zona = 0;
    public void calcularEnvio(String nombreProducto,String categoria,double precio, Integer Zona); 
}
