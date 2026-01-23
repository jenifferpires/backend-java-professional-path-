# 05 — Programação Funcional em Java.  

## 🎯 Objetivo do Módulo:  

Este módulo introduz os **fundamentos de Programação Funcional em Java**, preparando o terreno para o uso consciente de **Lambdas** e, posteriormente, da **Stream API**.

Aqui o foco **não é Stream ainda**, mas sim a mudança de mentalidade:

> pensar mais em **o que fazer com os dados** do que **como percorrê-los**.

Ao final deste módulo, a pessoa estudante deverá:

* Entender o que é Programação Funcional e por que ela existe.  
* Compreender o conceito de **funções como valores**.  
* Conhecer o papel das **interfaces funcionais** em Java.  
* Ler e escrever **expressões lambda simples**.  
* Estar preparada para avançar para Stream API com menos abstração.  

---

## 🧠 O que é Programação Funcional?

Programação Funcional é um **paradigma de programação** que trata o comportamento do programa como a aplicação de **funções** sobre dados.

Em vez de focar em:

* laços explícitos (`for`, `while`)
* controle manual de estado

passamos a focar em:

* **transformações de dados**
* **operações declarativas**
* **comportamento passado como argumento**

---

## ⚖️ Imperativo x Funcional (Intuição Inicial).  

### Estilo Imperativo (tradicional):  

* Diz *como* o computador deve executar cada passo.  
* Muito comum com `for`, `if`, variáveis mutáveis.  

### Estilo Funcional:  

* Diz *o que* deve ser feito com os dados.  
* Menos controle explícito de fluxo.  
* Código mais expressivo e legível.  

> Em Java, os dois estilos **coexistem**.

---

## 🧩 Funções como Cidadãs de Primeira Classe (em Java).  

Java não nasceu funcional, mas **a partir do Java 8** passou a permitir:

* Passar comportamento como parâmetro.  
* Atribuir funções a variáveis.  
* Executar lógica sem criar classes anônimas verbosas.  

Isso é feito principalmente através de:

* **Interfaces Funcionais**
* **Expressões Lambda**

---

## 🧪 Interfaces Funcionais.  

Uma **interface funcional** é uma interface que possui **apenas um método abstrato**.

Exemplos comuns da API Java:

* `Predicate<T>` → retorna `boolean`.  
* `Function<T, R>` → transforma um valor em outro.  
* `Consumer<T>` → consome um valor sem retorno.  
* `Supplier<T>` → fornece um valor.  

Essas interfaces são a base para Lambdas e Streams.

---

## 🔑 Expressões Lambda (Visão Geral).  

Uma expressão lambda representa **uma função anônima**, de forma curta e direta.

Exemplo conceitual:

```java
(x) -> x * 2
```

Neste momento, o mais importante é entender que:

* Lambdas **representam comportamento**.  
* Lambdas dependem de **interfaces funcionais**.  
* Elas tornam o código menos verboso e mais expressivo.  

A prática detalhada será feita nos exemplos do módulo.

---

## 📂 Organização do Módulo:  

```text
05-programacao-funcional/
│
├── README.md
├── Lambdas.java
└── StreamAPI.md
```

* `Lambdas.java` → primeiros exemplos práticos.  
* `StreamAPI.md` → **conceitos teóricos** (Streams virão com calma).  

---

## 🔗 Conexão com Coleções:  

Programação Funcional em Java **não faz sentido sem coleções**.

É aqui que conceitos como:

* filtrar
* mapear
* transformar

começam a surgir de forma natural.

---

## 📌 Observações Importantes:  

* Não tente decorar sintaxe.  
* Priorize entender a ideia de **passar comportamento**.  
* Este módulo é conceitual + introdutório.  

A prática consistente virá nos próximos passos.

---

> Programação Funcional não substitui o Java tradicional — ela o complementa.
