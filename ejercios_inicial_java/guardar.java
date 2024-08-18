package ejercios_inicial_java;

import java.util.Scanner;

public class guardar {
    public static void mai(String[] args){
         Scanner e = new Scanner(System.in);
        /* 
        int n;
        System.out.println("Ingrese un numero: ");
        n=e.nextInt();
        System.out.println("\nEl numero ingresado es: "+n);

        float b;
        System.out.println("Digite un numero de tipo real: ");
        b=e.nextFloat();
        System.out.println("\nEl numero ingresado es: "+b);
        */
        String c;
        System.out.println("\nDigete un cadena: ");
        c=e.nextLine();
        System.out.println("\nLa cadena es: "+c);
        char l;
        System.out.println("\nDigite una letra: ");
        l=e.next().charAt(0);
        System.out.println("\nLa letra es: "+l);
        e.close();
    }
}
