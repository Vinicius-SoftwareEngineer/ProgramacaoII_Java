public class ContaBancaria {
    private String nome;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String nome, String numeroConta){
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = 1000.0;
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual da conta: R$" + saldo);
    }
    public void Depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void Sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor insuficiente para saque.");
        }
    }

        public String getNome() {
            return nome;
        }

    public String getNumeroConta() {
        return numeroConta;
    }
}
