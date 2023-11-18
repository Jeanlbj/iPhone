package main.java.model;

public interface ReprodutorMusical {

    default void tocar() {
        System.out.println("TOCANDO A MÚSICA");
    }

    default void pausar() {
        System.out.println("MÚSICA PAUSADA");
    }

    default void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO A MÚSICA: " + musica.toUpperCase());
        tocar();
    }
}
