package main.java.model;

public interface NavegadorInternet {

    default void exibirPagina(String pagina) {
        System.out.println("EXIBINDO A PÁGINA " + pagina.toUpperCase());
    }

    default void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    default void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }
}
