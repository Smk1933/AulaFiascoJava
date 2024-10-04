package CriandoGenerics2;

public class Main {
    public static void main(String[] args) {

        EquipamentosSoldado<Object> bolsaDeEquipamentos = new EquipamentosSoldado<>();

        bolsaDeEquipamentos.addEquipamentos(new Arma("Ak47", "galishnikov", 30));
        bolsaDeEquipamentos.addEquipamentos(new Granada(TypeGranada.EXPLOSIVA));
        bolsaDeEquipamentos.addEquipamentos(new Arma("M4", "Topson", 23));
        bolsaDeEquipamentos.addEquipamentos(new Granada(TypeGranada.FUMACA));

        bolsaDeEquipamentos.statusEquipamento();





    }
}
