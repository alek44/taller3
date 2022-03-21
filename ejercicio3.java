/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import java.util.Scanner;

/**
 *
 * @author asus
 */

        
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int comision = 200;
        int[] semana;
        int sumsemana=0;
        float total;
        int subtotal=0;
        int n;
        semana = new int[8];
        System.out.println("***PAGO POR COMISION***");
        System.out.println("a cuantos vendedores se les pagara?: ");
        n = entrada.nextInt();
        for (int i = 1; i<=n; i++) {
            System.out.println("");
            for (int x = 1; x <= 7; x++ ){
                System.out.println("ingrese cuanto gano el dia #"+x+" el vendedor #"+i);
                semana[x] = entrada.nextInt();
            }
        }
        
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=7; j++){
                sumsemana += semana[j];
            }
        
            System.out.println("incremento en categoria A del vendedor #"+i+":");
            if (sumsemana<=3000){
                subtotal = (sumsemana*14) / 100;
                total = sumsemana + subtotal + comision;
                System.out.println("su pago en esta semana es: "+total);
            }
            else{
                if (sumsemana<=4000) {
                    subtotal = ((sumsemana*9) / 100);
                    total = sumsemana + subtotal  + comision;
                    System.out.println("su pago en esta semana es: "+total);
                }
                }
                if (sumsemana>=5000) {
                    if (sumsemana<=7000){
                        subtotal = (sumsemana*16) / 100;
                        total = sumsemana + subtotal + comision;
                        System.out.println("su pago en esta semana es: "+total);
                    }
                }
                
                    if (sumsemana>7000){
                        subtotal = ((sumsemana*19) / 100);
                        total = sumsemana + subtotal + comision;
                        System.out.println("su pago en esta semana es: "+total);
                    }
            
            System.out.println("incremento en categoria B del vendedor #"+i+":");
            if (sumsemana<=5000){
                subtotal = (sumsemana*16) / 100;
                total = sumsemana + subtotal + comision;
                System.out.println("su pago en esta semana es: "+total);
            }
                else{
                        subtotal = ((sumsemana*9) / 100);
                        total = sumsemana + subtotal + comision;
                        System.out.println("su pago en esta semana es: "+total);
                        }
                
                if (sumsemana>=10000) {
                    if (sumsemana<=15000){
                        subtotal = ((sumsemana*19) / 100);
                        total = sumsemana + subtotal + comision;
                        System.out.println("su pago en esta semana es: "+total);
                    }
                }
                if (sumsemana>=15000){
                    subtotal = ((sumsemana*22) / 100);
                    total = sumsemana + subtotal + comision;
                    System.out.println("su pago en esta semana es: "+total);
                    }
            sumsemana = 0;
            System.out.println("");
    }

    }
}
