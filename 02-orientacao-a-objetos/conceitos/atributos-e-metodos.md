# Atributos e Métodos em Java.  

## 🎯 Objetivo do Conteúdo:  

Este material tem como objetivo explicar de forma clara e prática os conceitos de **atributos** e **métodos** em Java, mostrando como eles representam o **estado** e o **comportamento** de um objeto dentro da Programação Orientada a Objetos (POO).

Ao final deste conteúdo, você será capaz de:

* Identificar atributos e métodos em uma classe Java.  
* Entender a relação entre estado e comportamento.  
* Criar classes simples com atributos e métodos bem definidos.  

---

## 🧠 Conceito:  

Na Programação Orientada a Objetos:

* **Atributos** representam as **características** ou **dados** de um objeto
* **Métodos** representam as **ações** ou **comportamentos** que o objeto pode executar

Em termos simples:

> 🔹 **Atributos = o que o objeto é / tem**
> 🔹 **Métodos = o que o objeto faz**

---

## 📦 Atributos:  

Atributos são variáveis declaradas dentro de uma classe.
Eles definem o **estado** de um objeto.

### Exemplo:

```java
public class Pessoa {
    String nome;
    int idade;
}
```

Neste exemplo:

* `nome` e `idade` são atributos.  
* Cada objeto do tipo `Pessoa` terá seus próprios valores para esses atributos.  

---

## ⚙️ Métodos:  

Métodos são blocos de código que definem o **comportamento** de uma classe.   
Eles geralmente operam sobre os atributos do próprio objeto.

### Exemplo:

```java
public class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}
```

Neste exemplo:

* `apresentar()` é um método. 
* Ele utiliza o atributo `nome`.  

---

## 🔄 Estado x Comportamento:  

| Conceito | Representa       | Exemplo               |
| -------- | ---------------- | --------------------- |
| Atributo | Estado do objeto | nome, idade           |
| Método   | Comportamento    | apresentar(), andar() |

Um objeto combina **estado + comportamento** para representar algo do mundo real.

---

## 🧪 Exemplo Completo:  

```java
public class ContaBancaria {
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        saldo -= valor;
    }
}
```

Aqui:

* `saldo` é o atributo
* `depositar` e `sacar` são métodos
* Os métodos alteram o estado do objeto

---

## 📌 Boas Práticas:  

* Use nomes claros e significativos.  
* Atributos geralmente representam substantivos.  
* Métodos geralmente representam verbos.  
* Evite classes com muitos atributos sem comportamento.  

---

## 🔗 Próximo Conteúdo:  

No próximo arquivo, vamos aprofundar um dos pilares da POO:

👉 **Encapsulamento e Modificadores de Acesso**.  

Esse conceito é essencial para escrever código seguro, organizado e profissional em Java.
