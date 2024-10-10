import java.util.Scanner;

public class Main {
    public static void main ( String[] args){


        Scanner info = new Scanner(System.in);

        String name;
        int cod;
        double salario;

        System.out.println("Digite seu código");
        cod = Integer.parseInt(info.nextLine());
        System.out.println("Seu código é: " + cod);
        System.out.println("Digite seu nome");
        name = info.nextLine();
        System.out.println("Digite seu salário");
        salario = Double.parseDouble(info.nextLine());
        System.out.println("Seu nome é : " + name + ",  código: " + cod + " e salário de " + salario);

    }
}
