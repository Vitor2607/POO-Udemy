package entities;

public class Conta {

    private final int numero;
    private String titular;
    private double saldo;

    private static final double TAXA_SAQUE = 5.0;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Conta(int numero, String titular, double depositoInicial) {// Construtor sobrecarregado com deposito inicial
        this.numero = numero;
        this.titular = titular;
        deposito(depositoInicial);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String nome) {
        this.titular = nome;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valorDeposito) {
        saldo += valorDeposito;
    }

    public void saque(double valorSaque) {
        saldo -= valorSaque + TAXA_SAQUE;
    }

    public String toString() {
        return "Conta " + numero
                + ", titular: " + titular
                + ", Saldo: $ " + saldo;
    }

}
