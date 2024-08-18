package ejercios_inicial_java;

import java.util.Scanner;

public class calculos {
        public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        
        int op, d = 1000, i, r, da;

        do{
            System.out.printf("\n---BIENVENIDO AL CAJARO AUTOMATICO---\n\n"+
            "\t1.- RETIRAR DINERO \n"+
            "\t2.- AGREGAR DINERO A CUENTA\n"+
            "\t3.- SALIR \n\n"+
            " ELIJA UNA OPCION ");

            op = e.nextInt();
            switch (op) {
                case 1: System.out.println("INGRESE LA CANTIDAD A RETIRAR");
                        r = e.nextInt();
                        da = d - r;
                        System.out.println("SALDO ACTUAL: "+da);
                         break;
                case 2: System.out.printf("INGRESE LA CANTIDAD A AGREGAR");
                        i = e.nextInt();
                        da = d + i;
                        System.out.println("SALDO ACTUAL: "+da); 
                        break;
                case 3:
                System.out.println("   VUELVA PRONTO");
                        break;
            }
        }while(op!=3);

        /*
        int n1, n2, su, re, mu;
        float di;
        char op;
        
        System.out.println(" Digite la operacion a realizar: ");
        op = e.next().charAt(0);
        switch (op) {
            case 's':
            case 'S': System.out.printf(" Digite dos numeros: ");
                      n1 = e.nextInt();
                      n2 = e.nextInt();
                      su = n1 + n2;
                      System.out.printf(" Suma: "+n1+" + "+n2+" = "+su);
                      break;

            case 'r':
            case 'R': System.out.printf(" Digite dos numeros: ");
                      n1 = e.nextInt();
                      n2 = e.nextInt();
                      re = n1 - n2;
                      System.out.printf(" Resta: "+n1+" - "+n2+" = "+re);
                      break;

            case 'm':
            case 'M': System.out.printf(" Digite dos numeros: ");
                      n1 = e.nextInt();
                      n2 = e.nextInt();
                      mu = n1 * n2;
                      System.out.printf(" Producto: "+n1+" * "+n2+" = "+mu);
                      break;

            case 'd':
            case 'D': System.out.printf(" Digite dos numeros: ");
                      n1 = e.nextInt();
                      n2 = e.nextInt();
                      if(n2!=0){
                        di = (float) n1 / n2;
                        System.out.printf(" Division: "+n1+" / "+n2+" = "+di);
                      }else{
                        System.out.printf("NO ES POSIBLE LA DIVISION ENTRE CERO");
                      }
                      break;

            default: System.out.println("OPCION NO VALIDA...");
        }*/
        e.close();
    }
}
