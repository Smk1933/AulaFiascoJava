package ElementosNinjas;

public abstract class Ninja implements Habilidade {

    String name;
    int age;
    boolean temJinchuuriki;
    Elemento elemento;
    int numeroDeMissoes;
    Rank rank;
    int qi;


    public Ninja() {
    }

    public Ninja(String name, int age, boolean temJinchuuriki, Elemento elemento, int numeroDeMissoes, Rank rank, int qi) {
        this.name = name;
        this.age = age;
        this.temJinchuuriki = temJinchuuriki;
        this.elemento = elemento;
        this.numeroDeMissoes = numeroDeMissoes;
        this.rank = rank;
        this.qi = qi;
    }

    final void tacarKunai(){                  //Metodos final impedem que sejam sobreescritos, alterado e afins... pode ser usado em classes, argumentos, qualquer coisa
        System.out.println("Tacando Kunai");
    }

    @Override
    public void golpeBasico() {

    }

    @Override
    public void golpeEspecial(Elemento elemento) {

    }

    @Override
    public void conhecimentoNinja() {     //utilizando sobreescrita
        System.out.println("Esse ninja possui conhecimento");
    }

    public void conhecimentoNinja(int qi){    //utilizando sobrecarga de metodos
        if (qi >= 200){
            System.out.println("Nível de conhecimento: Gênio");
        } else if (qi >= 120){
            System.out.println("Nível de conhecimento: Prodígio");
        } else if (qi >= 80){
            System.out.println("Nível de conhecimento: Ninja mediano");
        } else {
            System.out.println("Nível de conhecimento: Mediocre");
        }
    }

    public void relatorioNinja(){
        System.out.println(name + " tem " + age + " anos e possui Jinchuuriki: " + temJinchuuriki + ", usa o elemento do tipo : " + elemento + " já completou " + numeroDeMissoes + " missões, atualmento ele é " + rank + " e possui qi de " + qi);
    }
}


