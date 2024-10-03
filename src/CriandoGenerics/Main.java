package CriandoGenerics;

import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {


        CarrinhoDeCompras<Object> CarinhoCompras = new CarrinhoDeCompras<>();

        CarinhoCompras.adicionarItem(new Teclado("Razer"));
        CarinhoCompras.adicionarItem(new CadeiraGamer("DxRacer"));
        CarinhoCompras.adicionarItem(new Mouse("Logitech"));

        CarinhoCompras.statusCarrinho();


    }
}
