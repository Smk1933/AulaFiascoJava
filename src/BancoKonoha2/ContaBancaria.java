package BancoKonoha2;

public abstract class ContaBancaria implements MetodosConta{

    private double saldo;
    private double valor;
    private TipoDeConta tipoConta;

    public ContaBancaria() {
    }

    public ContaBancaria(double valor, double saldo, TipoDeConta tipoConta) {
        this.valor = valor;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public TipoDeConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoDeConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    @Override
    public void consultarSaldo(){
        System.out.println(this.saldo);
    }

    @Override
    public double depositarSaldo(double valor){
        return saldo += valor;
    }

    @Override
    public void sacarSaldo(double valor){
        if (saldo >= valor){
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositoEntreContas(ContaBancaria saldoOrigem, ContaBancaria saldoDestino, double valor) {
        if (saldoOrigem.getSaldo() >= valor){
            saldoOrigem.sacarSaldo(valor);
            saldoDestino.depositarSaldo(valor);
        } else {
            System.out.println("Saldo insuficiente");
        }

    }
}


