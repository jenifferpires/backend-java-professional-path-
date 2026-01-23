package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPIPratica {

    public static void main(String[] args) {

        // =========================
        // Exemplo 1 — Filter + forEach
        // =========================
        List<String> nomes = Arrays.asList(
                "Ana", "Bruno", "Amanda", "Carlos", "Alice"
        );

        System.out.println("Nomes que começam com A:");
        nomes.stream()
                .filter(nome -> nome.startsWith("A"))
                .forEach(System.out::println);


        // =========================
        // Exemplo 2 — Map + Collect
        // =========================
        List<Integer> numeros = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> numerosAoQuadrado = numeros.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("\nNúmeros ao quadrado:");
        System.out.println(numerosAoQuadrado);


        // =========================
        // Exemplo 3 — Filter + Map + Sorted
        // =========================
        List<String> palavras = Arrays.asList(
                "java", "stream", "lambda", "api", "backend"
        );

        List<String> resultado = palavras.stream()
                .filter(p -> p.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\nPalavras filtradas, transformadas e ordenadas:");
        System.out.println(resultado);


        // =========================
        // Exemplo 4 — Stream com objetos (Map)
        // =========================
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana", 22),
                new Pessoa("Bruno", 30),
                new Pessoa("Carla", 25),
                new Pessoa("Daniel", 30)
        );

        Map<Integer, List<Pessoa>> pessoasPorIdade = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getIdade));

        System.out.println("\nPessoas agrupadas por idade:");
        pessoasPorIdade.forEach((idade, lista) ->
                System.out.println(idade + " -> " + lista)
        );


        // =========================
        // Exemplo 5 — Count + AnyMatch
        // =========================
        long maioresDe25 = pessoas.stream()
                .filter(p -> p.getIdade() > 25)
                .count();

        boolean existeMenorDe18 = pessoas.stream()
                .anyMatch(p -> p.getIdade() < 18);

        System.out.println("\nQuantidade de pessoas com mais de 25 anos: " + maioresDe25);
        System.out.println("Existe alguém menor de 18? " + existeMenorDe18);
    }
}

/**
 * Classe simples de apoio para exemplos com objetos
 */
class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + " (" + idade + ")";
    }
}
