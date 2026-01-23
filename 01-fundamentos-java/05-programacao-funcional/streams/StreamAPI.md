# 🌊 Stream API — Fundamentos Conceituais.  

## 🎯 Objetivo deste Documento:  

Este arquivo tem como objetivo **explicar o que é a Stream API em Java sob o ponto de vista conceitual**, preparando o terreno para os exemplos práticos presentes neste módulo.

Aqui, o foco **não é ensinar sintaxe**, mas sim:

- Como pensar em Streams?  
- Quando usar?  
- O que muda em relação ao estilo imperativo tradicional?  

---

## 🧠 O que é Stream API?

A Stream API é uma **abstração para processar coleções de dados de forma declarativa**, introduzida no Java 8.

Uma *Stream* representa uma **sequência de elementos** que pode ser processada através de uma cadeia de operações, produzindo um resultado.

Importante:
> Uma Stream **não armazena dados**.  
Ela apenas **processa dados que vêm de uma fonte**, geralmente uma coleção.

---

## 🔄 Diferença entre Coleção e Stream:  

| Coleção | Stream |
|------|-------|
| Armazena dados | Processa dados |
| Pode ser reutilizada | É consumida uma única vez |
| Operações imediatas | Operações avaliadas sob demanda |
| Estrutura de dados | Pipeline de processamento |

Uma Stream **nasce de uma coleção**, mas não a substitui.

---

## 🧩 Modelo Mental: Pipeline de Dados:  

Streams devem ser lidas como um **pipeline**, da esquerda para a direita:
> fonte → transformação → resultado

Ou, em termos práticos:

> “A partir desses dados, filtre isso, transforme aquilo e gere um resultado.”

Se a leitura não for fluida, o código provavelmente pode ser melhorado.

---

## 🔁 Tipos de Operações.  

### Operações Intermediárias:  

São operações que **transformam a Stream** e retornam outra Stream.

Exemplos conceituais:
- Filtrar elementos
- Transformar valores
- Ordenar dados
- Eliminar duplicados

Essas operações **não executam nada sozinhas**.

---

### Operações Terminais:  

São operações que **finalizam o pipeline** e produzem um resultado ou efeito colateral.

Exemplos conceituais:
- Produzir uma nova coleção.  
- Executar uma ação para cada elemento.  
- Gerar um valor agregado (quantidade, soma, etc.).  

Após uma operação terminal, a Stream é considerada **consumida**.

---

## ⚠️ Características Importantes das Streams:  

- Streams **não modificam** a coleção original
- Streams favorecem **imutabilidade**
- O processamento pode ser:
  - Sequencial
  - Paralelo (quando apropriado)
- Streams não substituem todos os `for` — elas **complementam**

---

## 🤔 Quando Usar Stream API?

Use Stream quando:
- A intenção do código ficar mais clara.  
- O problema puder ser expresso como transformação de dados.  
- A leitura do pipeline for simples e direta.  

Evite Stream quando:
- A lógica for altamente imperativa.  
- Houver dependência complexa de estado.  
- A legibilidade piorar.  

---

## 🔗 Relação com Este Módulo:  

Este documento fornece a **base conceitual** para os exemplos práticos localizados neste diretório:

- `StreamBasico.java` → Streams com listas simples.  
- `StreamComObjetos.java` → Streams aplicadas a objetos de domínio.  
- `StreamAPIPratica.java` → Consolidação prática e leitura de pipelines.  

---

## 📌 Conclusão:  

A Stream API não é apenas uma ferramenta sintática, mas uma **mudança de mentalidade** na forma de trabalhar com dados em Java.

Antes de escrever Streams, é essencial **aprender a lê-las**.

---

> Streams bem escritas transformam código em narrativa.
