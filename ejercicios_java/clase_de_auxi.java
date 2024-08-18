package ejercicios_java;

import java.util.Scanner;

public class clase_de_auxi {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        //int n=0, m =0;

        /*Ej 3.- Realizar un tipo de cambio para cierto dinero de acuerdo al
         * siguiente menu
         * 1.- Dolares USD -> (6,96)Bolivianos 
         * 2.- Euros (EUR) -> (7,33)Bolivianos 
         * 3.- Soles (PEN) -> (6,96)Bolivianos 
         * 4.- Reales (BRL) 
         */
        double dinero, b = 0.0;
        int op;
            System.out.print("elija op.: "); op = e.nextInt();
            System.out.print("\n Ingrese su dinero: ");
            dinero = e.nextDouble();
            switch (op){
                case 1:
                b = 6.96 * dinero;
                System.out.printf("\n Se tiene %10.2f Bs ",b);
                break;
                case 2:
                b = 7.33 * dinero;
                System.out.printf("\n Se tiene %.2f Bs "+b);
                case 3:
                b = 1.83 * dinero;
                System.out.printf("\n Se tiene %.2f Bs "+b);
                case 4:
                b = 1.38 * dinero;
                System.out.printf("\n Se tiene %.2f Bs "+b);
                case 5:
                b = 0.02 * dinero;
                System.out.printf("\n Se tiene %.2f Bs "+b);
                break;
                default :
                System.out.printf("\n OPCION INCORRECTA");

            }


        /*
        n = e.nextInt();
        m = e.nextInt();
        if(n % m == 0){
            System.out.print("\n "+n+" es "+ " multiplo de " +m );
        }else{
            System.out.print("\n "+n+" no es "+ " multiplo de " +m );
        }
        */
        
        /* 
        String cad = "";
        System.out.print("\n Ingresar un numero: ");
        n = e.nextInt();
        if(n > 0){
        cad = " El numero es +";
        }else if(n < 0){
        cad = " El numero es - ";
        }else
        cad = " El numero es - ";

        System.out.printf("%s\n",cad);  */

        e.close();
    }
    
}
