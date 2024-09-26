package BancoKonoha;

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(1000);
        cc1.depositar(500);
        cc1.consultarSaldo();

        ContaPoupanca cp1 = new ContaPoupanca(1000);
        cp1.depositar(1000);
        cp1.consultarSaldo();

    }
}
