package BancoKonoha;

public interface Conta {

   public void consultarSaldo();

   public abstract void depositar(double valor);
}
