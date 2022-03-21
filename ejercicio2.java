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

        
public class ejercicio2 {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int n;
        int[] newsaldo;
        int[] saldo;
        int[] abonos;
        int[] deduccion;
        int[] limite;
        System.out.println("cuantos clientes desea calcular?: ");
        n = entrada.nextInt();
        saldo = new int[n];
        abonos = new int[n];
        deduccion = new int[n];
        limite = new int[n];
        newsaldo = new int[n];
   
        for (int i = 1; i<=n; i++){
            System.out.println(" *** procesamiento de datos #"+i+" ***");
            System.out.println("ingrese su saldo al inicio del mes: ");
            saldo[i-1] = entrada.nextInt();
            System.out.println("ingrese el total de abonos en el mes: ");
            abonos[i-1] = entrada.nextInt();
            System.out.println("el total de deducciones aplicadas a su cuenta al mes: ");
            deduccion[i-1] = entrada.nextInt();
            System.out.println("el limite de credito permitido es?: ");
            limite[i-1] = entrada.nextInt();
            
        }
        
        for (int x = 1; x<=n; x++) {
            newsaldo[x-1] = (saldo[x-1] + abonos[x-1]) - deduccion[x-1];
            System.out.println("cliente #"+x+" su balance es: ");
            System.out.println(""+newsaldo[x-1]);
            if (newsaldo[x-1]>limite[x-1]){
                System.out.println("para el cliente #"+x+", se excedio el limite de su credito");
            }
        }
        
    }
}
