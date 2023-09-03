package aplication;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(vect[i]);
        }

        sc.close();

    }
}
