import java.util.Scanner;

public class Tpascal {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int f;
        f = e.nextInt();
        for(int i = 0; i < f; i++){
            int cf = 1; 
            for(int b = 1; b <= (f-i); b++){
                System.out.print("  ");
            }

            for(int j = 0; j <= i; j++){
                System.out.print(cf+"   ");
                // actualizando el valor de cf
                cf = cf * (i-j)/(j+1);
            }System.out.println();


        }
        // serie: 0 1 1 2 3 
        System.out.println("serie fibonacci");
        int a=0, b = 1, aux = 0;
        for(int i=0; i < f; i++){
            System.out.print(" "+a);
            aux = a + b;
            a = b; // 0
            b = aux; // 0
        }


        e.close();
    }
    
}
