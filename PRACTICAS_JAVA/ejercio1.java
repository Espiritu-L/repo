package PRACTICAS_JAVA;

import java.util.Scanner;

public class ejercio1 {
    public static void main(String[] args){

        Scanner e = new Scanner(System.in);
        String no, apellidos;
        int edad, ci;
        char se;
        float nota;
        
        System.out.print("\n Ingrese nombre: ");
        no = e.nextLine();

        System.out.print("\n Apellidos: ");
        apellidos = e.nextLine();

        System.out.print("\n Edad: ");
        edad = e.nextInt();

        System.out.print("\n CI: ");
        ci = e.nextInt(); 

        System.out.print("\n Sexo M o F: ");
        se = e.next().charAt(0);

        System.out.print("\n Nota: ");
        nota = e.nextFloat();
        System.out.print("\n IMPRIMIENDO DATOS DEL ESTUDIANTE\n"+"--------------------------");

        System.out.print("\n Nombre: "+no);
        System.out.print("\n Apellidos: "+apellidos);
        System.out.print("\n Edad: "+edad);
        System.out.print("\n CI: "+ci);
        System.out.print("\n Sexo: "+se);
        System.out.print("\n Nota: "+nota);
        e.close();

    }
    
}
