package ArrayListCollectionsSort;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Zoro");
        nomes.add("Luffy");
        nomes.add("Sanji");

        System.out.println("Nomes da lista: ");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        //imprimir usando foreach
        System.out.println("Imprimindo usando for each");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("Ultimo e primeiro nome: ");

        System.out.println(nomes.get(nomes.size() - 1));

        System.out.println(nomes.get(0));

        // removar luffy

        nomes.remove(1);

        System.out.println("Nomes da lista: ");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        nomes.clear(); // limpar array

        System.out.println(nomes.size());

        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Animal("Cachorro",4));
        animais.add(new Animal("Aguia",5));
        animais.add(new Animal("Gato",1));

        for (Animal animal : animais){
            System.out.println(animal);
        }

        ArrayList<Integer> numerosAleatorios = new ArrayList<>();
        numerosAleatorios.add(12);
        numerosAleatorios.add(3);
        numerosAleatorios.add(-98);
        numerosAleatorios.add(555);
        numerosAleatorios.add(4);
        numerosAleatorios.add(21);
        numerosAleatorios.add(23);
        numerosAleatorios.add(1);

        for ( Integer numero : numerosAleatorios){
            System.out.println(numero);
        }

        Collections.sort(numerosAleatorios); // colocando em ordem crescente

        for ( Integer numero : numerosAleatorios){
            System.out.println(numero);
        }
        Collections.sort(numerosAleatorios, Collections.reverseOrder()); // colocando em ordem decrescente


        for ( Integer numero : numerosAleatorios){
            System.out.println(numero);
        }

    }



}
