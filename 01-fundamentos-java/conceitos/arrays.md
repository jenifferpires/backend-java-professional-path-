# 📦 Arrays em Java.  

## 🎯 Objetivo deste conteúdo:  

Este material apresenta o conceito de **arrays em Java**, estruturas usadas para armazenar múltiplos valores do mesmo tipo em uma única variável.

Ao final deste conteúdo, você deverá:

* Entender o que são arrays.  
* Declarar e inicializar arrays.  
* Acessar e percorrer seus elementos.  

---

## 🧠 O que são arrays?

Um array é uma **estrutura de dados** que armazena uma coleção de valores do **mesmo tipo**, organizados por índices.

Cada posição do array possui um índice, que começa sempre em **0**.

Exemplo conceitual:

```text
Índices:   0   1   2
Valores: [10, 20, 30]
```

---

## 🧾 Declaração de arrays:  

Forma mais comum:

```java
int[] numeros;
```

Também é possível declarar assim:

```java
int numeros[];
```

📌 A primeira forma é a mais utilizada e recomendada.

---

## 🚀 Inicialização de arrays:  

Inicialização direta:

```java
int[] numeros = {10, 20, 30};
```

Inicialização com tamanho definido:

```java
int[] numeros = new int[3];
```

Nesse caso, os valores padrão serão atribuídos automaticamente:

* `0` para números
* `false` para boolean
* `null` para objetos

---

## 🔎 Acessando elementos:  

Para acessar um valor, utilize o índice:

```java
int primeiro = numeros[0];
```

⚠️ Acessar um índice inexistente causa erro (`ArrayIndexOutOfBoundsException`).

---

## 🔁 Percorrendo arrays:  

Usando `for` tradicional:

```java
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

Usando `for-each`:

```java
for (int numero : numeros) {
    System.out.println(numero);
}
```

---

## 🧠 Boas práticas:  

* Utilize `length` para evitar erros de índice.  
* Prefira `for-each` quando não precisar do índice.  
* Não misture tipos diferentes no mesmo array.  

---

## 📌 Conclusão:  

Arrays são fundamentais para trabalhar com **coleções de dados** em Java.

Eles são a base para estruturas mais avançadas como listas, mapas e algoritmos.

---

> Organizar dados é o primeiro passo para programar melhor.
