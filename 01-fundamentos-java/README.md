# ☕ 01 — Fundamentos de Java. 

## 🎯 Objetivo do Módulo: 

Este módulo tem como objetivo apresentar a **base da linguagem Java**, partindo do zero e construindo gradualmente a compreensão necessária para avançar em conceitos mais complexos.

Ao final deste módulo, a pessoa estudante deverá:

* Entender **o que é Java** e para que ele é utilizado
* Compreender **como o Java funciona internamente** (JVM, JRE e JDK)
* Ler e escrever **programas simples em Java**
* Reconhecer a **estrutura básica** de um código Java
* Desenvolver segurança para seguir para Programação Orientada a Objetos

Este módulo prioriza **clareza e entendimento conceitual**, evitando abstrações excessivas no início.

---

## 🧠 O que é Java?

Java é uma **linguagem de programação de propósito geral**, fortemente tipada e orientada a objetos, criada para ser:

* Portável ("escreva uma vez, execute em qualquer lugar")
* Robusta
* Segura
* Amplamente utilizada em sistemas corporativos

Java não é apenas uma linguagem, mas parte de um **ecossistema** que inclui ferramentas, bibliotecas e uma máquina virtual responsável por executar o código.

---

## ⚙️ Como o Java Funciona?  

Diferente de linguagens interpretadas diretamente pelo sistema operacional, o Java funciona em camadas:

1. O código-fonte (`.java`) é escrito pelo desenvolvedor
2. O compilador transforma esse código em **bytecode** (`.class`)
3. A **JVM (Java Virtual Machine)** executa o bytecode

Esse modelo garante que o mesmo programa possa ser executado em diferentes sistemas operacionais.

### 📌 JVM, JRE e JDK.  

* **JVM (Java Virtual Machine)**
  Responsável por executar o bytecode Java.

* **JRE (Java Runtime Environment)**
  Contém a JVM e bibliotecas necessárias para rodar aplicações Java.

* **JDK (Java Development Kit)**
  Inclui a JRE + ferramentas para desenvolvimento (compilador, depurador, etc.).

Para desenvolver em Java, é necessário ter o **JDK** instalado.

---

## 🧱 Estrutura Básica de um Programa Java.  

Todo programa Java segue uma estrutura mínima:

* Uma **classe**
* Um método principal chamado `main`

Exemplo simples:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```

Neste momento, não é necessário entender todos os detalhes. O foco é reconhecer a **forma** do código.

---

## 📂 Organização do Módulo:  

Este módulo está organizado da seguinte forma:

```text
01-fundamentos-java/
│
├── README.md
├── conceitos/
│   ├── o-que-e-java.md
│   ├── jvm-jre-jdk.md
│   └── estrutura-basica.md
│
├── exemplos/
│   ├── HelloWorld.java
│   └── TiposPrimitivos.java
│
└── exercicios/
    ├── exercicios-propostos.md
    └── resolucoes/
```

*Cada pasta tem um propósito claro e evolui gradualmente.*

---

## 📌 Observações Importantes:  

* Java exige **atenção à sintaxe** desde o início
* Erros fazem parte do processo de aprendizado
* Compreender os conceitos é mais importante do que memorizar comandos

Este módulo serve como **fundação** para todo o restante do repositório.

---

> Uma base bem construída em Java reduz drasticamente a complexidade dos próximos passos.
