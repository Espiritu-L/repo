package ejercios_inicial_java;

import java.util.Scanner;

public class tabDeMulti {
        public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int b, ex, i=1, r = 1;
        System.out.println("DIGITE LA BASE: ");
        b = e.nextInt();
        System.out.println(" DIGITE EL EXPONENTE: ");
        ex = e.nextInt();
        while (i  <= ex) {
            r = b * r;
            i++;
        }
        System.out.printf("  RESULTADO  =  "+r);
        /*   //serie fibonacci
        int n, a=0, b=1, t=0, i=0;
        System.out.printf("Digite un numero: ");
        n = e.nextInt();
        while (i < n) {
            System.out.printf(" "+a+" ");
            t = a + b;
            a = b; b = t;
            i++;
        }
         */     /*       //factorial de un numero
        int n, i = 1, f =1;
        System.out.printf(" Ingrese un numero: ");
        n = e.nextInt();
        while (i<=n) {
            f = f*i;
            i++;
        }
        System.out.printf(" Factorial de "+n+" = "+f);
         *//* 
        //ingresar un numero y contar sus digitos e imprime la suma de los digitos
        int n, ud=0, c=0, s = 0;
        n = e.nextInt();
        while(n!=0){
            ud = n % 10;
            s = s + ud;
            c++;
            n = n / 10;
        }
        System.out.printf(" Numero de digitos:  " + c);
        System.out.printf(" \nSuma de las digitos:  "+s);
        */

        /*
        int n, m, i =1;
        System.out.printf(" \nDe que numero desea ver la tabla: ");
        n = e.nextInt();

        System.out.printf(" Hasta que numero desea ver la tabla: ");
        m  = e.nextInt();
        //tabla de n numero hasta n numero 
        
        while (i <= m) {
           // r = i * n;
            System.out.println(i + " * " + n +" = " + i*n);
            i++;
        }
        */
        /* 
        //pedir al usuario numeros y almacenar la suma si ingresa 0 
        int n, s = 0;
        System.out.printf("\nIngrese un numero: ");
        n = e.nextInt();
        while (n!=0) {
            s = s + n;
            System.out.printf("\nIngrese un numero: ");
            n = e.nextInt();

        }
        System.out.printf("\nSuma: "+s);
        */
        e.close();
    }
}
