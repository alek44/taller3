package taller3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class ejercicio4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String[] E;
        int[] H;
        float[] T;
        int sub=40;
        int n;
        int j=0;
        float resu =0;
        float sueldo=0;
        float sueldo1=0;
        float newtarifa= (float) 1.5;
        System.out.println("  ***SUELDO BRUTO***");
        System.out.println("cuantos trabajadores son?: ");
        n = entrada.nextInt();
        E = new String[n];
        H = new int[n];
        T = new float[n];        
        for (int x=1; x<=n; x++){
            System.out.println("ingrese el nombre del trabajador #"+x+" :");
            E[x-1] = entrada.next();
            System.out.println("cuantas horas trabajo este empleado?: ");
            H[x-1] = entrada.nextInt();
            System.out.println("cual es su tarifa por hora?: ");
            T[x-1] = entrada.nextInt();
        }
        
        for (int i=1; i<=n; i++){
            if (H[i-1]<=40){
                System.out.println("el sueldo bruto del trabajador "+E[i-1]+" es: ");
                sueldo = H[i-1] * T[i-1];
                sueldo = sueldo * 52;
                System.out.println(""+sueldo);
            }
            else {
                System.out.println("el sueldo bruto por +40 horas, del trabajador "+E[i-1]+" es: ");
                if (H[i-1]>sub) {
                j = (sub - H[i-1]) * -1;
                System.out.println("el trabajador tuvo "+j+" horas extras");
                resu = (float) (((H[i-1] - j) * T[i-1]) + ( j * (newtarifa * T[i-1])));
                System.out.println("con una tarifa de: "+resu);
                sueldo1 = resu*52;
                System.out.println(""+sueldo1);
                }
            }
    }
    }
}
