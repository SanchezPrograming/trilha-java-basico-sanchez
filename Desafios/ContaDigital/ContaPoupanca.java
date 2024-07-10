package Desafios.ContaDigital;

public class ContaPoupanca extends Banco {
    private double taxaRendimento;

    public ContaPoupanca(int conta, String nomeCliente, double taxaRendimento) {
        super(conta, nomeCliente);
        this.taxaRendimento = taxaRendimento;
    }

    public double calcularRendimento() {
        double rendimento = getSaldo() * taxaRendimento;
        setSaldo(getSaldo() + rendimento);
        return rendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}