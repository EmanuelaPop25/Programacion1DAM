/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capicua2;

import java.util.Scanner;

/**
 *
 * @author rodica.pop
 */
public class Capicua2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // AUTOR: RODICA EMANUELA POP
        
       //Declaro variable String para el número que el usuario introduce
        String numero;
        //Mensaje para pedir número y el Scanner
        System.out.println("Introduzca un número entre 0 y 9999");       
        numero = new Scanner(System.in).nextLine();
        
        /*Declaro variable tipo StringBuilder( nombrandola invertido )para poder
        invertir la cadena del número con el método reverse      
        */        
        StringBuilder invertido = new StringBuilder(numero).reverse();
        /*Aqui declaro otra variable String para volcar la variable StringBuilder 
        en ella para poder hacer la comparación */
        String sInvertido = invertido.toString();
        
        /*Comparamos el número introducido por el usuario con el mismo número
        invertido para comprobar si es capicúa o no.        */
        
        if(numero.equals(sInvertido)){
            System.out.println("El número es capicúa");
        }else{
            System.out.println("El número no es capicúa");
        }
        
        
        
    }
    
}
