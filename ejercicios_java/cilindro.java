package ejercicios_java;

import java.util.Scanner;

public class cilindro {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        double p = 3.1416f, r=0, a=0,av=0, sv=0;
        int op;
        float b1=0, b2=0, at=0, pt=0,ah=0,aa=0,cc=0,atr=0, ptr=0;
        do{
        System.out.print("\n  1.- Cilindro");
        System.out.print("\n  2.- Trapesio");
        System.out.print("\n  3.- Triangulo");
        System.out.print("\n  4.- Rectangulo");
        System.out.print("\n  5.- Elipse");
        System.out.print("\n  6.- Salir\n  Elija una opc.: ");
        op = e.nextInt();
        switch (op) {
            case 1:
            System.out.print("\n ---CILINDRO---\n Ingrese radio: ");
            r = e.nextFloat();
            System.out.print("\n Ingrese altura: ");
            a = e.nextFloat();
            av =  (float) p * Math.pow(r,2) * a;
            sv =  ((2*p) * Math.pow(r,2)) + ((2*p)*(r*a));
            System.out.println(" Volumen del cilindro: " + av);
            System.out.println(" Superficie del cilindro: " + sv);
                break;
            case 2:
            System.out.print("\n ---TRAPESIO---");
            System.out.print("\n Ingrese base 1: ");
            b1 = e.nextFloat();
            System.out.print("\n Ingrese base 2: ");
            b2 = e.nextFloat();
            System.out.print("\n Ingrese altura: ");
            ah = e.nextFloat();
            System.out.print("\n Ingrese los lados no paralelos a y b: ");
            aa = e.nextFloat(); cc = e.nextFloat();
            at =  (1/2) * (b1 + b2) * ah;
            pt =  b1 + b2 + aa + cc;
            System.out.println(" Area: " + at);
            System.out.println(" Perimetro : " + pt);
                break;
            case 3:
            System.out.print("\n ---TRIANGULO RECTANGULO---");
            System.out.print("\n Ingrese base: ");
            b1 = e.nextFloat();
            System.out.print("\n Ingrese altura: ");
            b2 = e.nextFloat();
            atr = (b1+b2)/2;
            ptr = 3 * b1;
            System.out.println(" Area: " + atr);
            System.out.println(" Perimetro: " + ptr);
                break;
            case 4:
            System.out.print("\n ---RECTANGULO---");
            System.out.print("\n Ingrese base: ");
            b1 = e.nextFloat();
            System.out.print("\n Ingrese altura: ");
            b2 = e.nextFloat();
            atr = b1*b2;
            ptr = (b1*2) + (b2*2);
            System.out.println(" Area: " + atr);
            System.out.println(" Area: " + ptr);
                break;
            case 5:
            System.out.print("\n ---ELIPSE---");
            System.out.print("\n Ingrese semieje 1: ");
            b1 = e.nextFloat();
            System.out.print("\n Ingrese semieje 2: ");
            b2 = e.nextFloat();
            atr =(float) p * b1 * b2;
            System.out.println(" Area: " + atr);
                break;
            case 6:
            System.out.println(" Fin del programa...!!!\n");
                break;
        }
    }while(op!=6);
        e.close();
    }
}
