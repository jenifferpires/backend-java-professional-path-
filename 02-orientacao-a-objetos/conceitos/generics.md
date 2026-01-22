# Generics em Java.  

## 🎯 Objetivo do Conteúdo:  

Explicar o uso de **Generics em Java**, mostrando como eles permitem criar código **reutilizável**, **seguro** e **fortemente tipado**, evitando erros comuns em tempo de execução.

Ao final deste conteúdo, você será capaz de:

* Entender o que são generics.  
* Compreender por que eles são usados.  
* Utilizar generics em classes, métodos e coleções.  
* Reconhecer os benefícios em código profissional.  

---

## 🧠 O que são Generics?

**Generics** permitem que classes, interfaces e métodos trabalhem com **tipos parametrizados**.

Em vez de definir um tipo fixo, você define um **parâmetro de tipo**, que será informado no momento do uso.

> 📌 Generics adicionam segurança de tipo em tempo de compilação.

---

## ⚠️ Problema sem Generics:  

Antes dos generics, era comum usar `Object`:

```java
List lista = new ArrayList();
lista.add("Texto");
lista.add(10);
```

Isso pode causar erros em tempo de execução:

```java
String valor = (String) lista.get(1); // ClassCastException
```

---

## ✅ Solução com Generics:  

```java
List<String> lista = new ArrayList<>();
lista.add("Texto");
// lista.add(10); // erro de compilação
```

Agora o erro é detectado **antes da execução**.

---

## 🔤 Convenções de Tipos Genéricos:  

Os nomes mais comuns são:

| Letra | Significado |
| ----- | ----------- |
| T     | Type        |
| E     | Element     |
| K     | Key         |
| V     | Value       |

*Essas convenções facilitam a leitura do código.*

---

## 🧱 Classes Genéricas:  

```java
public class Caixa<T> {
    private T conteudo;

    public void guardar(T conteudo) {
        this.conteudo = conteudo;
    }

    public T obter() {
        return conteudo;
    }
}
```

Uso:

```java
Caixa<String> caixa = new Caixa<>();
caixa.guardar("Mensagem");
```

---

## ⚙️ Métodos Genéricos:  

```java
public class Util {
    public static <T> void imprimir(T valor) {
        System.out.println(valor);
    }
}
```

---

## 🔒 Benefícios dos Generics:  

* Segurança de tipo.  
* Menos casts explícitos.  
* Código mais limpo. 
* Melhor legibilidade.  
* Detecção antecipada de erros.  

---

## 📌 Boas Práticas:  

* Sempre utilize generics com coleções.  
* Prefira tipos específicos em vez de `Object`.  
* Use convenções padrão (`T`, `E`, `K`, `V`).  
* Evite complexidade excessiva.  

---

## 🧠 Conclusão:  

Generics são fundamentais para escrever código Java moderno e profissional.

Eles ajudam a prevenir erros e tornam o código mais reutilizável e seguro.

---

## 🔗 Próximo Conteúdo:  

👉 **Java Stream API**
Como trabalhar com coleções de forma funcional e expressiva.
