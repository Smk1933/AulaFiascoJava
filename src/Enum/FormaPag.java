package Enum;

public enum FormaPag {
    CREDITO("Pagamento via cartão de crédito", 1),
    DEBITO("Pagamento via cartão de débito", 2),
    PIX("Pagamento via app do banco", 3),
    CHEQUE("Pagamento inexistente", 4);

    private String descrição;
    private int codigoSist;

    FormaPag(String descrição, int codigoSist) {
        this.descrição = descrição;
        this.codigoSist = codigoSist;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getCodigoSist() {
        return codigoSist;
    }

    public void setCodigoSist(int codigoSist) {
        this.codigoSist = codigoSist;
    }
}
