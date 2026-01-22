public class EstruturasRepeticao {

    public static void main(String[] args) {

        // Exemplo de while
        int contadorWhile = 1;

        while (contadorWhile <= 3) {
            System.out.println("While - contador: " + contadorWhile);
            contadorWhile++;
        }

        // Exemplo de do while
        int contadorDoWhile = 1;

        do {
            System.out.println("Do While - contador: " + contadorDoWhile);
            contadorDoWhile++;
        } while (contadorDoWhile <= 3);

        // Exemplo de for
        for (int i = 1; i <= 3; i++) {
            System.out.println("For - contador: " + i);
        }

    }

}