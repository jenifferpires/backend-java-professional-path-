# Stream API em Java — Conceitos Fundamentais.  

## 🎯 Objetivo deste Documento:  

Este arquivo apresenta os **conceitos fundamentais da Stream API**, sem foco em implementação pesada.

A ideia aqui é **entender o modelo mental** antes de escrever código complexo.

> Stream API não é um substituto de coleções.
> É uma **forma declarativa de processar dados que já estão em coleções**.

---

## 🧠 O que é Stream API?

A Stream API é um recurso introduzido no **Java 8** que permite processar conjuntos de dados de forma:

* Declarativa.  
* Expressiva.  
* Funcional.  

Uma *stream* representa uma **sequência de elementos** sobre a qual podemos aplicar operações.

Importante:

* Uma stream **não armazena dados**
* Ela **processa dados de uma fonte** (geralmente uma coleção)

---

## 📦 Relação entre Coleções e Streams:  

| Coleções           | Streams               |
| ------------------ | --------------------- |
| Armazenam dados    | Processam dados       |
| São mutáveis       | Não alteram a fonte   |
| Estrutura de dados | Pipeline de operações |

Coleções dizem *o que você tem*.
Streams dizem *o que você faz com isso*.

---

## 🔗 Pipeline de Operações.  

Uma Stream funciona como um **pipeline**, composto por três partes:

1. **Fonte**
   Onde os dados vêm (List, Set, Map, Array)

2. **Operações Intermediárias**
   Transformam os dados (ex: `filter`, `map`)

3. **Operação Terminal**
   Produz um resultado ou efeito colateral (`forEach`, `collect`)

Sem operação terminal, **nada é executado**.

---

## ⚙️ Operações Intermediárias (Conceito).  

* Retornam uma nova Stream.  
* São **lazy** (executadas sob demanda).  
* Podem ser encadeadas.  

Exemplos conceituais:

* `filter` → filtrar elementos
* `map` → transformar elementos
* `sorted` → ordenar

---

## 🧪 Operações Terminais (Conceito).  

* Encerram o pipeline.  
* Produzem um resultado final.  

Exemplos conceituais:

* `forEach`
* `collect`
* `count`
* `findFirst`

---

## 🧩 Por que Stream API é Funcional?

Porque ela:

* Usa **Lambdas**
* Trabalha com **funções puras** sempre que possível
* Reduz controle explícito de fluxo (`for`, `if`)

Mas atenção:

> Stream API **não elimina** a necessidade de entender laços tradicionais.

---

## ⚠️ Erros Conceituais Comuns:  

* Achar que Stream substitui coleções.  
* Achar que Stream melhora performance automaticamente.  
* Usar Stream quando um `for` simples é mais legível.  

Clareza sempre vem antes da abstração.

---

## 🔗 Conexão com os Exemplos do Repositório.  

Neste módulo:

* `Lambdas.java` prepara o entendimento de comportamento.  
* Este arquivo explica o **modelo mental** das Streams.  

A implementação prática virá **após domínio conceitual**.

---

## 📌 Observações Finais:  

* Stream API é poderosa, mas deve ser usada com intenção.  
* O foco é legibilidade e expressividade.  
* Este conhecimento é base para processamento de dados em Java.  

---

> Streams não são sobre velocidade.
> São sobre clareza na transformação de dados.
