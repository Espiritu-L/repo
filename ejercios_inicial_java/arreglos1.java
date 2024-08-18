package ejercios_inicial_java;

import java.util.Scanner;

public class arreglos1 {
      public static void main(String[] args) {
     Scanner e = new Scanner(System.in);



     /*  int a = 0, b = 1, t = 0, n;
     System.out.print("\n\t SERIE FIBONACCI");
     System.out.print("\n DIGITE UN NUMERO: ");
     n = e.nextInt();
     for(int i=0; i<n; i++){
       System.out.print("  "+a);
        t = a+b;
        a = b;
        b = t;
     } */ 



     /*  int n, suma = 0, resta = 0, prod = 1;
      System.out.println(" INGRESE LA DIMENCION DEL VECTOR: ");
      n = e.nextInt();
      int [] v = new int[n];
     for(int i=0; i<n; i++){
       v[i] = i+1;   // v[i] = 0+1
        suma += v[i]; // suma = suma + v[i]
        resta -= v[i];// resta = resta - v[i]
      prod *= v[i]; // prod = prod * v[i]
      }
     float pro; pro = (float) suma / n;
     System.out.printf(" \nSUMA = "+suma);
     System.out.printf(" \nSUMA = "+resta);
     System.out.printf(" \nSUMA = "+prod);
     System.out.printf(" \nPROMEDIO = "+pro);*/


   
    /* int v[];
     v = new int[10];
     for(int i = 0; i < 10; i++){
      System.out.print(" \n --> ");
      v[i] = e.nextInt();
     }
     System.out.println(" MOSTRANDO ");
     //Para mostrar i = n - 1 y i >= 0 
     for(int i = 9; i >= 0; i--){
      System.out.println(" "+v[i]);
     }
     int n; 
     System.out.print(" \n TAMANIO DEL ARREGLO: ");
     n = e.nextInt();

     e.nextLine(); // Consumir la nueva línea

     String palabra[];
     palabra = new String[n];
     System.out.println(" LLENADO DEL ARREGLO");
     for(int i = 0; i < palabra.length; i++){
      System.out.print((i+1)+" PALABRA: ");
      palabra[i] = e.nextLine();
     }
     System.out.println("MOSTRANDO LOS ELEMENTOS");
     for(String i: palabra){
      System.out.print("\n  "+i);
     } */



    /* int n;
     System.out.print(" \nINGRESE EL TAMANIO DEL VECTOR: ");
     n  = e.nextInt();
     char letra[];
     letra = new char[n];
     System.out.println(" DIGITE LOS ELEMENTOS DEL VECTOR");
     //ingresanda los elementos
     for(int i=0; i<n; i++){
      System.out.print("\n DIGITE UN CARACTER: ");
      letra[i] = e.next().charAt(0);
     }
    //mostrando los elementos con length
    System.out.println("\n\n ELEMENTOS CON LENGTH\n");
    for(int i=0; i<letra.length; i++){
      System.out.print("  "+letra[i]);
     }
    //mostrando los elementos con for each - for mejorado
    System.out.println("\n\n ELEMENTOS CON FOR MEJORADO\n");
    for(char i: letra){
      System.out.println("  CARACTER: "+i);
    } */



     /*//ingreso de numeros a un vectro- array unidimensionanl
     int n;
     System.out.print(" INGRESE EL TAMANIO DEL VECTOR: ");
     n = e.nextInt();
     e.nextLine();
     String[] v = new String[n];
      for(int i = 0; i<n; i++){
        System.out.printf(" \n INGRESE UNA PALABRA: ");
        v[i] = e.nextLine();
      }
      System.out.println(" \tPALABRAS INGRESADOS\n");
      for(int i = 0; i<n; i++){
        System.out.printf(" "+v[i]);
      }*/

      e.close();
    }
}
