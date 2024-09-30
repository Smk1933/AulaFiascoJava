package ToString;

public class Main {
    public static void main(String[] args) {

        Animal n1 = new Animal("Cachorro",5);
        System.out.println(n1); // ao inves de aparecer a memoria de refencia desse objeto, agora aparece a msg personalizada via ToString()
    }

}
