package ejercicios_java;

import java.util.Scanner;

public class pago {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int com = 0, nb = 0, re = 0;
     // ingresera 3 lados del dtriangulo e imprimir su area sup e indicar que tipo triangulo es
        // e indicar sus caracteristicas
        /*
         * el duenio de un mercado
         * requiere un programa para calcular cuantos billestes de 200 100 50 20
         * y 10 y cuantas monedas de 5 2 1 debe cobrar al cliente por la compra realizada
         */
        System.out.print("\n Monto a pagar: ");
        com = e.nextInt();
        nb = com / 200;
        if(nb > 0){
            System.out.print("\n Cobrar "+nb+" Billete de 200");
        }
        re = com % 200;
        nb = re  / 100;
        if(nb > 0){
            System.out.print("\n Cobrar "+nb+" Billete de 100");
        }
        re = re % 100;
        nb = re / 50;
        if(nb > 0){
            System.out.print("\n Cobrar "+nb+" Billete de 50");
        }
        re = re % 50;
        nb = re / 20;
        if(nb > 0){
            System.out.print("\n Cobrar "+nb+" Billete de 20");
        }
        re = re % 20;
        nb = re / 10;
        if(nb > 0){
            System.out.print("\n Cobrar "+nb+" Billete de 10");
        }
        re = re % 10;
        nb = re / 5;
        if(nb > 0){
            System.out.print("\n Cobrar "+nb+" monedas de 5");
        }
        re = re % 5;
        nb = re / 2;
        if(nb > 0){
            System.out.print("\n Cobrar "+nb+" monedas de 2");
        }
        re = re % 2;
        nb = re / 1;
        if(nb > 0){
            System.out.print("\n Cobrar "+nb+" monedas de 1");
        }
   
        e.close();
    }
    
}
