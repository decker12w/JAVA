package aplication;

import java.util.Scanner;
import entities.Alunos;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quant = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha pendente

        double soma = 0;
        Alunos[] vect = new Alunos[quant];

        for (int i = 0; i < quant; i++) {
            System.out.println("Escreva o nome");
            String name = sc.nextLine();
            System.out.println("Escreva a idade");
            int idade = sc.nextInt();
            soma += idade;
            System.out.println("Escreva a altura");
            double altura = sc.nextDouble();
            sc.nextLine(); // Consumir a quebra de linha pendente após altura

            vect[i] = new Alunos(name, idade, altura);
        }
        for (int i = 0; i < quant; i++) {
            if (vect[i].idade > 16) {
                System.out.printf("Nome: %s Idade:%d Altura:%.2ff\n", vect[i].name, vect[i].idade, vect[i].altura);
            }
        }

        System.out.printf("A média é %.2f\n", soma / vect.length); // Formate a saída para duas casas decimais
        sc.close();
    }
}
