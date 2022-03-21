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
public class ejercicio1 {
    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int n,totalpro,may;
        float costoso;
        float totalingre;
        int[] vecA;
        float[] vecB;
        int[] vecC;
        
        totalpro = 0;
        totalingre = 0;
        may = 0;
        costoso = 0;
        
        System.out.println("  ***CALCULO DE VENTAS DEL DIA***");
        System.out.println("ingrese la cantidad de productos vendidos en el dia: ");
        n = entrada.nextInt();
        vecA = new int[n];
        vecB = new float[n];
        vecC = new int[n];
        
        for (int x = 1; x <= n; x++){
            System.out.println("    **RECOLLECION DE DATOS**");
            System.out.println("codigo del producto vendido: ");
            vecA[x-1] = entrada.nextInt();
            
            System.out.println("cual es el valor del prodcuto: ");
            vecB[x-1] = entrada.nextFloat();
            
            System.out.println("cantidad vendidas del producto: ");
            vecC[x-1] = entrada.nextInt();
        }
        
        for (int i = 1; i <= n; i++ ) {
            totalpro +=vecC[i-1];
        }
       
        System.out.println("\n");
        System.out.println("el total de productos vendidos en el dia son: ");
        System.out.println(""+totalpro+"\n");
        
        for (int i = 1; i <= n; i++ ) {
            totalingre += (vecB[i-1] * vecC[i-1]);   
        }
        
        System.out.println("el total ingresos de ventas en el dia son: ");
        System.out.println(""+totalingre+"\n");
        
        for (int j = 1; j <= n; j = j+1) {
            for (int k = 1; k <= n; k = k+1) {
                if (vecC[j-1]>vecC[k-1]){
                    may = vecA[j-1];
                }
            }
        }
        
        System.out.println("el producto mas vendido es el codigo: ");
        System.out.println(""+may+"\n");
        
        for (int j = 1; j <= n; j = j+1) {
            for (int k = 1; k <= n; k = k+1) {
                if (vecB[j-1]>vecB[k-1]){
                    costoso = vecB[j-1];
                }
            }
        }
        
        System.out.println("el producto mas costoso vendido es: ");
        System.out.println(""+costoso+"\n");
}
}
