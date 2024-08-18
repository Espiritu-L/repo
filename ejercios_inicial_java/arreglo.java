package ejercios_inicial_java;

import java.util.Scanner;

public class arreglo {
       public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        
        int v[], v1[], c=1, n;
        boolean creciente = true;
        v = new int[5];
        v1 = new int[10];

        do{
            for(int i=0; i<5; i++){
                System.out.print("\n "+(1+i)+" DIGETE UN NUMERO: ");
                v[i] = e.nextInt();
            }

            for(int i=0; i<4; i++){
                if(v[i] < v[i+1]){
                    creciente = true;
                }else if(v[i] > v[i+1]){
                    creciente = false;
                    break;
                }
            }
            if(creciente == false){
                System.out.println("VUELVA A DIGITAR LOS ELEMENTOS DEL ARREGLO\n");
            }

        }while(creciente == false);
        System.out.print("\n"+c+".- ARRAY: ");
        for(int i: v){
            System.out.print(" - "+i);
        }
        for(int i=0; i<10; i++){
            v1[i] = (int)(Math.random()*50);
        }        
        System.out.print("\n"+(c+=1)+".- ARRAY: ");
        for(int i: v1){
            System.out.print(" - "+i);
        }
        System.out.print("\n\nINGRESE UN NUMERO A BUSCAR: ");
        n = e.nextInt();
        int i = 0;
        while (i<10 && n!=v1[i]) {
            i++;
        }

        if(i==10 || n!=v1[i]){
            System.out.println("NO SE ENCUENTRA EL NUMERO\n");
        }else{
            System.out.println(" EL NUMERO "+n+" SE ENCUENTRA EN LA POS. :"+i+"\n");
        }

        

        //recorrer n posiciones que  son ingresados por el usuario en el arry
        /*int v[] = new int[10];
        int n; // Número de posiciones a desplazar

        System.out.println("\nLLENADO DEL ARREGLO");

        for (int i = 0; i < 10; i++) {
            v[i] = (int) (Math.random() * 10);
        }

        System.out.print("ARREGLO ORIGINAL: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(v[i] + " - ");
        }

        System.out.print("\n\nIngrese la cantidad de posiciones a desplazar: ");
        n = e.nextInt();

        // Validar que n sea un valor positivo
        if (n > 0) {
            // Realizar el desplazamiento circular hacia abajo n veces
            for (int k = 0; k < n; k++) {
                int ultimo = v[9]; // Guardar el último elemento del arreglo

                // Desplazamiento circular hacia abajo
                for (int i = 8; i >= 0; i--) {
                    v[i + 1] = v[i];
                }

                v[0] = ultimo; // Asignar el valor guardado al primer elemento
            }

            System.out.print("\nARREGLO MODIFICADO: ");
            for (int i = 0; i < 10; i++) {
                System.out.print(v[i] + " - ");
            }
        } else {
            System.out.println("Por favor, ingrese un valor positivo para el desplazamiento.");
        }      */




        /*  int v[] = new int[10];
        int ultimo;
        System.out.println("\nLLENADO DEL ARREGLO");

        for(int i = 0; i < 10; i++){
            v[i] =(int) (Math.random()*10);
        }
        System.out.print(" \nARREGLO ORIGINAL :");
        for(int i = 0; i < 10; i++){
            System.out.print(v[i]+" - ");
        }
        ultimo = v[9];

        for(int i = 8; i >= 0; i--){ //avanzar una posicion abajo
            v[i+1] = v[i];
        }

        v[0] = ultimo;

        System.out.print("\n\n ARREGLO MODIFICADO: ");
        for(int i = 0; i < 10; i++){
            System.out.print(v[i]+" - ");
        } System.out.print("\n\n");      */


        
        //indicar al usuario si el arreglo que ingreso esta en forma de creciente, decreciente 
        // desordenado o todos son iguales

        /*int v[];
        boolean creciente = false, decreciente = false;
        v = new int[10];
        System.out.println(" \n LLENADO DEL ARREGLO\n");

        for(int i = 0; i < 10; i++){
            System.out.print((1+i)+".- DIGITE UN NUMERO: ");
            v[i] = e.nextInt();
        }

        for(int i = 0; i < 9; i++){
            if(v[i] < v[i+1]){
                creciente = true;
            }
            if(v[i] > v[i+1]){
                decreciente = true;
            }
        }

        if (creciente == true && decreciente == false) {
            System.out.println("EL ORDEN ES CRECIENTE");
        } else if(creciente == false && decreciente == true){
            System.out.println(" EL ORDEN ES DECRECIENTE ");
        } else if(creciente == true && decreciente == true){
            System.out.println(" EL ARREGLO ESTA DESORDENADO");
        } else if(creciente == false && decreciente == false){
            System.out.println(" TODOS LOS NUMEROS SON IGUALES");
        }   */



        /*int a[], b[], c[], d[], cont1 = 1, cont2 = 2;
        a = new int[12];
        b = new int[12];
        c = new int[24];
        d = new int[24];
        System.out.print("\n\t LLENADO DE LOS ARREGLOS");
        for(int i = 0; i < 12; i++){
            a[i] = cont1; cont1 += 2;
            b[i] = cont2; cont2 += 2;

        }
        System.out.print(" \n\n ARREGLO 1: ");
        for(int i: a){
            System.out.print(" "+i);
        }
        System.out.print(" \n\n ARREGLO 2: ");
        for(int i: b){
            System.out.print(" "+i);
        }

        int j = 0;
        for(int i=0; i < 12; i++){
            for(int con = 0; con < 3; con++){
                d[j] = a[i]; j++; i++;
            }
            for(int con = 0; con < 3; con++){
                d[j] = b[i]; j++; i++;
            }
        }
        System.out.print(" \n\n ARREGLO RESULTANTE: ");
        for(int i: d){
            System.out.print(" "+i);
        }*/



        /* 
        int j=0;
        //trabajamos con el arreglo 3
        for(int i=0; i<12; i++){
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        System.out.print(" \n\n ARREGLO RESULTANTE: ");
        for(int i: c){
            System.out.print(" "+i);
        } */


        /* 
        // arrreglo 4 de combinacion. 2 de a[] y 3 de b[] y asi sucesivamente
        int l = 0,k=0;
        do{
            for(int i = 0; i < 3; i++){
                d[l] = a[i]; l++;
                k++;
            }

            for(int i = 0; i < 3; i++){
                d[l] = b[i]; l++;
                k++;
            }

        }while(k < 24);

        System.out.print(" \n\n ARREGLO DE 3 EN 3\n\n ARREGLO RESULTANTE: ");
        for(int i: d){
            System.out.print(" "+i);
        } */


        e.close();
    }
}
