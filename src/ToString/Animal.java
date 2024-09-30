package ToString;

public class Animal {

    String name;
    int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /* @Override
    public String toString() {
        return super.toString();
    } ISSO SERIA O PADRAO, PODERIAMOS ALTERAR PARA MOSTRAR UM STATUS DAQUELE OBJETO INSTANCIADO, POR EXEMPLO */

    @Override
    public String toString() {
        return "O " + name + " tem " + age + " anos";
    }
}
