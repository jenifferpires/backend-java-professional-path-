# Encapsulamento e Modificadores de Acesso em Java.  

## 🎯 Objetivo do Conteúdo:  

Explicar de forma clara o conceito de **Encapsulamento**, um dos pilares da Programação Orientada a Objetos, e apresentar os **modificadores de acesso** em Java, mostrando como eles ajudam a proteger dados, organizar o código e facilitar a manutenção.

Ao final deste conteúdo, você será capaz de:

* Entender o que é encapsulamento.  
* Saber por que ele é importante.  
* Utilizar corretamente `public`, `private` e `protected`.  
* Aplicar getters e setters.  

---

## 🧠 O que é Encapsulamento?

**Encapsulamento** é o princípio de **esconder os detalhes internos** de uma classe e expor apenas o que é necessário para o uso externo.

Em termos simples:

> 🔒 O objeto protege seus dados e controla como eles podem ser acessados ou modificados.

Isso evita:

* acesso indevido aos dados.  
* alterações inconsistentes.  
* dependências desnecessárias.  

---

## 🌍 Exemplo sem Encapsulamento (problema)

```java
public class ContaBancaria {
    public double saldo;
}
```

Qualquer parte do sistema poderia fazer:

```java
conta.saldo = -1000;
```

❌ Isso quebra regras de negócio e gera erros difíceis de rastrear.

---

## ✅ Exemplo com Encapsulamento (solução)

```java
public class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
```

Agora:

* o atributo está protegido (`private`)
* o acesso é controlado por métodos
* regras de negócio ficam centralizadas

---

## 🔐 Modificadores de Acesso:  

Os modificadores definem **quem pode acessar** atributos, métodos e classes.

### Principais modificadores em Java:

| Modificador | Acesso                                    |
| ----------- | ----------------------------------------- |
| `public`    | Acessível de qualquer lugar               |
| `private`   | Acessível apenas dentro da própria classe |
| `protected` | Acessível no mesmo pacote ou por herança  |
| *(default)* | Acessível apenas no mesmo pacote          |

---

## 🔧 Getters e Setters:  

Getters e setters são métodos usados para **ler e alterar atributos privados** de forma controlada.

### Exemplo:

```java
public class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
```

Eles permitem:

* validações.  
* controle de acesso.  
* manutenção futura sem quebrar código externo.  

---

## 📌 Boas Práticas:  

* Atributos devem ser **private** por padrão.  
* Exponha apenas o necessário.  
* Centralize regras de negócio nos métodos.  
* Evite getters e setters sem propósito.  

---

## 🧠 Conclusão:  

Encapsulamento é essencial para:

* segurança do código.  
* organização.  
* facilidade de manutenção.  
* evolução do sistema.  

Sem encapsulamento, o código se torna frágil e difícil de manter.

---

## 🔗 Próximo Conteúdo:  

👉 **Construtores em Java**
Como inicializar objetos corretamente e garantir estados válidos desde a criação.
