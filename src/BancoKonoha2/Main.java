package BancoKonoha2;

public class Main {
    public static void main (String[] args) {


    ContaCorrente cc1 = new ContaCorrente(0,100,TipoDeConta.CONTACORRENTE);
    cc1.consultarSaldo();
    cc1.depositarSaldo(100);
    cc1.consultarSaldo();
    cc1.sacarSaldo(100);
    cc1.consultarSaldo();
    cc1.sacarSaldo(160);

    System.out.println("------------------------------------------------------");

    ContaPoupanca cp1 = new ContaPoupanca(0, 0,TipoDeConta.CONTAPOUPANCA);
    cp1.consultarSaldo();
    cp1.depositarSaldo(100, 0.99);
    cp1.consultarSaldo();

    System.out.println("------------------------------------------------------");

    cc1.depositoEntreContas(cc1,cp1,100);
    cc1.consultarSaldo();
    cp1.consultarSaldo();

    cp1.depositoEntreContas(cp1,cc1,250);


    }
    }