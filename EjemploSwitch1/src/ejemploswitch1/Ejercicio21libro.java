/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploswitch1;

import java.util.Scanner;

/**
 *
 * @author rodica.pop
 */
public class Ejercicio21libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio2.11 libro
        
        int dia;
        String textoDia; //String es una clase con atributos y métodos, no es 
        //variable. Lo usamos para guardar varios caracteres de texto
        
        System.out.println("Introduce el día de la semana (1 a 7)");
        dia = new Scanner(System.in).nextInt();
        
        textoDia = switch (dia){
            case 1 ->{
                yield "Lunes";
            }
            case 2 ->{
                yield "Martes";
            }
            case 3 ->{
                yield "Miércoles";
            }
            case 4 ->{
                yield "Jueves";
            }
            case 5 ->{
                yield "Viernes";
            }
            case 6 ->{
                yield "Sábado";
            }
            case 7 ->{
                yield "Domingo";
            }
            default ->{
                yield "Error";
            }
        }; //Cerramos con punto y coma porque es una instruccion de asignación
            
            if(textoDia.equals("Error")){
            System.out.println("Error: el dia introducido es incorrecto");
        }else{
                System.out.println("Dia: " +textoDia);
                }
                       
                
        }
            
          
        
        
        
        
        
        
        
        
    }
    
}
