# ☕ 01 — Fundamentos de Java.  

## 🎯 Objetivo do Módulo:  

Este módulo tem como objetivo apresentar a **base sólida da linguagem Java**, de forma **didática, progressiva e reutilizável**, partindo do zero absoluto até fundamentos modernos utilizados no mercado.

Ao final deste módulo, a pessoa estudante deverá ser capaz de:

* Entender **o que é Java** e onde ele é utilizado
* Compreender **como o Java funciona internamente** (JVM, JRE e JDK)
* Ler, escrever e executar **programas simples em Java**
* Reconhecer e organizar a **estrutura básica** de um projeto Java
* Trabalhar com **tipos de dados, controle de fluxo, coleções e exceções**
* Ter base suficiente para avançar com segurança para **Programação Orientada a Objetos**

Este módulo prioriza **entendimento conceitual antes da complexidade técnica**, evitando atalhos que dificultem o aprendizado no médio e longo prazo.

---

## 🧠 O que é Java?

Java é uma **linguagem de programação de propósito geral**, fortemente tipada e orientada a objetos, criada com os seguintes princípios:

* Portabilidade ("write once, run anywhere")
* Robustez e segurança
* Alto uso em sistemas corporativos, financeiros e distribuídos

Java não é apenas uma linguagem, mas um **ecossistema completo**, composto por ferramentas, bibliotecas e uma máquina virtual responsável por executar o código.

---

## ⚙️ Como o Java Funciona?

O Java funciona em camadas bem definidas:

1. O desenvolvedor escreve o código-fonte (`.java`).  
2. O compilador transforma o código em **bytecode** (`.class`).  
3. A **JVM (Java Virtual Machine)** executa o bytecode.  

Esse modelo permite que o mesmo programa seja executado em diferentes sistemas operacionais sem alterações no código.

### 📌 JVM, JRE e JDK.  

* **JVM (Java Virtual Machine)**
  Responsável por executar o bytecode Java.

* **JRE (Java Runtime Environment)**
  Contém a JVM e as bibliotecas necessárias para rodar aplicações Java.

* **JDK (Java Development Kit)**
  Inclui a JRE + ferramentas de desenvolvimento (compilador, depurador, etc.).

Para desenvolver em Java, é obrigatório ter o **JDK** instalado.

---

## 📂 Organização do Módulo: 

A estrutura do módulo foi pensada para **facilitar o aprendizado progressivo**, separando claramente conceitos, exemplos práticos e exercícios.

```text
01-fundamentos-java/
│
├── README.md
│
├── 01-introducao/
│   ├── README.md
│   └── HelloWorld.java
│
├── 02-tipos-primitivos/
│   ├── README.md
│   └── TiposPrimitivos.java
│
├── 03-estruturas-controle/
│   ├── README.md
│   ├── EstruturasCondicionais.java
│   └── EstruturasRepeticao.java
│
├── 04-colecoes/
│   ├── README.md
│   ├── Listas.java
│   ├── Sets.java
│   └── Maps.java
│
├── 05-programacao-funcional/
│   ├── README.md
│   ├── Lambdas.java
│   └── StreamAPI.md
│
├── 06-tratamento-erros/
│   ├── README.md
│   └── Excecoes.java
│
├── conceitos/
│   └── arquivos conceituais de apoio
│
├── exemplos/
│   └── exemplos isolados por tema
│
└── exercicios/ 
    └── resolucoes/  
```

Cada pasta possui um papel claro:

* **README.md** → explica o objetivo e os conceitos do tópico.  
* **Arquivos `.java`** → exemplos práticos e executáveis.  
* **conceitos/** → explicações teóricas reutilizáveis.  
* **exemplos/** → código focado em um único conceito.  
* **exercicios/** → prática guiada e consolidação.  

---

## 📌 Observações Importantes:  

* Java exige atenção à sintaxe desde o início.  
* Errar faz parte do processo de aprendizado.  
* Compreender os conceitos é mais importante do que memorizar comandos.  
* Uma base bem construída reduz drasticamente a dificuldade nos módulos seguintes.  

---

> Uma fundação sólida em Java transforma aprendizado avançado em consequência, não em sofrimento.
