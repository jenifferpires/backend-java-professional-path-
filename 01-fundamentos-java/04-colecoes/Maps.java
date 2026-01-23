package colecoes;

import java.util.HashMap;
import java.util.Map;

/**
 * Exemplo introdutório de uso de Map em Java.
 *
 * Map representa uma estrutura de dados baseada em pares chave-valor.
 * Cada chave é única e aponta para um valor.
 */
public class Maps {

    public static void main(String[] args) {

        // Criação de um Map usando HashMap
        Map<String, Integer> idadePorNome = new HashMap<>();

        // Adicionando elementos (chave, valor)
        idadePorNome.put("Ana", 28);
        idadePorNome.put("Bruno", 35);
        idadePorNome.put("Carlos", 22);

        // Sobrescrita de valor ao usar a mesma chave
        idadePorNome.put("Ana", 29);

        // Acessando um valor pela chave
        System.out.println("Idade da Ana: " + idadePorNome.get("Ana"));

        // Verificando se uma chave existe
        System.out.println("Existe chave 'Bruno'? " + idadePorNome.containsKey("Bruno"));

        // Verificando se um valor existe
        System.out.println("Existe valor 22? " + idadePorNome.containsValue(22));

        // Tamanho do Map
        System.out.println("Total de pessoas: " + idadePorNome.size());

        // Iterando sobre chaves
        System.out.println("\nIterando pelas chaves:");
        for (String nome : idadePorNome.keySet()) {
            System.out.println(nome);
        }

        // Iterando sobre valores
        System.out.println("\nIterando pelos valores:");
        for (Integer idade : idadePorNome.values()) {
            System.out.println(idade);
        }

        // Iterando sobre pares chave-valor
        System.out.println("\nIterando pelos pares chave-valor:");
        for (Map.Entry<String, Integer> entry : idadePorNome.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Removendo um elemento
        idadePorNome.remove("Carlos");

        System.out.println("\nMap após remoção: " + idadePorNome);
    }
}
