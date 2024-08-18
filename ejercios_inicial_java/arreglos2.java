package ejercios_inicial_java;

import java.util.Scanner;

public class arreglos2 {
        public static void main(String[] argst){
        Scanner e = new Scanner(System.in);
        int v[], n;
        System.out.print("\n  INGRESE LA DIMENSION DEL ARRAY: ");
        n = e.nextInt();
        v = new int[n];
        System.out.print("\n  LLENADO DEL ARREGLO\n\n");
        for(int i = 0; i < n; i++){
            v[i] = (int)(Math.random()*20);
            System.out.print(" - "+v[i]);
 
        }
        System.out.print("\n\n INGRESE UN NUMERO A BUSCAR: ");
        int a, i = 0; 
        a = e.nextInt();
        while (i < n && a != v[i]) {
            i++;
        }

        if(i == n || a != v[i]){
            System.out.println(" NO SE ENCUNTRA EN EL ARREGLO EL NUMERO "+a);
        }else{
            System.out.println("\n EL NUMERO "+a+" SE ENCUENTRA EN LA POS.: "+i+"\n\n");
        }
        e.close();
    }
}
