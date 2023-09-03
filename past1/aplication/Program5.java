package aplication;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        int test;

        Scanner sc = new Scanner(System.in);
        test = sc.nextInt();
        int[] pares = new int[test];
        int[] impares = new int[test];

        int countPares = 0; // Contador para rastrear o número de números pares
        int countImpares = 0; // Contador para rastrear o número de números ímpares

        for (int i = 0; i < test; i++) {
            int numbers = sc.nextInt();
            if (numbers % 2 == 0) {
                pares[countPares] = numbers;
                countPares++;
            } else {
                impares[countImpares] = numbers;
                countImpares++;
            }
        }

        // Ordenar o array de números pares
        for (int i = 1; i < countPares; i++) {
            int x = pares[i];
            int j = i - 1;
            while (j >= 0 && pares[j] > x) {
                pares[j + 1] = pares[j];
                j--;
            }
            pares[j + 1] = x;
        }

        // Ordenar o array de números ímpares
        for (int i = 1; i < countImpares; i++) {
            int x = impares[i];
            int j = i - 1;
            while (j >= 0 && impares[j] < x) {
                impares[j + 1] = impares[j];
                j--;
            }
            impares[j + 1] = x;
        }

        // Imprimir os números ordenados
        for (int i = 0; i < countPares; i++) {
            System.out.println(pares[i]);
        }

        for (int i = 0; i < countImpares; i++) {
            System.out.println(impares[i]);
        }

        sc.close();
    }
}
