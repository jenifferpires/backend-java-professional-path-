# 02 — Tipos Primitivos em Java.  

## 🎯 Objetivo do Módulo:  

Este módulo tem como objetivo apresentar os **tipos primitivos do Java**, explicando como a linguagem lida com dados básicos e por que a tipagem forte é um dos pilares do Java.

Ao final deste módulo, a pessoa estudante deverá:

* Entender o que são **tipos primitivos**
* Conhecer todos os tipos primitivos do Java
* Compreender diferenças de tamanho, uso e finalidade
* Declarar e utilizar variáveis de forma correta
* Reconhecer a diferença entre tipos primitivos e objetos (sem aprofundar em POO)

---

## 🧠 O que são Tipos Primitivos?

Tipos primitivos representam os **valores mais básicos** manipulados pela linguagem. Eles armazenam diretamente o valor na memória e não possuem métodos.

Java é uma linguagem **fortemente tipada**, o que significa que toda variável precisa ter um tipo definido.

Exemplo:

```java
int idade = 30;
double salario = 4500.50;
boolean ativo = true;
```

---

## 📦 Lista de Tipos Primitivos:  

| Tipo    | Tamanho | Exemplo              | Uso comum         |
| ------- | ------- | -------------------- | ----------------- |
| byte    | 8 bits  | `byte b = 10;`       | Valores pequenos  |
| short   | 16 bits | `short s = 100;`     | Valores médios    |
| int     | 32 bits | `int i = 1000;`      | Inteiros em geral |
| long    | 64 bits | `long l = 10000L;`   | Inteiros grandes  |
| float   | 32 bits | `float f = 2.5f;`    | Decimais simples  |
| double  | 64 bits | `double d = 2.5;`    | Decimais precisos |
| char    | 16 bits | `char c = 'A';`      | Caracteres        |
| boolean | 1 bit*  | `boolean ok = true;` | Verdadeiro/Falso  |

* O tamanho do boolean é dependente da JVM.

---

## 🧩 Tipos Primitivos vs Objetos.  

* Tipos primitivos:

  * Guardam o valor diretamente.  
  * São mais performáticos.  
  * Não possuem métodos.  

* Objetos:

  * São instâncias de classes.  
  * Possuem métodos e comportamentos.  
  * Serão abordados em Programação Orientada a Objetos.  

Exemplo conceitual:

```java
int numero = 10;        // tipo primitivo
Integer numeroObj = 10; // objeto (wrapper)
```

---

## 📁 Conteúdo deste Diretório:  

* `TiposPrimitivos.java` → exemplos práticos de declaração e uso.  
* `README.md` → explicação conceitual do módulo.  

---

## 📌 Observações Importantes:  

* Sempre inicialize variáveis antes de usá-las.  
* Atenção a conversões de tipo (casting).  
* Escolher o tipo correto evita erros e desperdício de memória.  

---

> Entender tipos primitivos é entender como o Java pensa dados.
