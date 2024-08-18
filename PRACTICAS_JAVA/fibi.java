package PRACTICAS_JAVA;

import java.util.Scanner;

public class fibi {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int a = 0, b = 1, t = 0, n;
        System.out.print("\n  Elementos a imprimmir (Serie Fibonacci): ");
        n = e.nextInt();
        // 0 1 1 2 3 5 8
        int f=1;
        for(int i=0; i <n; i++){
            System.out.print("  "+a);
            t = a + b;
            a = b;
            b =t;
            if(f < n){
                System.out.print(" ,"); f++;
            }
        }

        e.close();
    }
    
}
