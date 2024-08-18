package ejercicios_java;

import java.util.Scanner;

public class digitos {
    public static void main(String[] args){

        Scanner e = new Scanner(System.in);
        int n, m,k, d, c = 0;

        n = e.nextInt(); m = e.nextInt();

        while (n!=0) {

            d = n % 10;

            k = m;

            while (k!=0) {
                int u =  k % 10;

                if(d == u){
                    c++;
                }
                
                k/=10;
            }
            System.out.println("\n EL DIGITO "+d+" SE REPITE "+c+"VECES");
            n/=10;
        }

        e.close();
    }
}
