package streams;

import java.util.Arrays;
import java.util.List;

public class StreamComObjetos {

    public static void main(String[] args) {

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana", 25),
                new Pessoa("Bruno", 17),
                new Pessoa("Carla", 32),
                new Pessoa("Daniel", 15)
        );

        // Exemplo 1: filtrar apenas maiores de idade
        pessoas.stream()
                .filter(pessoa -> pessoa.getIdade() >= 18)
                .forEach(System.out::println);

        // Exemplo 2: extrair apenas os nomes das pessoas
        List<String> nomes = pessoas.stream()
                .map(Pessoa::getNome)
                .toList();

        System.out.println(nomes);
    }
}

/**
 * Classe de domínio simples para uso nos exemplos.
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
        return nome + " (" + idade + " anos)";
    }
}
