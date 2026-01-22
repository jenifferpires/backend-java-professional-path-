# 🔀 Estruturas Condicionais em Java.  

## 🎯 Objetivo deste conteúdo:  

Este material apresenta as **estruturas condicionais em Java**, responsáveis por permitir que o programa tome decisões com base em condições lógicas.

Ao final deste conteúdo, você deverá:

* Entender como o Java avalia condições.  
* Utilizar `if`, `else if` e `else`.  
* Escrever decisões claras e legíveis no código.  

---

## 🧠 O que são estruturas condicionais?

Estruturas condicionais permitem que o fluxo do programa **siga caminhos diferentes** dependendo do resultado de uma condição (`true` ou `false`).

Elas são essenciais para:

* validações.  
* regras de negócio.  
* controle de fluxo.  

---

## ✅ Estrutura `if`.  

Executa um bloco de código **apenas se** a condição for verdadeira.

```java
if (condicao) {
    // código executado se a condição for verdadeira
}
```

📌 A condição deve sempre resultar em `boolean`.

---

## 🔁 Estrutura `if / else`.  

Permite definir um caminho alternativo quando a condição é falsa.

```java
if (condicao) {
    // condição verdadeira
} else {
    // condição falsa
}
```

---

## 🔄 Estrutura `if / else if / else`.  

Usada quando há **mais de uma condição possível**.

```java
if (condicao1) {
    // primeira condição
} else if (condicao2) {
    // segunda condição
} else {
    // nenhuma condição atendida
}
```

O Java avalia as condições **em ordem**, e executa o primeiro bloco verdadeiro.

---

## ⚠️ Cuidados importantes:  

* Use chaves `{}` mesmo em blocos pequenos.  
* Evite condições muito longas.  
* Prefira clareza à compactação.  

❌ Evite:

```java
if (a > b) System.out.println("Maior");
```

✅ Prefira:  

```java
if (a > b) {
    System.out.println("Maior");
}
```

---

## 🧠 Boas práticas:  

* Nomeie variáveis de forma semântica (`isAtivo`, `temPermissao`)
* Evite aninhar muitos `if`s
* Extraia regras complexas para métodos

---

## 📌 Conclusão:  

Estruturas condicionais são a base da **lógica de decisão** em Java.

Dominá-las é essencial antes de avançar para estruturas de repetição e lógica mais avançada.

---

> Código legível é código fácil de manter.
