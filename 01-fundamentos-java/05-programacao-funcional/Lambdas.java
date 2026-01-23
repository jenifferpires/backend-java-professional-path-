import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambdas {

    public static void main(String[] args) {

        /*
         * ===============================
         * 1. O que é uma Lambda?
         * ===============================
         *
         * Uma expressão lambda representa um comportamento (função)
         * que pode ser passado como argumento ou atribuído a uma variável.
         */

        // Exemplo simples: imprimir uma mensagem
        Runnable tarefa = () -> System.out.println("Executando uma lambda!");
        tarefa.run();

        /*
         * ===============================
         * 2. Lambda + Interface Funcional
         * ===============================
         *
         * Lambdas só funcionam porque existe uma INTERFACE FUNCIONAL
         * (uma interface com apenas um método abstrato).
         */

        /*
         * Consumer<T>
         * Recebe um valor e não retorna nada
         */
        Consumer<String> imprimirNome = nome -> System.out.println("Nome: " + nome);
        imprimirNome.accept("Jeniffer");

        /*
         * Predicate<T>
         * Recebe um valor e retorna true ou false
         */
        Predicate<Integer> ehMaiorDeIdade = idade -> idade >= 18;

        System.out.println("Maior de idade? " + ehMaiorDeIdade.test(20));
        System.out.println("Maior de idade? " + ehMaiorDeIdade.test(15));

        /*
         * Function<T, R>
         * Recebe um valor e retorna outro
         */
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        System.out.println("Dobro de 5: " + dobrar.apply(5));

        /*
         * ===============================
         * 3. Comparação: sem lambda x com lambda
         * ===============================
         */

        // Sem lambda (classe anônima)
        Runnable formaAntiga = new Runnable() {
            @Override
            public void run() {
                System.out.println("Forma antiga, sem lambda");
            }
        };

        formaAntiga.run();

        // Com lambda
        Runnable formaNova = () -> System.out.println("Forma nova, com lambda");
        formaNova.run();

        /*
         * ===============================
         * 4. Pontos importantes
         * ===============================
         *
         * - Lambdas NÃO substituem orientação a objetos
         * - Elas facilitam passar comportamento
         * - São base para Programação Funcional e Stream API
         */
    }
}
