package Enum;

public class Pessoa {

    String name;
    int age;
    FormaPag typePayment;

    public Pessoa(String name, int age, FormaPag typePayment) {
        this.name = name;
        this.age = age;
        this.typePayment = typePayment;
    }

    public void exibirStatus(){
        System.out.println("Meu nome é "+ name + ", eu tenho " + age + " e vou pagar via " + typePayment + "(" + typePayment.getDescrição() + ")" + " e código " + typePayment.getCodigoSist());
    }
}

