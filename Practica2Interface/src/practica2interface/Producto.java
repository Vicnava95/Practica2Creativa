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
public class Producto implements Productos {
    private String nombreProducto;
    private String categoria;
    private double precio;
    private Integer zona;
    
    public Producto() {
    }

    public Producto(String nombreProducto, String categoria, double precio, Integer zona) {
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.precio = precio;
        this.zona = zona;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getZona() {
        return zona;
    }

    public void setZona(Integer zona) {
        this.zona = zona;
    }
    
    public void calcularEnvio(String nombreProducto,String categoria,double precio, Integer zona) {
        double calcular = 0;
        System.out.println("El producto es " + nombreProducto);
        System.out.println("La categoria es " + categoria);
        switch(zona){
            case 1:
                calcular = precio * oriente;
                break;
            case 2:
                calcular = precio * occidente;
                break;
            case 3:
                calcular = precio * central; 
        }
        System.out.println("El costo de envio es de: $" + calcular);
    }
    
}
