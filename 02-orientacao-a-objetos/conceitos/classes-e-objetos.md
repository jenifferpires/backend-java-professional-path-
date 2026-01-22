# 🧱 Classes e Objetos em Java.  

## 🎯 Objetivo deste conteúdo:  

Este material tem como objetivo explicar de forma clara o que são **classes** e **objetos** em Java, como eles se relacionam e por que são a base da Programação Orientada a Objetos.

Ao final deste conteúdo, você deverá:

* Entender o conceito de classe.  
* Entender o conceito de objeto.  
* Saber como uma classe gera objetos.  
* Relacionar esses conceitos com exemplos do mundo real.  

---

## 🧠 O que é uma classe?

Uma **classe** é um **modelo**, um **molde** ou um **template** que define como os objetos serão criados.

Ela descreve:

* quais **atributos** o objeto terá (dados).  
* quais **métodos** o objeto poderá executar (comportamentos).  

A classe **não é o objeto em si**, mas a definição dele.

---

## 🌍 Exemplo do mundo real (classe)

Pense em uma **Pessoa**:

* nome
* idade
* documento

Essas características definem o que é uma pessoa, mas **não representam uma pessoa específica**.

Isso é o papel de uma **classe**.

---

## 🧩 O que é um objeto?

Um **objeto** é uma **instância de uma classe**.

Ou seja, é a materialização da classe, representando algo concreto.

Se a classe é o molde, o objeto é o item criado a partir desse molde.

---

## 🌍 Exemplo do mundo real (objeto).  

A partir da classe `Pessoa`, podemos criar objetos como:

* Pessoa chamada Ana, 30 anos.  
* Pessoa chamada Bruno, 25 anos.  

Cada objeto:

* possui seus próprios valores.  
* compartilha a mesma estrutura definida pela classe.  

---

## 🔧 Classe x Objeto (resumo).  

| Classe    | Objeto     |
| --------- | ---------- |
| Molde     | Instância  |
| Definição | Realização |
| Abstrato  | Concreto   |

---

## 💻 Exemplo simples em Java:  

```java
class Pessoa {
    String nome;
    int idade;
}
```

Criando objetos a partir da classe:

```java
Pessoa pessoa1 = new Pessoa();
pessoa1.nome = "Ana";
pessoa1.idade = 30;

Pessoa pessoa2 = new Pessoa();
pessoa2.nome = "Bruno";
pessoa2.idade = 25;
```

Cada objeto é independente, mesmo usando a mesma classe.

---

## 🧠 Boas práticas:  

* Classes devem representar **conceitos do domínio**
* Use nomes substantivos e no singular (`Pessoa`, `Conta`, `Produto`)
* Evite classes genéricas demais

---

## 📌 Conclusão:  

Classes e objetos são o **coração da POO**.

Compreender bem essa relação é essencial para avançar para:

* atributos e métodos.  
* construtores.  
* encapsulamento.  
* herança e polimorfismo.  

---

> Uma boa classe gera bons objetos.
