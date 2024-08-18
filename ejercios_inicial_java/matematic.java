package ejercios_inicial_java;

public class matematic {
    public static void main (String[] args){
        double raiz, base = 3, expo = 3, r;
        raiz = Math.sqrt(9);

        // Para sacar raiz cuadrada
        System.out.println( "Raiz: "+raiz);

        // Elevacion de un numero a n
        r = Math.pow(base, expo); //respetar orden ...(base, exponente)
        System.out.println("Exponente: "+r);

        // random, n aleatorio;
        double j = Math.random();
        System.out.println("Numero generado: "+j);  

    } 
}
