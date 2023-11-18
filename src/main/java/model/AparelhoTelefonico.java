package main.java.model;

interface AparelhoTelefonico {

    default void ligar(String contato) {
        System.out.println("LIGANDO PARA " + contato.toUpperCase());
    }

    default void atender() {
        System.out.println("ATENDENDO TELEFONE");
    }

    default void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
}
