# 04 — Coleções em Java.  

## 🎯 Objetivo do Módulo:  

Este módulo tem como objetivo apresentar o **Framework de Coleções do Java**, responsável por armazenar, organizar e manipular **conjuntos de dados** de forma eficiente.

Ao final deste módulo, a pessoa estudante deverá:

* Entender o que são coleções e por que elas existem.  
* Conhecer as principais interfaces: `List`, `Set` e `Map`.  
* Saber quando utilizar cada tipo de coleção.  
* Ler e escrever código Java utilizando coleções de forma clara.  
* Preparar a base necessária para **Programação Funcional e Stream API**.  

---

## 🧠 O que são Coleções?

Coleções são estruturas de dados fornecidas pelo Java para **armazenar múltiplos valores** dentro de uma única variável.

Diferente de arrays, as coleções:

* Possuem tamanho dinâmico.  
* Oferecem métodos prontos para manipulação.  
* São mais flexíveis e expressivas.  

O Java organiza suas coleções através do **Java Collections Framework**.

---

## 🧩 Principais Interfaces de Coleções:  

O Java define contratos (interfaces) que determinam o comportamento das coleções.

### 📋 List:  

* Mantém a **ordem de inserção**.  
* Permite **elementos duplicados**.  
* Acesso por índice.  

Exemplos comuns:

* `ArrayList`
* `LinkedList`

Usada quando a ordem importa.

---

### 🔢 Set:  

* **Não permite elementos duplicados**.  
* Não garante ordem por padrão (algumas implementações mantêm ordem).  

Exemplos comuns:

* `HashSet`
* `LinkedHashSet`
* `TreeSet`

Usada quando unicidade é essencial.

---

### 🗺️ Map:  

* Armazena dados em **pares chave → valor**.
* Chaves são únicas.
* Valores podem ser repetidos.

Exemplos comuns:

* `HashMap`
* `LinkedHashMap`
* `TreeMap`

Usada para associações e buscas rápidas.

* Apesar de fazer parte do Java Collections Framework, Map não estende Collection, pois seu modelo é baseado em pares chave → valor.

---

## 🧪 Relação com os Exemplos Práticos: 

Este módulo contém exemplos executáveis para cada tipo de coleção:

* `Listas.java` → uso de `List`
* `Sets.java` → uso de `Set`
* `Maps.java` → uso de `Map`

Os exemplos focam em:

* Criação.  
* Inserção de dados. 
* Leitura e iteração.  

*Cada arquivo contém um main executável e exemplos progressivos, pensados para leitura e experimentação.* 

---

## 🔗 Conexão com os Próximos Módulos:  

Coleções são base direta para:

* Lambdas.  
* Stream API.  
* Programação funcional.  
* Processamento de dados.  

Compreender bem este módulo torna os próximos temas **mais naturais e menos abstratos**.

---

## 📌 Observações Importantes

* Sempre programe para a **interface**, não para a implementação
* Escolha a coleção com base no problema, não por hábito
* Clareza e intenção do código são mais importantes que micro-otimizações

---

> Coleções são o ponto onde Java começa a lidar com dados do mundo real.
