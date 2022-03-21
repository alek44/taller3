/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

/**
 *
 * @author asus
 */
public class ejercicio5 {
    public static void main (String[] args){
        int mayor=0;
        int [] candidatoA ={194,180,221,432,820};
        int [] candidatoB ={48,20,90,50,61};
        int [] candidatoC ={206,320,140,821,946};
        int [] candidatoD = {45,16,20,14,18};
        int [] comuna = new int[6];
        int [] porcent = new int[6];
        int sumatotal=0,sumA=0,sumB=0,sumC=0,sumD=0,comu1=0,comu2=0,comu3=0,comu4=0;
        float porcen1=0,porcen2=0,porcen3=0,porcen4=0;
        
        System.out.println("COMUNA   CANDIDATO A   CANDIDATO B   CANDIDATO C   CANDIDATO D   ");
        for(int k=0; k<5; k++){
            System.out.println((k+1)+"           "+candidatoA[k]+"            "+candidatoB[k]+"            "+candidatoC[k]+"          "+candidatoD[k]);
            
        }
        for (int i=0; i<5;i++){
            sumatotal += candidatoA[i]+ candidatoB[i]+ candidatoC[i]+candidatoD[i];
            sumA+= candidatoA[i];
            sumB+= candidatoB[i];
            sumC+= candidatoC[i];
            sumD+= candidatoD[i];
            porcen1 = sumA*100/sumatotal;
            porcen2= sumB*100/sumatotal;
            porcen3= sumC*100/sumatotal;
            porcen4= sumD*100/sumatotal;
        }
        
        System.out.println("");
        System.out.println("la suma total de votos es: "+sumatotal);
        System.out.println("");
        System.out.println("votos de cantidato A :"+sumA+"; su procentaje de votacion es: "+porcen1);
        if ((sumA>sumB)&&(sumA>sumC)&&(sumA>sumD)){
            System.out.println(" el candidato A tuvo la mayor cantidad de votos");
            if ((porcen1>porcen2) && (porcen1>porcen3) && (porcen1>porcen4)){
                System.out.println("* ***este candidato es el ganador***");
            }
        }
        
        System.out.println("votos de cantidato B :"+sumB+"; su procentaje de votacion es: "+porcen2);
        if ((sumB>sumA)&&(sumB>sumC)&&(sumB>sumD)){
            System.out.println(" el candidato B tuvo la mayor cantidad de votos");
            if ((porcen2>porcen1) && (porcen2>porcen3) && (porcen2>porcen4)){
                System.out.println(" ***este candidato es el ganador***");
            }
        }
        
        System.out.println("votos de cantidato C :"+sumC+"; su procentaje de votacion es: "+porcen3);
        if ((sumC>sumA)&&(sumC>sumB)&&(sumC>sumD)){
            System.out.println(" el candidato C tuvo la mayor cantidad de votos");
            if ((porcen3>porcen1) && (porcen3>porcen2) && (porcen3>porcen4)){
                System.out.println(" ***este candidato es el ganador***");
            }
        }
        
        System.out.println("votos de cantidato D :"+sumD+"; su procentaje de votacion es: "+porcen4);
        if ((sumD>sumA)&&(sumD>sumC)&&(sumD>sumA)){
            System.out.println(" el candidato D tuvo la mayor cantidad de votos");
            if ((porcen4>porcen1) && (porcen4>porcen2) && (porcen4>porcen3)){
                System.out.println(" ***este candidato es el ganador***");
            }
        }
        
        int j=0;
        System.out.println("");
        for ( j=1; j<5; j++){
            comuna[j] += candidatoA[j] + candidatoB[j] + candidatoC[j] + candidatoD[j];
            porcent[j] = comuna[j]*100/sumatotal;
            if (porcent[j]>mayor){
                mayor = j+1;
            }
        }
        System.out.println("* La comuna "+mayor+" tuvo mayor porcentaje de votacion");
    }
}
