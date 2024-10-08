package BancoKonoha2;

public enum TipoDeConta {

    CONTACORRENTE(1,"Conta Corrente"),
    CONTAPOUPANCA(2, "Conta Poupança");

    int codConta;
    String nomeConta;

    TipoDeConta(int codConta, String nomeConta) {
        this.codConta = codConta;
        this.nomeConta = nomeConta;
    }

    public String toString(){
        return nomeConta;
    }
}
