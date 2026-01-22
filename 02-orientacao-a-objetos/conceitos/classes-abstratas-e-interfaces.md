# Classes Abstratas e Interfaces em Java.  

## 🎯 Objetivo do Conteúdo:  

Explicar de forma clara e comparativa o que são **classes abstratas** e **interfaces** em Java, quando utilizar cada uma e como elas ajudam a criar código **flexível**, **organizado** e **profissional**.

Ao final deste conteúdo, você será capaz de:

* Entender o conceito de abstração.  
* Diferenciar classes abstratas de interfaces.  
* Saber quando usar cada abordagem.  
* Criar contratos claros entre componentes do sistema.  

---

## 🧠 Abstração na POO:  

**Abstração** é o princípio de focar no **que um objeto faz**, e não em **como ele faz**.

Ela permite definir estruturas base que outras classes devem seguir, sem expor detalhes de implementação.

> 📌 Abstrair é esconder complexidade e expor apenas o essencial.

---

## 🧱 Classes Abstratas:  

Uma **classe abstrata** é uma classe que **não pode ser instanciada**.

Ela pode conter:

* atributos.  
* métodos concretos (com implementação).  
* métodos abstratos (sem implementação).  

### Exemplo:

```java
public abstract class Animal {
    public abstract void emitirSom();

    public void dormir() {
        System.out.println("O animal está dormindo");
    }
}
```

Classe concreta:

```java
public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late");
    }
}
```

---

## 📜 Interfaces:  

Uma **interface** define um **contrato**.

Ela especifica **o que deve ser feito**, mas não **como será feito**.

Características:

* todos os métodos são abstratos por padrão.  
* uma classe pode implementar várias interfaces.  
* não possui estado (atributos com comportamento).  

### Exemplo:

```java
public interface Pagamento {
    void pagar(double valor);
}
```

Implementação:

```java
public class CartaoCredito implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento com cartão: " + valor);
    }
}
```

---

## ⚖️ Classe Abstrata x Interface:  

| Classe Abstrata        | Interface                                 |
| ---------------------- | ----------------------------------------- |
| Pode ter implementação | Não possui implementação (regra clássica) |
| Pode ter atributos     | Não possui estado                         |
| Herança única          | Múltiplas implementações                  |
| Representa *é-um*      | Representa *comportamento*                |

---

## 🧠 Quando Usar Cada Uma?

Use **classe abstrata** quando:

* há código comum a ser reutilizado.  
* existe relação clara de herança.  

Use **interface** quando:

* precisa definir contratos.  
* quer permitir múltiplas implementações.  
* busca baixo acoplamento.  

---

## 📌 Boas Práticas:  

* Programe para interfaces.  
* Evite herança excessiva.  
* Use abstrações para reduzir acoplamento.  
* Prefira composição + interfaces.  

---

## 🧠 Conclusão:  

Classes abstratas e interfaces são fundamentais para arquiteturas bem definidas.

Elas permitem criar sistemas mais flexíveis, testáveis e fáceis de evoluir.

---

## 🔗 Próximo Conteúdo:  

👉 **Exceções e Tratamento de Erros em Java**
Como lidar com falhas de forma controlada e profissional.
