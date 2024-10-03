package CriandoGenerics;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras<T> {

    private List<T> itens = new ArrayList<>();

    public void adicionarItem(T item) {
        itens.add(item);
    }

    public void statusCarrinho() {
        for (T item : itens) {
            System.out.println(item);
        }
    }

}