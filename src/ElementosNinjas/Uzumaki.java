package ElementosNinjas;

public class Uzumaki extends Ninja{

    public Uzumaki() {
    }

    public Uzumaki(String name, int age, boolean temJinchuuriki, Elemento elemento, int numeroDeMissoes, Rank rank, int qi) {
        super(name, age, temJinchuuriki, elemento, numeroDeMissoes, rank, qi);
    }

    @Override
    public void golpeBasico() {
        System.out.println(name + " usou seu golpe basico");

    }

    @Override
    public void golpeEspecial(Elemento elemento) {
        System.out.println(name + " usou seu golpe especial do tipo " + elemento);
    }


}
