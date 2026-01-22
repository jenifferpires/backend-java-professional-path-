# 🔧 Métodos em Java.  

## 🎯 Objetivo deste conteúdo:  

Este material apresenta o conceito de **métodos em Java**, que permitem organizar, reutilizar e estruturar melhor o código.

Ao final deste conteúdo, você deverá:

* Entender o que são métodos.  
* Criar métodos com e sem retorno.  
* Utilizar parâmetros.  
* Compreender a importância da reutilização de código.  

---

## 🧠 O que são métodos?

Métodos são **blocos de código nomeados** que executam uma tarefa específica.

Eles ajudam a:

* organizar o código.  
* evitar repetição.  
* facilitar manutenção e testes.  

Em Java, todo método pertence a uma classe.

---

## 🧾 Estrutura básica de um método:  

```java
modificador retorno nomeDoMetodo(parametros) {
    // código do método
}
```

Exemplo simples:

```java
public static void saudacao() {
    System.out.println("Olá!");
}
```

---

## 🔄 Métodos sem retorno (`void`).  

Utilizados quando o método **executa uma ação**, mas não retorna valor.

```java
public static void mostrarMensagem() {
    System.out.println("Mensagem exibida");
}
```

---

## 🔙 Métodos com retorno:  

Utilizados quando o método **retorna um valor** ao final da execução.

```java
public static int somar(int a, int b) {
    return a + b;
}
```

📌 O tipo do `return` deve ser compatível com o tipo declarado no método.

---

## 📥 Parâmetros:  

Parâmetros permitem que o método receba valores externos.

```java
public static void exibirNome(String nome) {
    System.out.println(nome);
}
```

É possível passar vários parâmetros, separados por vírgula.

---

## 🧠 Boas práticas:  

* Use nomes claros e verbos no nome do método (`calcularTotal`, `validarLogin`).  
* Métodos devem ter uma única responsabilidade.  
* Evite métodos muito longos.  

---

## 📌 Conclusão:  

Métodos são fundamentais para escrever código **organizado, reutilizável e profissional** em Java.

Dominar métodos é essencial antes de avançar para orientação a objetos.

---

> Código bem dividido é código fácil de evoluir.
