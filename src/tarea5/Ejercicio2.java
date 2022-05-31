/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea5;

import javax.swing.JOptionPane;

/**
 *
 * @author blass
 */
public class Ejercicio2 {
       public static void main(String[] args) {
        int Naprobados=0;
        int i,nro1,nro2,nro3;
        String cadena;
       
            nro1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero : "));
            nro2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero : "));
            nro3=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero : "));

            if((nro1+nro2)== nro3 || (nro2+nro3)==nro3 || (nro1+nro3)==nro3){
                cadena="Iguales\n";
            }
            else{
                 cadena="Distintas\n";
            }
        
        //Ahora mostraré en una ventana emergente todos los calculos solicitados
        

        JOptionPane.showMessageDialog(null,cadena );
    }
}
