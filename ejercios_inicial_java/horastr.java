package ejercios_inicial_java;

import java.util.Scanner;

public class horastr {
        public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int n, ht = 0;
        System.out.printf(" Ingresea las horas trabajadas: ");
        n = entrada.nextInt();
        if(n>=1 && n<=40){
          ht = n * 16; 
          System.out.printf(" Las horas trabajadas son: "+n+" Y sueldo: "+ht);
        }else if(n > 40){
            ht = (40 * 16) + ((n-40)*20);
            System.out.printf(" Las horas trabajadas son: "+n+" Y sueldo: "+ht);
        } else{
            System.out.println("Usted no tiene registro");
        }
        /* 
        int ht, s, d, h;
        System.out.printf("Digete las horas");
        ht = entrada.nextInt();

        s = ht / 168;
        d = ht % 168 / 24;
        h = ht % 24;

        System.out.println("el equivalente es :");
        System.out.println("semanas: "+s);
        System.out.println("dias: "+d);
        System.out.println("horas: "+h);
        */
        entrada.close();
    }
}
