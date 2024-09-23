package EnumInterfAbstClass;

public abstract class Pessoa implements Contratos {

    String name;
    int age;
    FormaPag typePayment;

    public Pessoa(){

    }

    public Pessoa(String name, int age, FormaPag typePayment) {
        this.name = name;
        this.age = age;
        this.typePayment = typePayment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void exibirStatus(){
        System.out.println("Meu nome é "+ name + ", eu tenho " + age + " e vou pagar via " + typePayment + "(" + typePayment.getDescrição() + ")" + " e código " + typePayment.getCodigoSist());
    }
}

