public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

public class ContaPoupanca {
    private ContaBancaria contaBancaria;

    public ContaPoupanca(double saldoInicial) {
        this.contaBancaria = new ContaBancaria(saldoInicial);
    }

    public void sacar(double valor) {
        if(valor > 1000) {
            throw new RuntimeException('Não pode sacar mais de 1000 em uma poupança');
        }
        contaBancaria.sacar(valor);
    }

    public double getSaldo() {
        return contaBancaria.getSaldo();
    }
}