public class Operadores {

    public static void main(String[] args) {

        // Operadores aritméticos
        int a = 10;
        int b = 5;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto da divisão: " + (a % b));

        // Operadores relacionais
        System.out.println("a é maior que b? " + (a > b));
        System.out.println("a é igual a b? " + (a == b));
        System.out.println("a é diferente de b? " + (a != b));

        // Operadores lógicos
        boolean condicao1 = a > b;
        boolean condicao2 = b > 0;

        System.out.println("condicao1 AND condicao2: " + (condicao1 && condicao2));
        System.out.println("condicao1 OR condicao2: " + (condicao1 || condicao2));
        System.out.println("NOT condicao1: " + (!condicao1));
    }

}
