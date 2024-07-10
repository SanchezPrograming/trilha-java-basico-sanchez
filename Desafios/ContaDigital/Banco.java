package Desafios.ContaDigital;

public class Banco {
    private static int ultimoId = 0;
    private int id;
    private int conta;
    private double saldo = 500;
    private String nomeCliente;

    public Banco(int conta, String nomeCliente) {
        this.id = ++ultimoId;
        this.conta = conta;
        this.nomeCliente = nomeCliente;
    }

    public int getId() {
        return id;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Valor sacado: " + valor);
            System.out.println("Seu saldo agora é: " + saldo);
        } else {
            System.out.println("Não é possível sacar, saldo insuficiente.");
        }
    }

    public void deposito(double valor) {
        saldo += valor;
        System.out.println("Seu depósito foi feito no valor de: " + valor);
        System.out.println("Seu saldo agora é: " + saldo);
    }
}