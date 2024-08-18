package clasesSis_2330;

import java.util.Scanner;
// formato de entrega: Espiritu_Lopez_Edwin-informe-N ... pdf u otrosss
public class menu {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        int op = 0;
        do{
            System.out.println("\t MENU DE OPCIONES");
            System.out.print(" 1.- MULTIPLOS");
            System.out.print("\n 2.- TABLAS");
            System.out.print("\n 3.- NUMERO DE DIGITOS");
            System.out.print("4.- SALIR");
            System.out.print("\n ELIJA UNA OP.: ");
            op = e.nextInt();
            switch (op) {
                case 1:
                break;
                case 2:
                break;
                case 3:
                break;
                case 4:
                break;
            }

        }while(op!=4);

        e.close();
    }
    
}
