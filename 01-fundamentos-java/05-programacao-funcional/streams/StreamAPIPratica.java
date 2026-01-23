package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPIPratica {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Ana", "TI", 4500),
                new Funcionario("Bruno", "RH", 3200),
                new Funcionario("Carla", "TI", 5200),
                new Funcionario("Daniel", "Financeiro", 6000),
                new Funcionario("Eva", "RH", 3900)
        );

        // 1️⃣ Filtrar funcionários do setor de TI
        List<Funcionario> funcionariosTI = funcionarios.stream()
                .filter(f -> f.getDepartamento().equalsIgnoreCase("TI"))
                .toList();

        System.out.println("Funcionários de TI:");
        funcionariosTI.forEach(System.out::println);

        // 2️⃣ Extrair nomes dos funcionários com salário acima de 4000
        List<String> nomesSalarioAlto = funcionarios.stream()
                .filter(f -> f.getSalario() > 4000)
                .map(Funcionario::getNome)
                .toList();

        System.out.println("\nFuncionários com salário acima de 4000:");
        nomesSalarioAlto.forEach(System.out::println);

        // 3️⃣ Agrupar funcionários por departamento
        Map<String, List<Funcionario>> funcionariosPorDepartamento =
                funcionarios.stream()
                        .collect(Collectors.groupingBy(Funcionario::getDepartamento));

        System.out.println("\nFuncionários agrupados por departamento:");
        funcionariosPorDepartamento.forEach((dep, lista) -> {
            System.out.println(dep + ": " + lista);
        });

        // 4️⃣ Contar funcionários por departamento
        Map<String, Long> quantidadePorDepartamento =
                funcionarios.stream()
                        .collect(Collectors.groupingBy(
                                Funcionario::getDepartamento,
                                Collectors.counting()
                        ));

        System.out.println("\nQuantidade de funcionários por departamento:");
        quantidadePorDepartamento.forEach((dep, qtd) ->
                System.out.println(dep + ": " + qtd)
        );
    }
}

/**
 * Classe de domínio utilizada para exemplos práticos.
 */
class Funcionario {

    private String nome;
    private String departamento;
    private double salario;

    public Funcionario(String nome, String departamento, double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return nome + " - " + departamento + " - R$ " + salario;
    }
}
