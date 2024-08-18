package ejercicios_java;

public class sumadig {
    public static void main(String[] args){
        int n = 2356, m=0; m = n;
        System.out.println("\n ---> "+ n);
        while (n!=0) {
            int ud = 0;
            ud = n % 10;
            n/=10;
            System.out.println(n+" % "+10+" -> "+ud);
        }
        System.out.println("\n ---> "+ m);
        while (m!=0) {
            m = m / 10;
            System.out.println(m+" / "+10+" -> "+m);
        }
    }
    
}
