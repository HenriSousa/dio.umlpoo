public class App {
    public static void main(String[] args) throws Exception {
        
        iPhone phone = new iPhone();
        phone.adicionarNovaAba();
        phone.atender();
        phone.atualizarPagina();
        phone.exibirPagina();
        phone.iniciarCorreioVoz();
        phone.ligar();
        phone.pausar();
        phone.selecionarMusica();
        phone.tocar();
    }
}
