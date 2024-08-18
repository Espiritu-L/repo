package ejercicios_java;

import java.util.Scanner;
//import java.Math.Scanner;
public class tarea {
    public static void main(String[] argas){
    
      float a=0, b=0, c=0, area=0, pr=0, h =0;
        Scanner e = new Scanner(System.in);
        System.out.print("\n Ingrese lado a: ");
        a = e.nextFloat();
        System.out.print("\n Ingrese lado b: ");
        b = e.nextFloat();
        System.out.print("\n Ingrese lado c: ");
        c = e.nextFloat();
        if(a+b > c && a+c > b && b+c > a){
            if(a==b && c!=a){
                h = (float)Math.sqrt(a*a -(c/2)*(c/2));
                area = (c/2) *h;
                pr = a + b+ c;
                System.out.print("\n Lados iguales: a: " + a +" b: "+b+" distinto: "+c);
                System.out.print("\n area: "+area);
                System.out.print("\n perimetro: "+pr);
            } else  if(a==c && b!=a){
                h = (float)Math.sqrt(a*a -(c/2)*(c/2));
                area = (c/2) *h;
                pr = a + b+ c;
                System.out.print("\n Lados iguales: a: " + a +" c: "+c+" distinto: "+b);
                System.out.print("\n area: "+area);
                System.out.print("\n perimetro: "+pr);
            } else  if(b==c && b!=a){
                h = (float)Math.sqrt(b*b -(c/2)*(c/2));
                area = (c/2) *h;
                pr = a + b+ c;
                System.out.print("\n Lados iguales: b: " + b +" c: "+c+" distinto: "+a);
                System.out.print("\n area: "+area);
                System.out.print("\n perimetro: "+pr);
            }

        }else{
            System.out.println("\n No es un triangulo");
        }
        e.close();
    }
}
