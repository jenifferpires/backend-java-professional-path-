# Stream API na Prática.  

## 🎯 Objetivo:  

Este material tem como objetivo **aplicar a Stream API em Java de forma prática, consciente e legível**, utilizando coleções reais e exemplos progressivos.

Aqui, a Stream API deixa de ser apenas conceito e passa a ser **ferramenta de trabalho no dia a dia**.

Ao final, a pessoa estudante deverá ser capaz de:

- Criar Streams a partir de coleções
- Utilizar operações intermediárias (`filter`, `map`, `sorted`, `distinct`)
- Aplicar operações terminais (`forEach`, `collect`, `count`, `findFirst`)
- Ler pipelines de Stream com clareza
- Avaliar quando usar Stream e quando **não usar**

---

## 🧠 Pré-requisitos:  

Antes de estudar este conteúdo, é esperado que a pessoa estudante compreenda:

- Coleções (`List`, `Set`, `Map`)
- Expressões Lambda
- Conceitos fundamentais da Stream API

Esses temas foram trabalhados anteriormente no módulo **05 — Programação Funcional**.

---

## 🧩 Como Pensar Streams na Prática:  

Uma Stream deve ser lida como uma **frase**, da esquerda para a direita:

> "A partir destes dados, filtre isso, transforme aquilo e produza um resultado."

Se a leitura não for clara, o código provavelmente pode (e deve) ser melhorado.

---

## 🔁 Operações Mais Utilizadas.  

### Operações Intermediárias (transformação):  

- `filter` → seleciona elementos
- `map` → transforma elementos
- `sorted` → ordena
- `distinct` → remove duplicados

### Operações Terminais (resultado):  

- `forEach` → executa uma ação
- `collect` → converte para outra estrutura
- `count` → conta elementos
- `findFirst` → retorna o primeiro elemento

---

## 📂 Organização do Diretório:  

```text
05-programacao-funcional/
├── README.md
├── lambdas/
│   └── Lambdas.java
└── streams/
    ├── README.md
    └── StreamAPI.md
``` 
Este diretório concentra exemplos práticos e leitura guiada do uso da Stream API.

### 📌 Boas Práticas:  

Priorize legibilidade acima de tudo. 
Evite pipelines muito longas. 
Não force Stream onde um for simples é mais claro. 
Streams são ferramentas, não regras. 

#### 🔗 Conexão com o Módulo: 

Este conteúdo consolida conceitos fundamentais:

Coleções → dados. 

Programação funcional → comportamento. 

Stream API → processamento declarativo. 

> Stream API bem utilizada transforma código complexo em leitura simples.