package BancoKonoha;

public class ContaPoupanca extends ContaBancaria{

    public double valorCp;
    public double saldoCp;

    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo) {
        this.saldoCp = saldo;
    }

    public double getValor() {
        return valorCp;
    }

    public void setValor(double valor) {
        this.valorCp = valor;
    }

    public double getSaldo() {
        return saldoCp;
    }

    public void setSaldo(double saldo) {
        this.saldoCp = saldo;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é : " + saldoCp);
    }

    @Override
    public void depositar(double valor) {
        saldoCp = saldoCp + valor * 0.99;
    }

}
