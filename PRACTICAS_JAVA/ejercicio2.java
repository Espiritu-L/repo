package PRACTICAS_JAVA;

import java.util.Scanner;

// datos de un futbolista
public class ejercicio2 {
    public static void main(String[] args){
        Scanner e = new Scanner(System.in);

        String nombre;
        int edad, casaca;
        float peso, altura;
        String genero;
        boolean suspendido;

        System.out.print("  INGRESE LOS DATOS DEL FUTBOLISTA");

        System.out.print("\n Nombre completo: "); nombre = e.nextLine();

        System.out.print("\n Casaca: "); casaca = e.nextInt();

        System.out.print("\n Edad: ");  edad = e.nextInt();

        System.out.print("\n Altura: "); altura = e.nextFloat();

        System.out.print("\n Peso: "); peso = e.nextFloat();

        System.out.print("\n Genero: ");  genero = e.nextLine();
        genero = e.nextLine();

        System.out.print("\n Supendido: "); suspendido = e.nextBoolean();

        System.out.print("\n IMPRIMIENDO LOS DATOS DEL FUTBOLISTA\n-------------------------");
        System.out.print("\n Nombre: "+nombre);
        System.out.print("\n Casaca: "+casaca);
        System.out.print("\n Edad: "+edad);
        System.out.print("\n Altura"+altura);
        System.out.print("\n Peso: "+peso);
        System.out.print("\n Genero: "+genero);
        System.out.print("\n Suspendido: "+suspendido);
        e.close();

    }
    
}
