package EnumInterfAbstClass;

public class Advogados extends Pessoa {

    public Advogados(){
        super();
    }


    public Advogados(String name, int age, FormaPag typePayment) {
        super(name, age, typePayment);
    }



    @Override
    public void contratoCivil() {
        System.out.println("O contrato civil prevê que você vai perder tudo pra sua mulher");
    }
    @Override
    public void contratoPenal(){
        System.out.println("O contrato penal prevê que você será preso em 30 dias");
    }
}
