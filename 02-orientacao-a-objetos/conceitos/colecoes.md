# Coleções em Java (List, Set e Map).  

## 🎯 Objetivo do Conteúdo:  

Apresentar o **Framework de Coleções do Java**, explicando os principais tipos (`List`, `Set` e `Map`), quando usar cada um e como eles facilitam o trabalho com conjuntos de dados no dia a dia profissional.

Ao final deste conteúdo, você será capaz de:

* Entender o que são coleções
* Diferenciar List, Set e Map
* Conhecer as implementações mais usadas
* Escolher a coleção adequada para cada cenário

---

## 🧠 O que são Coleções?

Coleções são estruturas prontas do Java para **armazenar, organizar e manipular grupos de dados**.

Elas resolvem limitações dos arrays, como:

* tamanho fixo
* pouca flexibilidade
* ausência de métodos utilitários

Todas fazem parte do pacote:

```java
java.util
```

---

## 📦 Interface List.  

Uma **List** é uma coleção **ordenada** que permite elementos duplicados.

Características:

* mantém a ordem de inserção.  
* permite acesso por índice.  
* aceita valores repetidos.  

### Implementação mais comum: `ArrayList`.  

```java
List<String> nomes = new ArrayList<>();
nomes.add("Ana");
nomes.add("Bruno");
nomes.add("Ana");
```

Use `List` quando:

* a ordem importa.  
* duplicidade é permitida.  

---

## 🔁 Interface Set.  

Um **Set** representa um conjunto **sem elementos duplicados**.

Características:

* não permite repetição.  
* não garante ordem (na maioria das implementações).  

### Implementação mais comum: `HashSet`.  

```java
Set<String> emails = new HashSet<>();
emails.add("a@email.com");
emails.add("b@email.com");
emails.add("a@email.com");
```

O valor duplicado é ignorado.

Use `Set` quando:

* unicidade é importante.  
* não precisa de ordem.  

---

## 🗺️ Interface Map.  

Um **Map** armazena dados no formato **chave → valor**.

Características:

* chaves não se repetem.  
* valores podem se repetir.  
* acesso rápido via chave.  

### Implementação mais comum: `HashMap`.  

```java
Map<String, Integer> idades = new HashMap<>();
idades.put("Ana", 30);
idades.put("Bruno", 25);
```

Use `Map` quando:

* precisar associar uma chave a um valor.  
* quiser buscas rápidas.  

---

## ⚖️ Resumo Geral:  

| Tipo | Permite duplicados | Mantém ordem | Estrutura   |
| ---- | ------------------ | ------------ | ----------- |
| List | Sim                | Sim          | Lista       |
| Set  | Não                | Não          | Conjunto    |
| Map  | Chave não          | Não          | Chave-valor |

---

## 📌 Boas Práticas:  

* Programe para interfaces (`List`, `Set`, `Map`)
* Escolha a coleção conforme a regra de negócio
* Evite usar `ArrayList` quando unicidade for obrigatória
* Use `Map` para acessos diretos por chave

---

## 🧠 Conclusão:  

Coleções são fundamentais para trabalhar com dados em Java.

Dominar List, Set e Map é essencial para APIs, banco de dados, serviços e lógica de negócio.

---

## 🔗 Próximo Conteúdo:  

👉 **Generics em Java**
Como criar código reutilizável e seguro em tempo de compilação.
