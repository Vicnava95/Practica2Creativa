/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2interface;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author venm9
 */
public class Practica2Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputStream stream = System.in;
        Scanner scanner = new Scanner(stream);
        Producto producto = new Producto();
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el nombre de la categoria ");
        String categoria = scanner.nextLine();
        System.out.println("Ingrese el precio del producto");
        Double precio = scanner.nextDouble();
        System.out.println("Escoga la zona \n1.Oriente \n2.Occidente \n3.Central");
        Integer n = scanner.nextInt();
        producto.calcularEnvio(nombre, categoria, precio, n);
         
    }
    
}
