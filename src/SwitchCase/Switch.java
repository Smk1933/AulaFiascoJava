package SwitchCase;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner opcoes = new Scanner(System.in);
        System.out.println("Escolha seu personagem");
        System.out.println("1. Naruto Uzumaki");
        System.out.println("2. Sasuke Uchiha");
        System.out.println("3. Rock Lee");

        int escolhaPersonagem = opcoes.nextInt();

        switch (escolhaPersonagem) {
            case 1:
                System.out.println("Você escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Você escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Você escolheu o Rock Lee");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
        System.out.println("Agora escolha a profissão que você quer trilhar");
        System.out.println("1. Hokage");
        System.out.println("2. Professor do Exame Chunin ");
        System.out.println("3. Anbu");

        int metaDeProfissao = opcoes.nextInt();

        switch (metaDeProfissao) {
            case 1:
                System.out.println("A profissão que você irá trilhar será de Hokage");
                break;
            case 2:
                System.out.println("A profissão que você irá trilhar será de Professor do exame Chunin");
                break;
            case 3:
                System.out.println("A profissão que você irá trilhar será de Anbu");
                break;
            default:
                System.out.println("Opção Invalida, escolha dentre as profissões existentes");
                break;
        }
        opcoes.close();
    }
}
