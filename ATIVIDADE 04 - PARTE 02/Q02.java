public class Conta {
    private double saldo;
    private String numeroConta;

    public Conta(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if(valor > saldo) {
            throw new IllegalArgumentException('Saldo Insuficiente.');
        }

        saldo -= valor;
    }
}

public class ContaCliente {
    private String nome;
    private String cpf;
    private String endereco;
    private Conta conta;

    public ContaCliente(String numeroConta, double saldoInicial, String nome,
        String cpf, String endereco) {
            this.nome = nome;
            this.cpf = cpf;
            thix.endereco = endereco;
            this.conta = new Conta(String numeroConta, double saldoInicial);
        }
}