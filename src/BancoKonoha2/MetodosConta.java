package BancoKonoha2;

public interface MetodosConta {

    void consultarSaldo();
    double depositarSaldo(double valor);
    void sacarSaldo(double valor);
    void depositoEntreContas(ContaBancaria saldoOrigem, ContaBancaria saldoDestino, double valor);
}
