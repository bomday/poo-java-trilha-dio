package br.com.aparelho;

import br.com.aparelho.usuario.Aparelho;

public class Iphone {
    public static void main(String[] args) {
        Aparelho celular = new Aparelho();

        celular.ligar(966334455);
        celular.atender();
        celular.iniciarCorreioVoz();

        celular.exibirPagina("google.com");
        celular.adicionarNovaAba("github.com");
        celular.atualizarPagina();

        celular.tocar("Taylor Swift - Clara Bow");
        celular.pausar();
        celular.selecionarMusica("Frank Ocean - Solo");
    }
}
