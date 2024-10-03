package CriandoGenerics;

public class CadeiraGamer {

    private String modelo;

    public CadeiraGamer(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String toString(){
        return "Cadeira de modelo: " + modelo;
    }
}
