# 🔢 Tipos Primitivos em Java.  

## 🎯 Objetivo deste conteúdo:  

Este material tem como objetivo explicar **os tipos primitivos do Java**, quando utilizá-los e como eles se comportam.

Após este conteúdo, você deverá:

* Conhecer todos os tipos primitivos.  
* Entender diferenças básicas entre eles.  
* Saber escolher o tipo adequado para cada situação.  

---

## 🧠 O que são tipos primitivos?

Tipos primitivos são os **tipos de dados mais básicos** da linguagem Java.

Eles armazenam **valores simples**, não são objetos e possuem tamanho fixo em memória.

Java possui **8 tipos primitivos**, agrupados por categoria.

---

## 🔢 Tipos numéricos inteiros.  

| Tipo    | Tamanho | Uso comum              |
| ------- | ------- | ---------------------- |
| `byte`  | 8 bits  | Valores muito pequenos |
| `short` | 16 bits | Valores pequenos       |
| `int`   | 32 bits | Uso geral (mais comum) |
| `long`  | 64 bits | Valores muito grandes  |

📌 O tipo `int` é o mais utilizado no dia a dia.

---

## 🔢 Tipos numéricos decimais.  

| Tipo     | Tamanho | Uso comum               |
| -------- | ------- | ----------------------- |
| `float`  | 32 bits | Menor precisão          |
| `double` | 64 bits | Maior precisão (padrão) |

📌 O tipo `double` é o padrão para números decimais em Java.

---

## 🔤 Tipo caractere. 

| Tipo   | Tamanho | Uso                |
| ------ | ------- | ------------------ |
| `char` | 16 bits | Um único caractere |

O tipo `char` utiliza a tabela **Unicode**, permitindo representar letras, números e símbolos.

---

## 🔁 Tipo lógico.  

| Tipo      | Valores possíveis |
| --------- | ----------------- |
| `boolean` | `true` ou `false` |

Utilizado para controle de fluxo, decisões e validações.

---

## 📌 Valores padrão.  

Quando declarados como atributos de classe, os tipos primitivos possuem valores padrão:

* `int` → 0
* `double` → 0.0
* `boolean` → false
* `char` → '\u0000'

📌 Variáveis locais **devem ser inicializadas manualmente**.

---

## 🧠 Boas práticas:  

* Use `int` e `double` como padrão.  
* Evite tipos menores sem necessidade.  
* Escolha o tipo pelo **significado**, não apenas pelo tamanho.  

---

## 📌 Conclusão:  

Tipos primitivos são a base da linguagem Java.

Compreendê-los bem evita erros comuns e facilita o aprendizado de operadores, estruturas de controle e objetos.

---

> Uma boa escolha de tipo é o primeiro passo para um código claro e confiável.
