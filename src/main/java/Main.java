package main.java;

import main.java.model.iPhone;

public class Main {

    public static void main(String[] args) {
        iPhone iPhone = new iPhone();

        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("The Real Slim Shady - Eminen");

        System.out.println();

        iPhone.ligar("Eliane");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        System.out.println();

        iPhone.exibirPagina("Spotify");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}
