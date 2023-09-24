public class Program {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        // metodos Reprodutor Musical
        iphone.selecionarMusica("Happy - by Pharrell William");
        iphone.tocar();
        iphone.pausar();

        // metodos Aparelho Telefonico
        iphone.ligar("Gleyson Sampaio");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // metodos Navegador Internet
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://web.dio.me/");
        iphone.atualizarPagina();

        // teste Interfaces
        ReprodutorMusical reprodutorMusical = iphone;
        AparelhoTelefonico aparelhoTelefonico = iphone;
        NavegadorInternet navegadorInternet = iphone;

        reprodutorMusical.tocar();
        aparelhoTelefonico.iniciarCorreioVoz();
        navegadorInternet.adicionarNovaAba();
    }
}
