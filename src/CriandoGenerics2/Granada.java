package CriandoGenerics2;

public class Granada {

    private TypeGranada tipo;

    public Granada() {
    }

    public Granada(TypeGranada tipo){
        this.tipo = tipo;
    }

    public TypeGranada getTipo(){
        return tipo;
    }
    public void setTipo(TypeGranada tipo){
        this.tipo = tipo;
    }

    public String toString(){
        return "Granada do tipo: " + tipo + ", " + tipo.descricao;
    }
}
