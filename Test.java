import entities.Conta;

public class Test {
    public static void main(String[] args) {
        Conta c1 = new Conta("Jose", 312312);
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Número: " + c1.getNumero());
        System.out.println("Saldo: " + c1.getSaldo());

        c1.deposito(100.0);
        c1.saque(50.0);
    }
}
