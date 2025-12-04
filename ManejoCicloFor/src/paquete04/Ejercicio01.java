/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author UTPL
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        String mensaje = "";
        int total1 = 0; 
        int total2 = 0;
        int total3 = 0; 
        int total4 = 0;
       
        for (int i = 30; i >= 10; i--) {
            int a = i;
            int b = 2 * i;
            int c = 3 * i;
            int d = 4 * i;

           mensaje = String.format("%s\n%d-%d-%d-%d", mensaje, a, b, c, d);

            total1 = a + total1;
            total2 = b  + total2;
            total3 = c + total3;
            total4 = d  + total4;
        
        }

        mensaje = String.format("%s%nTotales = %d-%d-%d-%d\n", mensaje, 
                total1, total2, total3, total4);

        System.out.printf(mensaje);
    }
}
