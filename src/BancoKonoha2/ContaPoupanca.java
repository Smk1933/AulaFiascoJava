package BancoKonoha2;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca() {
    }

    public ContaPoupanca(double valor, double saldo, TipoDeConta tipoConta) {
        super(valor, saldo, tipoConta);

    }
    // SOBRECARGA DO METODO DEPOSITAR SALDO COLOCANDO UMA TAXA, NO CASO SERIA 1%
    public double depositarSaldo(double valor, double taxa) {
        return super.depositarSaldo(valor * taxa) ;
    }
}
