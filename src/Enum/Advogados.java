package Enum;

public class Advogados implements Contratos {


    @Override
    public void contratoCivil() {
        System.out.println("O contrato civil prevê que você vai perder tudo pra sua mulher");
    }
    @Override
    public void contratoPenal(){
        System.out.println("O contrato penal prevê que você será preso em 30 dias");
    }
}
