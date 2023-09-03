package entities;

public class Conta {
    private String nome;
    private Double saldo;
    private int numero;

    public Conta(String nome, int i) {
        this.nome = nome;
        this.numero = i;
        this.saldo = 0.0; // Defina o saldo inicial para 0.0, se desejar
    }

    public Conta(String nome, double saldo, int numero) {
        this.nome = nome;
        this.numero = numero;
        saque(saldo);

    }

    public int getNumero() {
        return numero;
    }

    public void deposito(double quantity) {
        this.saldo += quantity;
        System.out.printf("Deposito de %f\n", quantity);
        System.out.printf("Saldo atual %f\n", this.saldo);
    }

    public void saque(double quantity) {
        this.saldo -= (quantity + 5);
        System.out.printf("Saque de %f + taxa de 5\n", quantity);
        System.out.printf("Saldo atual %f\n", this.saldo);

    }

    public String getNome() {
        return nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
