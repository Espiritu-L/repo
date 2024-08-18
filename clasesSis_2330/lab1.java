package clasesSis_2330;

import java.util.Scanner;

public class lab1{
    public static void main (String[] args) { 
        int numero, digito, invertido=0; 
        System.out.println("Escriba un numero entero"); 
        Scanner teclado = new Scanner(System.in); 
        numero=teclado.nextInt(); 
        while (numero>0) { 
       //System.out.println("numero: "+numero); 
       digito=numero%10; 
       numero=numero/10; 
       invertido = invertido * 10 +digito; 
       } 
       System.out.println("El numero invertido es: "+invertido); 
       teclado.close();
       } 

}
