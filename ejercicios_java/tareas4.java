package ejercicios_java;

import java.util.Scanner;

public class tareas4 {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int a=0, b=0, c=0;
        float area = 0, pr = 0, s = 0;
        a = e.nextInt();
        b = e.nextInt();
        c = e.nextInt();
        if (a == b || b == c || c == a) {
            System.out.println(" es un triángulo isósceles.");
                pr = a + b +c;
                s = (float)(a+b+c)/2;
                area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println("\n area : "+ area);
                System.out.print("\n perimetro : "+ pr);
                if(a==b){
                    System.out.println(" lados iguales "+a+" y "+b);
                } else if(a==c){
                    System.out.println(" lados iguales "+a+" y "+c);
                }else if(b==c){
                    System.out.println(" lados iguales "+b+" y "+c);
                }else if(b==a){
                    System.out.println(" lados iguales "+b+" y "+a);
                }
         } else 
             System.out.println("No es un triángulo isósceles.");
        
        /*
        System.out.print(" Ingrese la edad: "); n = e.nextInt();
        if(n < 0){
            System.out.println("\n  Error ");
        }else if(n>=0 && n <= 10){
            System.out.println(" Es ninio");
        }else if(n>=11 && n <= 18){
            System.out.println(" Es jovem");
        }else if(n>=19 && n <= 40){
            System.out.println(" Es adulto");
        }else if(n>=41 && n <= 60){
            System.out.println(" Es adulto mayor");
        } else
            System.out.println(" es mayor de edad ");
        */

        /* 
        n = e.nextInt();
        if(n > 0){
            System.out.println(" el numero es positivo");
        }else if(n < 0){
            System.out.println(" el numero es negativo");
        } else{
            System.out.println(" el numero es cero ");
        } 
        */
        e.close();
    }
 }
