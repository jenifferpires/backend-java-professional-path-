# Polimorfismo em Java.  

## 🎯 Objetivo do Conteúdo:  

Explicar o conceito de **Polimorfismo**, um dos pilares fundamentais da Programação Orientada a Objetos, mostrando como ele permite escrever código **flexível**, **extensível** e **orientado a abstrações**.

Ao final deste conteúdo, você será capaz de:

* Entender o que é polimorfismo
* Compreender a sobrescrita de métodos
* Utilizar referências da classe pai
* Identificar o polimorfismo em tempo de execução

---

## 🧠 O que é Polimorfismo?

**Polimorfismo** significa "muitas formas".

Na Programação Orientada a Objetos, ele permite que **objetos diferentes respondam de formas diferentes à mesma mensagem (método)**.

Em termos simples:

> 🔄 Um mesmo método pode ter comportamentos diferentes dependendo do objeto que o executa.

---

## 🔁 Polimorfismo e Herança:  

O polimorfismo está diretamente ligado à **herança**.

Ele ocorre quando:

* uma classe filha **sobrescreve** um método da classe pai.  
* o método chamado depende do **tipo real do objeto**, e não da referência.  

---

## 🧩 Sobrescrita de Métodos (@Override).  

A sobrescrita permite que a classe filha forneça uma implementação específica de um método herdado.

### Exemplo:

```java
public class Animal {
    public void emitirSom() {
        System.out.println("O animal faz um som");
    }
}
```

```java
public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late");
    }
}
```

---

## 🧪 Exemplo de Polimorfismo em Ação:  

```java
Animal animal1 = new Cachorro();
Animal animal2 = new Gato();

animal1.emitirSom();
animal2.emitirSom();
```

Mesmo usando a referência `Animal`, o Java executa o método correto conforme o objeto real.

---

## ⏱️ Polimorfismo em Tempo de Execução:  

O Java decide **em tempo de execução** qual método deve ser executado.

Isso permite:

* código desacoplado.  
* fácil extensão.  
* menos impacto ao adicionar novas classes.  

---

## 🧠 Vantagens do Polimorfismo:  

* Redução de código duplicado.  
* Maior flexibilidade.  
* Código mais limpo e organizado.  
* Facilidade de manutenção.  

---

## 📌 Boas Práticas:  

* Programe para interfaces ou classes abstratas.  
* Use `@Override` sempre que sobrescrever métodos.  
* Evite condicionais excessivas para identificar tipos.  

---

## 🧠 Conclusão:  

O polimorfismo é a base para sistemas escaláveis e bem estruturados.

Ele permite que o código evolua com menos impacto e mais clareza.

---

## 🔗 Próximo Conteúdo:  

👉 **Classes Abstratas e Interfaces**  
Como definir contratos e separar o que é comum do que é específico.
