package ejercios_inicial_java;

public class tipos_variable {
    public static void main(String[] args) {
        /* 
        System.out.println("hola soy edwin!");
        System.out.println("\n sout + enter para textos");
        System.out.println("Curso de java");
        */
        // byte 8 bits -128 a 128
        byte a=12;
        System.out.println("Valor de la variable: "+a);
        // short 16 bits -32,768 a 32,767
        short b=12365;
        System.out.println("\nValor de la variable: "+b);
        // int 32 bits -2,147,483,648 a 2,147,483,647
        int c=235659556;
        System.out.println("\nValor de la variable: "+c);

        // Datos reales double 64 bits y float 32 bits

        float d=3.58f;
        System.out.println("\nVarible de tipo real: "+d);

        // Datos de tipo caracter
        char e='a';
        System.out.println("\nVariable de tipo char: "+e);

        //Dato de tipo string
        String p=" hola que tal? ";
        System.out.println("\nVariable de tipo String: "+p);

        //Variables constantes
        final int n=20;
        System.out.println("\n Variable constante: "+n);
        final float nn=25.20f;
        System.out.println("\nVariable constante: "+nn);
    }
}
