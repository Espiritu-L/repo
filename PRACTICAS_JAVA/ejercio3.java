package PRACTICAS_JAVA;

import java.util.Scanner;

public class ejercio3 {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);

        String no, dir, cargo;
        int ci, nds;
        float sueldo;

        System.out.print(" INGRESA LOS DATOS DEL EMPLEADO ");
        System.out.print("\n Nombre completo: "); no = e.nextLine();
        System.out.print("\n Direccion: "); dir = e.nextLine();
        System.out.print("\n Cargo: "); cargo = e.nextLine();
        System.out.print("\n CI: "); ci = e.nextInt();
        System.out.print("\n Numero de Seguro: "); nds = e.nextInt();
        System.out.print("\n Sueldo: "); sueldo = e.nextFloat();
        System.out.print("\n IMPRIMIENDO DATOS\n");
        System.out.print("\n : Nombre: "+no);
        System.out.print("\n Direccion: "+dir);
        System.out.print("\n Cargo : "+cargo);
        System.out.print("\n CI: "+ci);
        System.out.print("\n Numero de Seguro: "+nds);
        System.out.print("\n : Sueldo: "+sueldo+" Bs");
        
        e.close();
    }
}