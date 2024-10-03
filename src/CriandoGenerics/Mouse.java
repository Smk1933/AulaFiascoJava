package CriandoGenerics;

public class Mouse {

    private String modelo;

    public Mouse(String modelo){
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String toString(){
        return "Mouse de modelo: " + modelo;
    }
}
