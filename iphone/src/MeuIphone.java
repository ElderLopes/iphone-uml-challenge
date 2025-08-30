
public class MeuIphone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("--- Funções de Reprodutor Musical ---");
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.tocar();
        iphone.pausar();
        System.out.println();

        System.out.println("--- Funções de Aparelho Telefônico ---");
        iphone.ligar("1199999-8888");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println();
        
        System.out.println("--- Funções de Navegador na Internet ---");
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        System.out.println();
    }
}