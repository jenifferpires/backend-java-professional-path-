# ⚙️ JVM, JRE e JDK.  

## 🎯 Objetivo deste conteúdo:  

Este material tem como objetivo esclarecer uma das **principais fontes de confusão para iniciantes em Java**: a diferença entre **JVM**, **JRE** e **JDK**.

Ao final, deve ficar claro:

* O papel de cada um.  
* Quando cada um é utilizado.  
* Por que o JDK é necessário para quem está aprendendo Java.  

---

## 🧠 Visão geral:  

Quando falamos em Java, não estamos falando apenas de uma linguagem, mas de um **ambiente completo de execução e desenvolvimento**.

Esses três elementos se relacionam da seguinte forma:

```text
JDK ⊃ JRE ⊃ JVM
```

Ou seja:

* O **JDK** contém o **JRE**
* O **JRE** contém a **JVM**

---

## 🧩 JVM — Java Virtual Machine:  

A **JVM (Java Virtual Machine)** é o componente responsável por **executar o bytecode Java**.

Ela atua como uma camada intermediária entre o código Java e o sistema operacional.

### Funções principais da JVM:

* Executar arquivos `.class`.  
* Gerenciar memória.  
* Controlar o Garbage Collector.  
* Garantir segurança durante a execução.  

📌 **Importante:** a JVM **não entende código `.java`**, apenas bytecode.

---

## 📦 JRE — Java Runtime Environment.  

O **JRE (Java Runtime Environment)** é o ambiente necessário para **executar aplicações Java**.

Ele é composto por:

* JVM
* Bibliotecas padrão do Java

Com o JRE, é possível **rodar** aplicações Java, mas **não desenvolver**.

---

## 🛠️ JDK — Java Development Kit

O **JDK (Java Development Kit)** é o kit completo para **desenvolvimento em Java**.

Ele inclui:

* JRE
* Compilador Java (`javac`)
* Ferramentas de depuração
* Utilitários de desenvolvimento

📌 Para escrever, compilar e testar código Java, o **JDK é obrigatório**.

---

## 🔄 Fluxo prático de desenvolvimento

Um fluxo simplificado de trabalho em Java é:

1. Escrever o código (`.java`)
2. Compilar com o `javac` (JDK)
3. Gerar bytecode (`.class`)
4. Executar com a JVM (via JRE)

Esse processo será explorado com exemplos práticos nos próximos arquivos.

---

## 📌 Resumo rápido

| Componente | Para que serve                 |
| ---------- | ------------------------------ |
| JVM        | Executa o bytecode             |
| JRE        | Permite rodar aplicações       |
| JDK        | Permite desenvolver aplicações |

---

## 🧠 Observações finais

* Para estudar Java: **instale o JDK**.  
* Para apenas rodar aplicações: o JRE é suficiente.  
* Entender essa diferença evita confusão em ambientes de desenvolvimento.  

---

> Compreender o ambiente Java é essencial antes de escrever código com confiança.
