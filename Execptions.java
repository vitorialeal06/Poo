// Exceção personalizada para saldo insuficiente
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

// Exceção personalizada para limite de saque diário
class LimiteDeSaqueException extends Exception {
    public LimiteDeSaqueException(String mensagem) {
        super(mensagem);
    }
}

class ContaBancaria {
    private double saldo;
    private double limiteSaqueDiario;

    public ContaBancaria(double saldoInicial, double limiteSaqueDiario) {
        this.saldo = saldoInicial;
        this.limiteSaqueDiario = limiteSaqueDiario;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso. Saldo atual: R$" + saldo);
    }

    public void sacar(double valor) throws SaldoInsuficienteException, LimiteDeSaqueException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Saldo disponível: R$" + saldo);
        }
        if (valor > limiteSaqueDiario) {
            throw new LimiteDeSaqueException("Limite diário de saque excedido. Limite: R$" + limiteSaqueDiario);
        }

        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(2000, 1000); // Saldo inicial de R$2000 e limite diário de R$1000

        try {
            conta.depositar(500); // Depositar R$500
            conta.sacar(1500); // Tentar sacar R$1500 (Exceção: LimiteDeSaqueException)
        } catch (SaldoInsuficienteException | LimiteDeSaqueException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        try {
            conta.sacar(300); // Sacar R$300 (sucesso)
        } catch (SaldoInsuficienteException | LimiteDeSaqueException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        try {
            conta.sacar(2500); // Tentar sacar R$2500 (Exceção: SaldoInsuficienteException)
        } catch (SaldoInsuficienteException | LimiteDeSaqueException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }
    }
}
