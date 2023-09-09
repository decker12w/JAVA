package past1.aplication;

import java.util.Scanner;

import past1.entities.Product;

public class Program1 {
    public static final int n = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] estoque = new Product[n];

        for (int i = 0; i < n; i++) {
            estoque[i] = new Product(); // Cria um novo objeto Product
            estoque[i].name = sc.nextLine();
            estoque[i].price = sc.nextDouble();
            sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(estoque[i].name);
            System.out.println(estoque[i].price);
        }

        sc.close();
    }
}
