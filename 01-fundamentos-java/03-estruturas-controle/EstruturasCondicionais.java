public class EstruturasCondicionais {

    public static void main(String[] args) {

        int idade = 18;

        // Exemplo simples de if
        if (idade >= 18) {
            System.out.println("Pessoa maior de idade");
        }

        // Exemplo de if / else
        int nota = 6;

        if (nota >= 7) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }

        // Exemplo de if / else if / else
        int horario = 14;

        if (horario < 12) {
            System.out.println("Bom dia");
        } else if (horario < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

    }

}