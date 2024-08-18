package ejercios_inicial_java;

import java.util.Scanner;

public class digrepetidos {
        public static void main(String[] args){
    Scanner e = new Scanner(System.in);


    /*pedir un numero al usuario y decir cuantas veces se repite 
     * un decimal ej: n = 455661
     * retornar:
     * EL NUMERO 4 SE REPITE 1 VEZ
     * EL NUMERO 5 SE REPITE 5 VEZ
     * EL NUMERO 6 SE REPITE 2 VEZ
     * EL NUMERO 1 SE REPITE 1 VEZ
     */
    System.out.println("INGRESE UN NUMERO:");
    int n,m;
    n = e.nextInt();
    for(int i = 0; i <= 9; i++){
        int u, c = 0;
        m = n;
        while (m != 0 ) {
            u = m % 10;
            if(i == u){
                c++;
            }
            m = m/10; 
        }
        if(c!=0){
            System.out.print("\n EL NUMERO "+i+" SE REPITE "+c+" VECES\n");
        }
    } 

    e.close();
    }
}
