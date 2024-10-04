package CriandoGenerics2;

public class Arma {

    private String name;
    private String model;
    private int numeroBalas;

    public Arma(){
    }

    public Arma(String name, String model, int numeroBalas){
        this.name = name;
        this.model = model;
        this.numeroBalas = numeroBalas;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getNumeroBalas(){
        return numeroBalas;
    }

    public void setNumeroBalas(int numeroBalas){
        this.numeroBalas = numeroBalas;
    }

    public String toString(){
        return name + " do modelo " + model + " possui " + numeroBalas + " balas.";
    }

}
