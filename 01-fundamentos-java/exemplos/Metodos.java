public class Metodos {

    public static void main(String[] args) {

        // Método sem retorno
        exibirMensagem();

        // Método com retorno
        int resultado = somar(5, 3);
        System.out.println("Resultado da soma: " + resultado);

        // Método com parâmetro
        exibirNome("Jeniffer");
    }

    // Método void
    public static void exibirMensagem() {
        System.out.println("Este é um método sem retorno");
    }

    // Método com retorno
    public static int somar(int a, int b) {
        return a + b;
    }

    // Método com parâmetro
    public static void exibirNome(String nome) {
        System.out.println("Nome informado: " + nome);
    }

}