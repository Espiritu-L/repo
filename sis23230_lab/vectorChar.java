package sis23230_lab;

import java.util.Scanner;

public class VectorChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] v = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            v[i] = s.charAt(i);
        }

        for (char c : v) {
            System.out.print(" " + c);
        }

        scanner.close();
    }
}

