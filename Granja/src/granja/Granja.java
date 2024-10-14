/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package granja;

import java.util.Scanner;

/**
 *
 * @author rodica.pop
 */
public class Granja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduzca cantidad de comida comprada: ");
       int comidaDiaria = sc.nextInt();
       System.out.println("Introduzca nº de animales: ");
       int numeroAnimales = sc.nextInt();
       System.out.println("Introduzca kilos/animal: ");
       int kilosAnimal = sc.nextInt();
       
       int consumoAnimal = numeroAnimales*kilosAnimal;
       int kilosAnimalCalculado;
       
       if (numeroAnimales !=0){ 
       kilosAnimalCalculado= numeroAnimales/kilosAnimal;
       }
       
       if(comidaDiaria <consumoAnimal){
            System.out.println("No hay comida suficiente");
            System.out.println("A cada animal le correspondo una ración de " + kilosAnimalCalculado);
       }else{
           System.out.println("Hay comida suficiente");
       }
        
        
        
    }
    
}
