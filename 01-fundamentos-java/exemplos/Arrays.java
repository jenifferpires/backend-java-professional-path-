public class Arrays {

    public static void main(String[] args) {

        // Declaração e inicialização direta
        int[] numeros = {10, 20, 30, 40, 50};

        // Acesso por índice
        System.out.println("Primeiro elemento: " + numeros[0]);
        System.out.println("Último elemento: " + numeros[numeros.length - 1]);

        // Percorrendo com for tradicional
        System.out.println("Percorrendo com for tradicional:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + " -> " + numeros[i]);
        }

        // Percorrendo com for-each
        System.out.println("Percorrendo com for-each:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Array de String
        String[] nomes = {"Ana", "Bruno", "Carlos"};

        System.out.println("Lista de nomes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

    }

}
