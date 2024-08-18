package ejercios_inicial_java;

import java.util.Scanner;

public class ordenar3numeros {
        public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int a, b, c;

        System.out.printf(" Ingrese tres numeros: ");
        a = e.nextInt();
        b = e.nextInt();
        c = e.nextInt();

        if((a > b) && (b > c)){
            System.out.printf( " Ordenado: "+a+" - "+b+" - "+c); 
        } else if((a > c) && (c > b)){
            System.out.printf( " Ordenado: "+a+" - "+c+" - "+b); 
        } else if((b > a)&&(a > c)){
            System.out.printf( " Ordenado: "+b+" - "+a+" - "+c); 
        } else if((b > c)&&(c > a)){
            System.out.printf( " Ordenado: "+b+" - "+c+" - "+a); 
        } else if((c > a)&&(a > b)){
            System.out.printf( " Ordenado: "+c+" - "+a+" - "+b); 
        } else if((c > b)&&(b > a)){
            System.out.printf( " Ordenado: "+c+" - "+b+" - "+a);
        }else{
            System.out.println(" Los numeros son iguales: "+a+" = "+b+" = "+c);
        }
            
            

        /*un numero es multiplo de 10 se el recidio es 0 "cero" 
         * ej:
         *  n = 100; residio = n % 10; residio = 0; es multiplo de 10
        */
        /* 
        System.out.println("BIENVENIDO");
        if(a > b){
            System.out.printf("El numero mayor es: "+a);
        } else{
            System.out.printf("El numero mayor es: "+b);
        }
        *//*
        if(a%2==0 && b%2==0){
            System.out.printf(a+" y "+b+" Son pares ");
        }else if(a%2!=0 && b%2!=0){
            System.out.printf(a+" y "+b+" Son impares ");
        } else
        System.out.printf("Numeros no compatibles");
        */
        e.close();
    }
}
