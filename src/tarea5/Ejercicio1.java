/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea5;

import java.util.Scanner;

/**
 *
 * @author blass
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        int horas=0;  
        int horasExtras=0; 
        double  precio; 
        double precioExtra; 
        double sueldo=0; 
         
        long k;
        do{
            System.out.println("Ingrese el precio por hora del trabajo");
            Scanner precioporHora = new Scanner(System.in);
            precio =  precioporHora.nextDouble();
           for(int i=1; i<=4; i++ ){
               System.out.println("Ingrese las horas trabajadas del empleado en la semana " + i +": ");
               Scanner hora = new Scanner(System.in);
               horas = hora.nextInt();
               
               if(horas>40){
                   precioExtra = precio*1.5;
                   sueldo = sueldo + (precioExtra * horas);
               }else{
                   sueldo = sueldo +  (precio * horas);
               }
               
           }
            System.out.println("El sueldo mensual del trabajador = " + sueldo);
            System.out.println("Desea calcular el sueldo mensual de otro trabajador" + "/n" + "  Presione S para continuar y N para salir");
            Scanner salida = new Scanner(System.in);
            k= salida.nextLong();
        }while(k !='N');
            
        
        
    }
    
}
