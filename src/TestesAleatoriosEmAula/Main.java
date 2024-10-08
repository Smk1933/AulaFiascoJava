package TestesAleatoriosEmAula;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        List<String> nomes = new ArrayList<>();

        nomes.add("sdsds");
        nomes.add("55");
        System.out.println(nomes);
        nomes.add(1,"435");

        for (String nome : nomes){
            System.out.println(nome);
        }

        nomes.set(0,"asa");  // Ele substitui

        System.out.println(nomes);

        nomes.add(0,"narutop"); //Ele adiciona, jogando o elemento do indice antigo para frente da "fila"
        System.out.println(nomes);






    }
}
