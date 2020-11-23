/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2abstract;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author venm9
 */
public class Practica2Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean dato1= true;
        boolean dato2= true;
        String valor1 = "0";
        String valor2 = "0";
        InputStream stream = System.in;
        Scanner scanner = new Scanner(stream);
        CalculadoraDigital c = new CalculadoraDigital();
        System.out.println("Escoga el número de la operación que desea realizar \n1.Sumar \n2.Restar \n3.Multiplicar \n4.Dividir");
        Integer n = scanner.nextInt(); 
        
        while (dato1){
            System.out.println("Ingrese el primer valor: ");
            valor1 = scanner.next();
            dato1 = c.isNumeric(valor1);
            
        }
        double x = Double.parseDouble(valor1);
        
        while (dato2){
            System.out.println("Ingrese el segundo valor: ");
            valor2 = scanner.next();
            dato2 = c.isNumeric(valor2);
            
        }
        double y = Double.parseDouble(valor2);
        
        switch(n){
            case 1:
                System.out.println(c.sumar(x, y));
                break;
            case 2:
                System.out.println(c.restar(x, y));
                break;
            case 3:
                System.out.println(c.multiplicar(x, y));
                break;
            case 4:
                if (y == 0){
                    System.out.println("El segundo valor debe ser distinto de cero");
                }
                else {
                    System.out.println(c.dividir(x, y));
                }
                break;
        }
    }
    
}
