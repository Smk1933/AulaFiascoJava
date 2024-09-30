package ElementosNinjas;

public class Uchiha extends Ninja implements Sharigan {


    public Uchiha() {
    }

    public Uchiha(String name, int age, boolean temJinchuuriki, Elemento elemento, int numeroDeMissoes, Rank rank, int qi) {
        super(name, age, temJinchuuriki, elemento, numeroDeMissoes, rank, qi);
    }

    @Override
    public void ativarSharigan() {
        System.out.println(name + " ativou o Sharigan");
    }


}
