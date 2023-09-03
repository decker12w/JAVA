package aplication;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho = sc.nextInt();

        int[][] matriz = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.printf("Matriz[%d][%d]\n", i + 1, j + 1);
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println("");
        }
        sc.close();
    }
}
