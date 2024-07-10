package Desafios.ContaDigital;

import java.util.Scanner;

public class TestarConta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Banco c1 = new Banco(5225, "Gustavo Sanchez");
        ContaPoupanca cp1 = new ContaPoupanca(5226, "Gabriel Amaral", 0.02);

        System.out.println("O id da conta " + c1.getConta() + " é " + c1.getId() + " seu saldo é de " + c1.getSaldo());
        System.out.println("O id da conta poupança " + cp1.getConta() + " é " + cp1.getId() + " seu saldo é de " + cp1.getSaldo());

        System.out.println("Digite a quantidade que você deseja sacar");
        double valorSacar = ler.nextDouble();
        c1.sacar(valorSacar);

        System.out.println("Digite a quantidade que deseja depositar na conta");
        double valorDepositar = ler.nextDouble();
        c1.deposito(valorDepositar);

        System.out.println("O id da conta " + c1.getConta() + " é " + c1.getId() + " seu saldo é de " + c1.getSaldo());

        System.out.println("Calculando rendimento da conta poupança...");
        double rendimento = cp1.calcularRendimento();
        System.out.println("Rendimento da conta poupança: " + rendimento);
        System.out.println("O id da conta poupança " + cp1.getConta() + " é " + cp1.getId() + " seu saldo é de " + cp1.getSaldo());

        ler.close();
    }
} 