package ejercios_inicial_java;

import java.util.Scanner;

public class condicionales1 {
      public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        float n1, n2, n3, s;
        System.out.println("DIGITE SUS NOTAS");
 
        n1 = e.nextFloat();
        n2 = e.nextFloat();
        n3 = e.nextFloat();

        n1 = n1 * 0.30f;
        n2 = n2 * 0.30f;
        n3 = n3 * 0.40f;
        s = n1 + n2 + n3;

        if(s>=0 && s<=34){
            System.out.println("REPROBADO ---> NOTA: "+s);
        }else{
            if(s >= 35 && s <= 50){
                System.out.println("REVALIDA ---> NOTA: "+s);
            }else{
                if(s >= 51 && s <= 100){
                    System.out.println("APROBADO ---> NOTA: "+s);
                } else{
                    System.out.println("USTED TIENE PROBLEMAS ---> NOTA: "+s);
                }
               
            }
        }
        e.close();
    }
}
