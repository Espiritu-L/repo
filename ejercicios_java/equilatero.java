package ejercicios_java;

import java.util.*;
public class equilatero {
    static float res(float a, float b, float c) {
        float s = 0f, area = 0f;
        s = (a + b + c) / 2;
        area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
    static float perimetro(float a, float b, float c) {
        return (a+b+c);
    }
    public static void main(String[] args) {

        float a = 0, b = 0, c = 0, aux, p = 0;
        Scanner e = new Scanner(System.in);

        System.out.print("\n Ingrese lado a: ");
        a = e.nextFloat();
        System.out.print("\n Ingrese lado b: ");
        b = e.nextFloat();
        System.out.print("\n Ingrese lado c: ");
        c = e.nextFloat();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && a == c && b == c) {
                aux = res(a, b, c);
                p = perimetro(a, b, c);
                System.out.print("\n TRIANGULO EQUILATERO");
                System.out.print("\n\n Area: " + aux);
                System.out.print("\n\n Perimetro: " + p);
                System.out.print("\n\n CARACTERISTECAS DE TRIANGULO EQUILATERO");
                System.out.print("\n\n Tiene los 3 lados iguales: a = " + a + ", b = " + b + ", c = " + c + "\n");

            } else if ((a == b && c != b) || (b == c && a != b) || (a == c && a != b)) {
                aux = res(a, b, c);
                p = perimetro(a, b, c);
                System.out.print("\n TRIANGULO ISOSCELES");
                System.out.print("\n\n Area: " + aux);
                System.out.print("\n\n Perimetro: " + p);
                System.out.print("\n\n CARACTERISTECAS DE TRIANGULO ISOSCELES");
                if (a == b)
                    System.out.print("\n\n Lados iguales: A = " + a + " y B = " + b + " Lado diferente C = " + c);
                if (b == c)
                    System.out.print("\n\n Lados iguales: B = " + b + " y C = " + c + " Lado diferente A = " + a);
                if (a == c)
                    System.out.print("\n\n Lados iguales: A = " + a + " y C = " + c + " Lado diferente B = " + b + "\n");

            } else if (a != b && b != c && c != a) {
                aux = res(a, b, c);
                p = perimetro(a, b, c);
                System.out.print("\n TRIANGULO ESCALENO");
                System.out.print("\n\n Area: " + aux);
                System.out.print("\n\n Perimetro: " + p);
                System.out.print("\n\n CARACTERISTECAS DE TRIANGULO ESCALENO");
                System.out.print("\n Tiene los 3 lados diferentes: a: " + a + ", b: " + b + ", c: " + c + "\n");
            }
        } else {
            System.out.println("\n No puede formar un triangulo");
        }
        e.close();
    }
}
