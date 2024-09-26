package BancoKonoha;

public class ContaCorrente extends ContaBancaria{
    public double valorCc;
    public double saldoCc;

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        this.saldoCc = saldo;
    }

    public double getValor() {
        return valorCc;
    }

    public void setValor(double valor) {
        this.valorCc = valor;
    }

    public double getSaldo() {
        return saldoCc;
    }

    public void setSaldo(double saldo) {
        this.saldoCc = saldo;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é : " + saldoCc);
    }

    @Override
    public void depositar(double valor) {
        saldoCc = saldoCc + valor;  // ou += funcionaria
    }
}
