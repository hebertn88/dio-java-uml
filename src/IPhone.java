public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("Tocando música no Reprodutor!");
    }

    @Override
    public void pausar() {
        System.out.println("Reprodutor em Pausa.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar(String contato) {
        System.out.printf("Lingando para %s!\n", contato);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba no navegador de internet!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}
