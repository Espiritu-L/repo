package ejercios_inicial_java;

import java.util.Scanner;

public class clasebucles {
        public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        // igresar n sueldos e imprimir el mayor de todos y mostra en que numero se ubica
        int n, c = 0, pos=0;
        float s, may = 0f;
        System.out.println("\t CATIDAD DE SUELDOS A INGRESAR ");
        n = e.nextInt();
        
        for(int i = 1; i <= n; i++){
            c++;
            System.out.printf("\n SUELDO  # "+c+" : ");
            s = e.nextFloat();
            if(s > may){
                may = s;
                pos = c;
            }
          
        }

        System.out.printf(" \n EL SUELDO MAYOR ES: "+may);
        System.out.printf(" \n SE ENCUENTRA EN EL # "+pos);

        

        //ingresar numeros indicar si es positivo o negativo 
        // si se ingresa un numero cero se termina el programa
        /*int n;
        System.out.print("\n DIGITE UN NUMERO: ");
        n = e.nextInt();
        while (n!=0) {
        if(n>0){
         System.out.print(" EL NUMERO ES POSITIVO");
        }else{
        System.out.print(" EL NUMERO ES NEGATIVO");
        }
        System.out.print("\n\n DIGITE UN NUMERO: ");
        n = e.nextInt();
        }
        System.out.print(" \n EL NUMERO ES CERO SE TERMINO EL PROGRAMA\n");   */



        //ingresar notas de 6 de n estudiantes en rango de 0 - 10
        // e immprir si nota es mayor a o igual a 5 aprobado si es igual 
        // 4 revalidad si es menor a 3 0 igual reprobrado
        /*int n, nt, re=0, ap=0, rep=0, c=1;
        System.out.println("\nINGRESE LA CANTIDAD DE ESTUDIATES: ");
        n = e.nextInt();
        for(int i=0; i<n; i++){
            System.out.println(" ESTUDIANTE # "+c);

            do{
                System.out.printf(" INGRESE LA NOTA RANGO 1 - 10: ");
                nt = e.nextInt();
            }while(nt<=0 || nt>10);
            if(nt >= 5){
                ap++;
            } else if(nt == 4){
                re++;
            }else{
                rep++;
            }
            c++;
        }

        if(ap!=0){
            System.out.printf(" \nESTUDIANTES APROBADOS: "+ap);
        }else{
            System.out.printf(" \nNINGUN ESTUDIANTES APROBO");
        }
        
        if(rep!=0){
            System.out.printf(" \nESTUDIANTES REPROBADOS: "+rep);
        }else{
            System.out.printf(" \nNINGUN ESTUDIANTES REPROBO");
        }

        if(re!=0){
            System.out.printf(" \nESTUDIANTES PARA REVALIDA: "+re);
        }else{
            System.out.printf(" \nNINGUN ESTUDIANTE ENTRO A LA REVALIDA");
        } */


        
       //tabla de multiplicar de un numero
        /*  int n, m;
        System.out.printf(" \n DE QUE NUMERO DESEA VER LA TABLA: ");
        n = e.nextInt();
        System.out.printf(" \n HASTA QUE NUMERO DESEAS: ");
        m = e.nextInt();
        for(int i = 1; i <= m; i++){
            System.out.println(" "+i+" * "+n+" = "+i*n);
        }  */



         /*ingresar 10 numeros de los cuales selecionar por separado los
         * pares, impares y ceros. por ultimo imprir la suma, promedio
         */ /*
        int p = 0, imp = 0, sp = 0, si = 0, c=0, n;
        float pp=0, pi = 0;

        System.out.println("\tDIGITE 10 ELEMENTOS DE NUMEROS ENTEROS");
        for(int i=0; i<10;i++) {
            System.out.printf(" \nINGRESE EL NUMERO: ");
            n = e.nextInt();
             
            if(n == 0){
                c++;
            }else if(n > 0){
                sp+=n;
                p++;
            } else {
                si+=n;
                imp++;
            }
        }
        // tratamos con los numeros positivos 
        if(p==0){
            System.out.println("\n NO SE INGRESARON NUMEROS POSITIVOS");
        }else{
            pp =(float)sp / p;
            System.out.println("\n SUMA DE NUM. POSITIVOS: "+sp);
            System.out.println(" CANTIDAD DE NUM. POSITIVOS QUE SE INGRESARON: "+p);
            System.out.println(" PROMEDIO DE LOS NUM. POSITIVOS: "+pp);
        }
        // tratamos con los numeros negativos
        if(imp==0){
            System.out.println("\n NO SE INGRESARON NUMEROS NEGATIVOS");
        }else{
            pi =(float)si / imp;
            System.out.println("\n SUMA DE NUM. NEGATIVOS: "+si);
            System.out.println(" CANTIDAD DE NUM. NEGATIVOS QUE SE INGRESARON: "+imp);
            System.out.println(" PROMEDIO DE LOS NUM. NEGATIVOS: "+pi);
        }

        if(c!=0){
        System.out.println("\n CANTIDAD DE CEROS QUE SE INGRESARON ES: "+c+"\n");
        }else{
            System.out.println("\n NO SE INGRESO NINGUN CERO\n");
        } */


        
       /*  int a = 0, b = 1, t = 0, n;

        System.out.println("\n\tSERIE FIBONACCI");
        //0 1 1 2 3 5 8 .... n
        System.out.printf(" DIGITE LA CANTIDAD QUE DEA VER: ");
        n = e.nextInt();

        for(int i = 0; i<n; i++){
            System.out.printf("  "+a);
            t = a + b;
            a = b;
            b = t;
        }   */



        /*   int f=1, n;
        System.out.printf("\n DE QUE NUMERO DESEA EL FACTORIAL: ");
        n = e.nextInt();
        for(int i=1; i<=n; i++){
            f*=i;
        }
        System.out.println("\nFACTORIAL DE "+n+" = "+f+"\n");   */



        /*   int p = 1, pro = 1;
        for(int i = 1; i <= 9; i+=2){
            System.out.println(i);
            pro*=i;
        }
        System.out.printf(" PRODUCTO: "+pro+"\n");
        for(int j = 1; j <= 9; j++){
            if(j%2!=0){
               p*=j;
            }
        }
        System.out.printf(" PRODUCTO: "+p);     */



        /* 
        int n, s = 0;
        System.out.println("PEDIR 10 NUMEROS Y SUMAR");
        for(int i =1; i<=10; i++){
            System.out.printf(" \nDIGITE UN NUMERO ---> ");
            n = e.nextInt();
            s = s + n; 
        }
        System.out.println("------------------------------ \n"+
        "\t --> SUMA = "+s);  */



        /* 
        System.out.printf(" \n\t MOSTRANDO NUMEROS DE 7 EN 7 DE DE 0 AL 100\n");
        for(int i = 7; i < 100; i+=7){
            System.out.println(" "+i);
        } */



        /*Pedir numeros hasta que se teclee un 0, luego mostrar la suma total, 
         * cuantos numeros se ingresaron, el promedio, suma de pares, suma 
         * de impares, cuantos son pares y cuantos impares 
         */ /* 
        int n, st = 0, sp=0, si = 0,  pa = 0, imp = 0, ni = 0;
        float pr;
        System.out.printf("\t\n BIENVENIDO \n"+
        "\n INGRESE UN NUMERO: ");
        n = e.nextInt();

        do{

            if(n!=0){
                st = st + n; // suma total
                ni++; // cont de numeros ingresados

                if(n%2==0){
                sp = sp + n; // suma de pares
                pa++; // cont de pares
                }else{
                si = si + n; // suma de impares
                imp++; // cont de impares
                }

                System.out.printf("\n INGRESE UN NUMERO: ");
                n = e.nextInt();
            }

        }while(n!=0);
        pr = (float) st / ni;
        System.out.printf("\n SUMA TOTAL:  "+st);
        System.out.printf("\n TOTAL NUMEROS INGRESADOS:  "+ni);
        System.out.printf("\n PROMEDIO TOTAL:  "+pr);
        System.out.printf("\n\n SUMA DE PARES:  "+sp);
        System.out.printf("\n PARES INGRESADOS:  "+pa);
        System.out.printf("\n\n SUMA DE IMPARES:  "+si);
        System.out.printf("\n IMPARES INGRESADOS:  "+imp+"\n");  */



        /*    // crear un numero radoom y adivina
        int r, n, c=1, m=1;
        r = (int)(Math.random()*100);
        System.out.println("\n EL NUMERO GENERADO ES: "+r);
        System.out.println("\t ADIVINA EL NUMERO ");
        System.out.printf(m+" DIGITE UN NUMERO: ");
        n = e.nextInt();
            
        do{
            
            if(n!=r){
            if(n > r){
                System.out.println("INGRESE UN NUMERO MENOR");
            }else{
                System.out.println(" INGRSE UN NUMERO MAYOR ");
            }
            m++;
            System.out.printf(m+" DIGITE UN NUMERO: ");
            n = e.nextInt();
            c++;
            }
            
        }while(n != r);
        System.out.printf(" LOGRASTE ADIVANAR "+n+"  NUMERO DE INTENTEOS "+c+" \n"); */



        /* // indicar si un numero es positivo o negativo 
        // si se ingresa un cero parar el ciclo
        int n, c = 0;;
        System.out.printf("\n Ingrese un numero: ");
        n = e.nextInt();
        while (n!=0) {
            c++;
            if(n >= 1)
                System.out.println(" EL NUMERO "+ n + " POSITIVO");
            else
                System.out.println(" EL NUMERO "+ n + " ES NEGATIVO");
           System.out.printf("\n Ingrese un numero: ");
           n = e.nextInt();
           
        }
        System.out.printf(" SE INGRESARON : "+c+" NUMEROS");  */ 

    

      /*  //leer un numero en rango mayor  a cero y menor a 100
       // y mostrar el cuadrado de numero 
        int n, r;
        System.out.printf(" \nDigite un numero: ");
        n = e.nextInt();
        while (n > 0 && n < 100 ) {
            r = (int)Math.pow(n, 2);
            System.out.printf("\n NUMERO: "+ n +"  AL CUADRADO = "+r);
            System.out.printf(" \nDigite un numero: ");
            n = e.nextInt();
        }    */
        e.close();
    }
}
