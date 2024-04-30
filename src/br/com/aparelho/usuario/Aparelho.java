package br.com.aparelho.usuario;

import br.com.aparelho.funcionalidades.AparelhoTelefonico;
import br.com.aparelho.funcionalidades.NavegadorInternet;
import br.com.aparelho.funcionalidades.ReprodutorMusicial;

public class Aparelho implements ReprodutorMusicial, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar(String musica) {
        System.out.println("Tocando " + musica + "!!!");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música " + musica + " selecionada");
    }

    @Override
    public void ligar(int telefone) {
        System.out.println("Ligando para o número " + telefone);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Sua mensagem será gravada");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Página aberta");
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Nova página aberta");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
