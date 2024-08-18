package clasesSis_2330;

import java.util.Scanner;

public class contardigitos {

    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int n; n = e.nextInt();

        for(int i=0; i < 9; i++){
            int m = n, cont = 0;
            while (m!=0) {
                int d = m % 10;
                if(i  == d){
                    cont++;
                }

                if(cont != 0){
                    }
                m = m / 10;
            }
        }

        e.close();
    }
  
}
