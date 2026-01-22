# Stream API em Java.  

## 🎯 Objetivo do Conteúdo:  

Apresentar a **Stream API do Java**, explicando como trabalhar com coleções de forma **funcional**, **expressiva** e **eficiente**, substituindo loops imperativos por operações declarativas.

Ao final deste conteúdo, você será capaz de:

* Entender o que é uma Stream. 
* Diferenciar operações intermediárias e terminais.  
* Utilizar `map`, `filter`, `reduce`.  
* Ler e escrever código Java moderno.  

---

## 🧠 O que é Stream API?

A **Stream API** permite processar coleções de dados de forma funcional, utilizando uma sequência de operações encadeadas.

> 📌 Uma Stream **não armazena dados**, ela processa dados de uma fonte (listas, arrays, etc.).

---

## 🔁 Loop Tradicional vs Stream.  

### Exemplo com loop:  

```java
List<String> nomes = List.of("Ana", "Bruno", "Carlos");

for (String nome : nomes) {
    if (nome.startsWith("A")) {
        System.out.println(nome.toUpperCase());
    }
}
```

### Mesmo exemplo com Stream:  

```java
nomes.stream()
      .filter(nome -> nome.startsWith("A"))
      .map(String::toUpperCase)
      .forEach(System.out::println);
```

*Mais legível e expressivo.* 

---

## 🧩 Operações Intermediárias:  

São operações que **retornam uma nova Stream**:

* `filter()`
* `map()`
* `sorted()`
* `distinct()`

Exemplo:

```java
nomes.stream()
     .filter(n -> n.length() > 3)
     .map(String::toLowerCase);
```

⚠️ Nada é executado até uma operação terminal ser chamada.

---

## 🏁 Operações Terminais: 

Encerram a Stream e produzem um resultado:

* `forEach()`
* `collect()`
* `count()`
* `reduce()`

Exemplo:

```java
long total = nomes.stream().count();
```

---

## 🔄 Map.  

Transforma cada elemento da Stream:

```java
List<Integer> tamanhos = nomes.stream()
    .map(String::length)
    .toList();
```

---

## 🔍 Filter.  

Filtra elementos com base em uma condição:

```java
List<String> filtrados = nomes.stream()
    .filter(n -> n.startsWith("C"))
    .toList();
```

---

## ➕ Reduce.  

Combina elementos em um único resultado:

```java
int soma = List.of(1, 2, 3, 4)
    .stream()
    .reduce(0, Integer::sum);
```

---

## 📦 Collectors.  

Usado para transformar o resultado da Stream:

```java
List<String> resultado = nomes.stream()
    .filter(n -> n.length() > 3)
    .collect(Collectors.toList());
```

---

## ⚡ Streams Paralelas.  

```java
nomes.parallelStream()
     .forEach(System.out::println);
```

⚠️ Use com cuidado — nem sempre melhora performance.

---

## 📌 Boas Práticas:   

* Prefira Streams para leitura e transformação.  
* Evite lógica complexa dentro de lambdas.  
* Não modifique dados externos na Stream.  
* Use Streams para clareza, não apenas concisão.  

---

## 🧠 Conclusão:  

A Stream API traz um estilo moderno e funcional para o Java, tornando o código mais legível e expressivo.

É amplamente utilizada em projetos profissionais e APIs modernas.

---

## 🔗 Próximo Conteúdo:   

👉 **Java Optional**
Como evitar `NullPointerException` de forma elegante.
