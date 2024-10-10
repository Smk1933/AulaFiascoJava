package TestesAleatoriosEmAula;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


    Scanner teclado = new Scanner(System.in);

    String name;
    int cod;

        System.out.println("Digite seu cod");
    cod = teclado.nextInt();
        System.out.println("Seu código é : " + cod);
        System.out.println("Digite seu nome");
    name = teclado.nextLine();
        System.out.println("Seu nome é : " + name);


    }
}
