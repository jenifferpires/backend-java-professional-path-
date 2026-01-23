import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {

        // Criação de uma List usando ArrayList
        List<String> nomes = new ArrayList<>();

        // Adicionando elementos
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");
        nomes.add("Ana"); // listas permitem elementos duplicados

        // Acessando elementos pelo índice
        System.out.println("Primeiro nome: " + nomes.get(0));

        // Iterando sobre a lista
        System.out.println("Lista completa:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Removendo um elemento
        nomes.remove("Bruno");

        System.out.println("\nApós remoção:");
        nomes.forEach(System.out::println);

        // Tamanho da lista
        System.out.println("\nTotal de elementos: " + nomes.size());
    }
}
