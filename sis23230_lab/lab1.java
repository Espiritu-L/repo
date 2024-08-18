package sis23230_lab;

import java.util.Scanner;

public class lab1 {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int n = 0, primo = 1;
        System.out.print("\n Cantidad que desea de numeros primos: ");
        n = e.nextInt();

        for(int i = 2; i <= n||(primo <= n); i++){
            int cont = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    cont++;
                }
            }
            if(cont == 2){
                System.out.print(" "+i);
                primo++;
            }
        }
        e.close();
    }
    
}
