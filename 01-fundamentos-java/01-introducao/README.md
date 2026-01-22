# 01 — Introdução ao Java.  

## 🎯 Objetivo do Módulo:  

Este módulo tem como objetivo **apresentar o Java do zero**, contextualizando a linguagem, seu ecossistema e o primeiro contato com código.

Ao final deste módulo, a pessoa estudante deverá:

* Entender **o que é Java** e por que ele é amplamente utilizado
* Conhecer os conceitos de **JVM, JRE e JDK**
* Compreender a **estrutura mínima** de um programa Java
* Executar seu primeiro código Java com segurança

Este módulo não exige conhecimento prévio em programação.

---

## 🧠 O que é Java?

Java é uma linguagem de programação de propósito geral, criada para ser:

* Portável ("escreva uma vez, execute em qualquer lugar").  
* Segura e robusta.  
* Escalável para sistemas grandes.  

Java é muito utilizada em:

* Sistemas corporativos e financeiros.  
* APIs e backends.  
* Aplicações desktop e mobile (Android).  

---

## ⚙️ Como o Java Funciona?

O Java não é executado diretamente pelo sistema operacional.

Fluxo simplificado:

1. O desenvolvedor escreve o código (`.java`)
2. O compilador transforma esse código em bytecode (`.class`)
3. A JVM executa o bytecode

Esse modelo garante portabilidade entre sistemas operacionais.

---

## 📦 JVM, JRE e JDK

* **JVM (Java Virtual Machine)**
  Executa o bytecode Java.

* **JRE (Java Runtime Environment)**
  Contém a JVM e bibliotecas necessárias para rodar aplicações.

* **JDK (Java Development Kit)**
  Inclui a JRE e ferramentas para desenvolvimento.

Para programar em Java, é necessário ter o **JDK instalado**.

---

## 🧱 Estrutura Básica de um Programa Java

Todo programa Java possui ao menos:

* Uma classe
* Um método `main`

Exemplo:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```

Neste momento, o foco é reconhecer a estrutura — não decorar cada palavra.

---

## 📁 Conteúdo deste Diretório

* `HelloWorld.java` → primeiro contato com código Java.  
* `README.md` → explicação conceitual do módulo.  

---

## 📌 Observações Importantes

* Java é sensível a maiúsculas e minúsculas.  
* Erros são parte natural do aprendizado.  
* Entendimento vem antes de velocidade.  

---

> Todo desenvolvedor Java experiente começou exatamente aqui.
