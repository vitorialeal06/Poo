package exercicios;

public abstract class Conta {
    private double saldo;
    private double depositar;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public double obterSaldo() {
        return saldo;
    }
}
