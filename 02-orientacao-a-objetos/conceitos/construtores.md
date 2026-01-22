# Construtores em Java.  

## 🎯 Objetivo do Conteúdo:  

Explicar de forma clara o que são **construtores** em Java, para que servem e como utilizá-los corretamente para garantir que objetos sejam criados em um **estado válido** desde o início.

Ao final deste conteúdo, você será capaz de:

* Entender o papel dos construtores.  
* Diferenciar construtor padrão e parametrizado.  
* Utilizar a palavra-chave `this`.  
* Criar objetos corretamente inicializados.  

---

## 🧠 O que é um Construtor?

Um **construtor** é um método especial utilizado para **inicializar objetos**.

Ele é executado automaticamente no momento em que um objeto é criado com a palavra-chave `new`.

Características principais:

* Tem o **mesmo nome da classe**
* **Não possui retorno** (nem `void`)
* Pode receber parâmetros

---

## 📦 Por que Construtores são Importantes?

Construtores permitem:

* Garantir que o objeto nasça em um estado válido.  
* Centralizar regras de inicialização.  
* Evitar objetos inconsistentes.  

Sem construtores bem definidos, objetos podem ser criados com dados incompletos ou inválidos.

---

## 🧪 Construtor Padrão:  

Quando nenhum construtor é declarado, o Java cria automaticamente um **construtor padrão**.

```java
public class Pessoa {
    String nome;
    int idade;
}
```

Uso:

```java
Pessoa pessoa = new Pessoa();
```

⚠️ Ao criar qualquer construtor manualmente, o construtor padrão **deixa de existir**.

---

## 🧩 Construtor Parametrizado:  

Permite criar objetos já com valores definidos.

```java
public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
```

Uso:

```java
Pessoa pessoa = new Pessoa("Ana", 30);
```

Agora o objeto já nasce completo e consistente.

---

## 🔑 Palavra-chave `this`:  

A palavra `this` referencia o **objeto atual**.

Ela é usada para:

* Diferenciar atributos de parâmetros.  
* Tornar o código mais legível.  

```java
this.nome = nome;
```

Sem `this`, o Java não saberia qual variável está sendo referenciada.

---

## 🧱 Exemplo Prático:  

```java
public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }
}
```

Aqui garantimos que:

* toda conta tenha um titular.  
* o saldo inicial seja válido.  

---

## 📌 Boas Práticas:  

* Use construtores para garantir estados válidos.  
* Evite construtores vazios sem propósito.  
* Prefira inicialização via construtor em vez de setters.  
* Use sobrecarga quando necessário.  

---

## 🧠 Conclusão:  

Construtores são fundamentais para criar objetos consistentes e confiáveis.

Eles ajudam a manter regras de negócio organizadas desde o momento da criação do objeto.

---

## 🔗 Próximo Conteúdo>  

👉 **Herança em Java**
Como reutilizar código e criar hierarquias entre classes.
