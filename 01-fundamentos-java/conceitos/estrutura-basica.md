# 🧱 Estrutura Básica de um Programa Java.  

## 🎯 Objetivo deste conteúdo:  

Este material tem como objetivo apresentar a **estrutura mínima de um programa Java**, explicando cada parte de forma clara e gradual.

A ideia não é aprofundar todos os conceitos agora, mas permitir que você:

* Reconheça a forma de um código Java.  
* Entenda o papel de cada elemento principal.  
* Leia um programa simples sem estranhamento.  

---

## 📌 O que todo programa Java precisa ter?  

Um programa Java básico possui, obrigatoriamente:

1. Uma **classe**.   
2. Um método principal chamado **`main`**.  

Sem esses elementos, o programa não consegue ser executado.

---

## 🧩 Exemplo completo:  

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```

Vamos analisar esse código por partes.

---

## 🏷️ A classe

```java
public class HelloWorld {
}
```

* `class` define uma **classe**.  
* `HelloWorld` é o nome da classe
* O nome da classe deve ser o mesmo nome do arquivo (`HelloWorld.java`).  

📌 Em Java, **todo código vive dentro de uma classe**.

---

## ▶️ O método `main`

```java
public static void main(String[] args)
```

Esse é o **ponto de entrada** do programa.

Quando o Java executa uma aplicação, ele procura exatamente por esse método.

Por enquanto, é suficiente saber que:

* `main` é obrigatório.  
* Ele indica por onde o programa começa a rodar.  

---

## 🧩 Modificadores básicos:  

Mesmo sem entender tudo agora, é importante reconhecer alguns termos:

* `public` → indica que o método pode ser acessado.  
* `static` → permite que o método seja executado sem criar um objeto.  
* `void` → indica que o método não retorna valor.  

Esses conceitos serão aprofundados nos próximos módulos.

---

## 🖨️ Instruções dentro do método:  

```java
System.out.println("Olá, mundo!");
```

Essa linha:

* Executa uma instrução.  
* Imprime uma mensagem no console.  

Cada instrução em Java termina com `;`.

---

## 🧠 Observações importantes:  

* Java é sensível a maiúsculas e minúsculas.  
* A organização do código facilita a leitura.  
* No início, foque em **entender a estrutura**, não em decorar tudo.  

---

## 📌 Conclusão:  

Compreender a estrutura básica de um programa Java é o primeiro passo para escrever código com segurança.

Nos próximos conteúdos, esses elementos serão reutilizados constantemente, até que se tornem naturais.

---

> Antes de escrever código complexo, é fundamental reconhecer bem a forma do código simples.
