package AulaScanner;

import java.util.Scanner;

public class ScannerTeste {
    public static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in); //System.in autoriza o usuario a colocar qualquer coisa ali

        System.out.println("Coloque o nome do usuário");
        String nomeDoUsuario = caixaDeTexto.nextLine(); //Metodo onde se espera que o usuario coloque um texto, podemos atribuir uma variavel a ele
        System.out.println("O nome do usuário é:" + nomeDoUsuario);

        System.out.println("Coloque a sua idade");
        int idadeDaPessoa = caixaDeTexto.nextInt();
        System.out.println("O usuario tem: " + idadeDaPessoa + " anos");

        caixaDeTexto.nextLine(); // limpa o buffer do scanner, evita que dê erro apos uma leitura de valor numerico, as vezes dá esse bug

        System.out.println("Coloque sua altura");
        float alturaUsuario = caixaDeTexto.nextFloat();
        System.out.println("O usuário tem: " + alturaUsuario + " cm");

        if (idadeDaPessoa >= 80 ){
            System.out.println("Meu senhor, vá descansar");
        } else if (idadeDaPessoa >= 60){
            System.out.println("Por favor, não dirija!");
        } else if (idadeDaPessoa >= 18 && alturaUsuario > 150) {
            System.out.println("Vá la dirigir");
        } else {
            System.out.println("Vai tirar a carteira, pia");
        }

        caixaDeTexto.close(); //Toda vez tem que fechar o scanner
    }
}
