package past1.aplication;

import java.util.Locale;

import past1.entities.Products;

public class Estoque {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Products escovas = new Products();
        escovas.addProduct(5);
        escovas.price = 4.5;

        System.out.printf("O valor total é %f", escovas.totalValue());
        System.out.println(escovas.toString());

    }
}
