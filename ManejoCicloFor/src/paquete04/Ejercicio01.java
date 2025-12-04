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
       
        for (int i = 30; i >= 10; i--) { /* este ciclo for se usa para asignar
                                            los valores iniciales de la numeración,
                                            como empieza en 30, se le asignarará
                                            como valor inicial, e irá disminuyendo
                                            hasta llegar al 10 que va a ser el final
                                         */
            
            int a = i;  // aqui i será el valor de "a" a=30, luego por la disminución del ciclo for
                        // i va a valer 29, por lo que a iría a valer 29 tmb y asi hasta llegar a 10
            int b = 2 * i; // luego para las demás columnas  se irá multiplicando hasta el 4
            int c = 3 * i;
            int d = 4 * i;

           mensaje = String.format("%s\n%d-%d-%d-%d", mensaje, a, b, c, d);
           // aqui se irá acumulando la cadena

            total1 = a + total1;
            total2 = b  + total2;
            total3 = c + total3;
            total4 = d  + total4;
        // acá van a sumarse todos los valores resultantes acorde a "a,b, c y d"
        }

        mensaje = String.format("%s%nTotales = %d-%d-%d-%d\n", mensaje, 
                total1, total2, total3, total4);

        System.out.printf(mensaje);
    }
}
