package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> nomes = new Stack<>();

        nomes.push("Samuel");
        System.out.println(nomes);
        nomes.push("Fernanda");
        System.out.println(nomes);
        nomes.pop();
        System.out.println(nomes);


    }
}
