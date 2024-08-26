import component.*;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação!");
    }

    @Override
    public void atender() {
        System.out.println("Atender chamada!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar música!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar música!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar música!");
    }
    
}