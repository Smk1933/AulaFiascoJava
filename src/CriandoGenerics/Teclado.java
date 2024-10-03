package CriandoGenerics;

public class Teclado {

    private String modelo;

    public Teclado(String modelo){
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
