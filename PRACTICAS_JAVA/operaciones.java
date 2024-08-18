package PRACTICAS_JAVA;

import java.util.Scanner;

/*1.- realizar un programa que permita calcular el area de un rectangulo, circulo,
 * paralelipedo y el volumen de un paralelipedo el programa debe manejarse de menu. 1 rectangulo, 
 * 2 circulo, 3 paralelipedo, 4salir
 */
public class operaciones {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        float b=0, h=0, p=0, r=0, ar=0, pr=0, ac=0, pc=0, vp=0, pi = 3.1416f;
        //double ac = 0, pc = 0; 

        int op;// para menu
        do{
            System.out.print("\n\n 1.- Rectangulo");
            System.out.print("\n 2.- Circulo");
            System.out.print("\n 3.- Paralelipipedo");
            System.out.print("\n 4.- Salir");

            System.out.print("\n    Elija una opc.: ");

            op = e.nextInt();
            /*
            if(op == 1){
                System.out.print("\n ingrese base: ");
                b = e.nextFloat();
                System.out.print("\n ingrese altura: ");
                h = e.nextFloat();
                pr = 2*b + 2*h;
                ar = b* h;

                System.out.print("\n Perimetro del [Rectangulo]: "+pr);
                System.out.print("\n Area del [Rectangulo]: "+ar);
            }
            else if(op == 2){
                System.out.print("\n Ingrese radio: ");
                r = e.nextFloat();

                ac = pi * r *r;
                pc = 2*pi*r;
                System.out.print("\n Area del [Circulo]: "+ac);
                System.out.print("\n Perimetro del [Circulo]: "+pc);
            } 
            else if(op == 3){
                System.out.print("\n Ingrese la base: ");
                b = e.nextFloat();
                System.out.print("\n Ingrese la altura: ");
                h = e.nextFloat();
                System.out.print("\n Ingrese la profundidad: ");
                p = e.nextFloat();

                vp = b*h*p;
                System.out.print("\n Volumen: "+ vp);
            }*/
            switch (op) {
                case 1:
                    System.out.print("\n ingrese base: ");
                    b = e.nextFloat();
                    System.out.print("\n ingrese altura: ");
                    h = e.nextFloat();
                    pr = 2*b + 2*h;
                    ar = b* h;
                    System.out.print("\n Perimetro del [Rectangulo]: "+pr);
                    System.out.print("\n Area del [Rectangulo]: "+ar);
                    break;
                case 2:
                    System.out.print("\n Ingrese radio: ");
                    r = e.nextFloat();

                    ac = pi * r *r;
                    pc = 2*pi*r;
                    System.out.print("\n Area del [Circulo]: "+ac);
                    System.out.print("\n Perimetro del [Circulo]: "+pc);
                    break;
                case 3:
                    System.out.print("\n Ingrese la base: ");
                    b = e.nextFloat();
                    System.out.print("\n Ingrese la altura: ");
                    h = e.nextFloat();
                    System.out.print("\n Ingrese la profundidad: ");
                    p = e.nextFloat();
                    vp = b*h*p;
                    System.out.print("\n Volumen: "+ vp);
                    break;

                case 4:
                    System.out.println(" FIN DEL PROGRAMA...!!\n");
                   break;
            }
                
        }while (op!=4);
        
        e.close();
    }
}
