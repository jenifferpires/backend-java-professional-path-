# Exceções e Tratamento de Erros em Java.  

## 🎯 Objetivo do Conteúdo:  

Explicar o que são **exceções em Java**, como tratá-las corretamente e por que o tratamento de erros é essencial para criar aplicações **robustas**, **seguras** e **profissionais**.

Ao final deste conteúdo, você será capaz de:

* Entender o conceito de exceções.  
* Diferenciar exceções *checked* e *unchecked*.  
* Utilizar `try`, `catch` e `finally`.  
* Criar exceções customizadas.  

---

## 🧠 O que são Exceções?

Uma **exceção** é um evento inesperado que ocorre durante a execução do programa e interrompe o fluxo normal da aplicação.

Exemplos comuns:

* divisão por zero.  
* acesso a posição inválida de um array.  
* arquivo não encontrado.  
* erro de conexão.  

---

## ⚠️ Por que Tratar Exceções?

Sem tratamento adequado, a aplicação:

* pode encerrar abruptamente.  
* perde confiabilidade.  
* dificulta diagnóstico de problemas.  

Com tratamento correto, é possível:

* controlar falhas.  
* exibir mensagens adequadas.  
* manter o sistema estável.  

---

## 🧩 Hierarquia de Exceções:  

Em Java, todas as exceções herdam da classe `Throwable`.

Principais categorias:

* `Error` → erros graves da JVM (não devem ser tratados).  
* `Exception` → erros que podem ser tratados pela aplicação.  

---

## ✅ Checked vs Unchecked Exceptions.  

### Checked Exceptions:  

* Verificadas em tempo de compilação.  
* Devem ser tratadas ou declaradas.  

Exemplo:

```java
IOException
SQLException
```

### Unchecked Exceptions:  

* Ocorrem em tempo de execução
* Herdeiras de `RuntimeException`

Exemplo:

```java
NullPointerException
ArithmeticException
```

---

## 🛠️ Try, Catch e Finally.  

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Erro: divisão por zero");
} finally {
    System.out.println("Finalizando operação");
}
```

* `try`: bloco que pode gerar exceção
* `catch`: tratamento da exceção
* `finally`: sempre executado

---

## 🔁 Múltiplos Catch.  

```java
try {
    // código
} catch (IOException e) {
    // tratamento
} catch (Exception e) {
    // tratamento genérico
}
```

A ordem importa: exceções mais específicas primeiro.

---

## 🧱 Criando Exceções Customizadas:  

```java
public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
```

Uso:

```java
if (saldo < valor) {
    throw new SaldoInsuficienteException("Saldo insuficiente");
}
```

---

## 📌 Boas Práticas:  

* Não capture exceções genéricas sem necessidade.  
* Nunca ignore exceções.  
* Use mensagens claras.  
* Utilize exceções customizadas para regras de negócio.  
* Não use exceções para controle de fluxo normal.  

---

## 🧠 Conclusão:  

O tratamento de exceções é essencial para garantir qualidade e confiabilidade em aplicações Java.

Código profissional não evita erros — ele sabe lidar com eles.

---

## 🔗 Próximo Conteúdo:  

👉 **Coleções em Java (List, Set, Map)**
Como trabalhar com estruturas de dados de forma eficiente.
