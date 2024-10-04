package CriandoGenerics2;

public enum TypeGranada {

    FUMACA("Ao ser acionada irá gerar uma grande fumaça"),
    EXPLOSIVA("Ao ser acionada irá gerar uma grande explosão"),
    CONCUSSAO("Ao ser acionada irá gerar um grande atordoamento em todos em volta"),
    FLASH("Ao ser acionada irá gerar uma forte luz");

    String descricao;

    TypeGranada(String descricao) {
        this.descricao = descricao;
    }



}
