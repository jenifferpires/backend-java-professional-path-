package streams;

import java.util.Arrays;
import java.util.List;

public class StreamBasico {

    public static void main(String[] args) {

        // Lista simples de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Exemplo 1: filtrar números pares e imprimir
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        // Exemplo 2: transformar números (dobrar valores)
        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2)
                .toList();

        System.out.println(numerosDobrados);

        // Lista simples de nomes
        List<String> nomes = Arrays.asList("Ana", "Bruno", "Carla", "Daniel");

        // Exemplo 3: filtrar nomes com mais de 4 letras
        nomes.stream()
                .filter(nome -> nome.length() > 4)
                .forEach(System.out::println);
    }
}
