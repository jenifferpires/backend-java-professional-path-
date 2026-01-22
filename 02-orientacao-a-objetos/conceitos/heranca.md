# Herança em Java.  

## 🎯 Objetivo do Conteúdo:  

Explicar o conceito de **Herança** em Java, mostrando como reutilizar código, criar hierarquias entre classes e modelar relações do tipo **é-um (is-a)** de forma clara e segura.

Ao final deste conteúdo, você será capaz de:

* Entender o que é herança.  
* Utilizar a palavra-chave `extends`.  
* Diferenciar classe pai (superclasse) e classe filha (subclasse).  
* Compreender quando usar herança.  

---

## 🧠 O que é Herança?

**Herança** é o mecanismo que permite que uma classe **herde atributos e métodos** de outra classe.

Ela promove:

* reutilização de código.  
* organização em hierarquias.  
* redução de duplicação.  

Em termos simples:

> 🔁 Uma classe filha reaproveita e especializa o comportamento de uma classe pai.

---

## 🌍 Relação *is-a* (é-um)

A herança representa uma relação **é-um**.

Exemplos:

* `Cachorro` **é um** `Animal`
* `Gerente` **é um** `Funcionario`

Se a frase fizer sentido, a herança pode ser adequada.

---

## 🧩 Superclasse e Subclasse

* **Superclasse (classe pai)**: classe base que contém comportamentos comuns.  
* **Subclasse (classe filha)**: classe que herda e pode especializar a superclasse.  

---

## 💻 Exemplo em Java:  

### Classe Pai:  

```java
public class Animal {
    public void emitirSom() {
        System.out.println("O animal faz um som");
    }
}
```

### Classe Filha:  

```java
public class Cachorro extends Animal {
    public void emitirSom() {
        System.out.println("O cachorro late");
    }
}
```

A classe `Cachorro`:

* herda o método da classe `Animal`
* pode sobrescrever comportamentos

---

## 🔑 Palavra-chave `extends`.  

A palavra `extends` indica que uma classe herda de outra.

```java
class Filho extends Pai { }
```

Em Java:

* uma classe só pode herdar de **uma** classe (herança simples).  
* múltipla herança de classes **não é permitida**.  

---

## 🧠 Herança x Composição:  

Herança deve ser usada com cuidado.

Use herança quando:

* existe relação clara *is-a*
* comportamento realmente é comum

Evite herança quando:

* a relação for *tem-um*
* a classe filha só reutiliza pequenos trechos

📌 Nesses casos, **composição** é mais indicada.

---

## 📌 Boas Práticas:  

* Evite hierarquias profundas.  
* Prefira composição quando houver dúvida.  
* Não force herança apenas para reutilizar código.  
* Mantenha classes pai genéricas e estáveis.  

---

## 🧠 Conclusão:  

Herança é uma ferramenta poderosa para organização e reutilização de código, mas deve ser usada com critério.

Quando bem aplicada, melhora a legibilidade e a manutenção do sistema.

---

## 🔗 Próximo Conteúdo:  

👉 **Polimorfismo em Java**  
Como tratar objetos diferentes de forma uniforme e flexível.
