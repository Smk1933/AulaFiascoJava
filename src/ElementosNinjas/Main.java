package ElementosNinjas;

public class Main {
    public static void main(String[] args) {

    Uzumaki uzu1 = new Uzumaki("Naruto Uzumaki", 18, true, Elemento.VENTO, 22,Rank.CHUNNIN, 80);
    Uchiha uch1 = new Uchiha("Itachi Uchiha", 25, false, Elemento.RELAMPAGO, 135, Rank.AKATSUKI, 180);

    uzu1.relatorioNinja();
    uch1.relatorioNinja();
    uzu1.conhecimentoNinja(uzu1.qi);
    uch1.conhecimentoNinja(uch1.qi);





    }


}
