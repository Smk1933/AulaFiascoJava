package CriandoGenerics2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EquipamentosSoldado<T>{

    private List<T> equipamentos;

    public EquipamentosSoldado(){
        this.equipamentos = new ArrayList<>();
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public void addEquipamentos(T equipamento){
        equipamentos.add(equipamento);
    }

    public void statusEquipamento(){
        for (T equipamento : equipamentos){
            System.out.println(equipamento);
        }
    }
}
