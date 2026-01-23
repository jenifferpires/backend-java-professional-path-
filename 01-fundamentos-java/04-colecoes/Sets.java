import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        // Set representa uma coleção que NÃO permite elementos duplicados
        Set<String> linguagens = new HashSet<>();

        // Adicionando elementos
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("Java"); // duplicado, será ignorado
        linguagens.add("JavaScript");

        System.out.println("Linguagens cadastradas:");
        for (String linguagem : linguagens) {
            System.out.println(linguagem);
        }

        // Verificando se um elemento existe
        System.out.println("\nContém Java? " + linguagens.contains("Java"));

        // Removendo um elemento
        linguagens.remove("Python");

        System.out.println("\nApós remoção:");
        linguagens.forEach(System.out::println);

        // Tamanho do Set
        System.out.println("\nTotal de linguagens: " + linguagens.size());
    }

}