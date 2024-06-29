package Desafios.ContaBanco;

import java.util.Scanner;

class ContaTerminal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o Numero: ");
        int numero = ler.nextInt();
        System.out.println("Digite a Agencia: ");
        String agencia = ler.next();
        System.out.println("Digite o Nome: ");
        String nome = ler.next();
        System.out.println("Digite o Saldo: ");
        double saldo = ler.nextDouble();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");

        ler.close();
    }
}