package clasesSis_2330;

import java.util.Scanner;

public class tarea_ciclos {
    public static void main(String[] args){

        Scanner e = new Scanner(System.in);

        int n, i = 0;
        //int c = 0;
        n = e.nextInt();

// tabla china
        do{

            i++;
        }while(i <= n);
// contar digitos
        // con ciclo for infinito
        /* 
        for(;;){

            int d = n % 10; c++;
           // System.out.println(" "+d);
            n/=10;

            if(n==0){

                break;

            }
        }
        System.out.println("-> "+c); */
        
        /*
        // con while
        while (n!=0) {

            int d = n % 10; c++;

            n/=10;
            
        }
        System.out.println("-> "+c);*/
        e.close();
    }
}
