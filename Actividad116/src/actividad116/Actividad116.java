/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad116;

import java.util.Scanner;

/**
 *
 * @author rodica.pop
 */
public class Actividad116 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Rodica Emanuela Pop
        //Vamos a calcular cuantas horas, minutos y segundos hay en el numero de
        //segundos que da el usuariollll
        
        int horas, minutos, segundos, datoSegundosTotales;
        
        System.out.println("Introduzca los segundos totales:");
        Scanner sc = new Scanner(System.in);
        datoSegundosTotales = sc.nextInt();
        
        minutos = datoSegundosTotales/60;
        //usamos el modulo para que nos de el resto de la divison aunque sean enteros
        segundos = datoSegundosTotales%60;
        horas = minutos/60;
        minutos %=60;
        
        System.out.println("Corresponde a: " + horas + " horas " + minutos + " minutos " + segundos + " segundos ");
        
        
    }
    
}
