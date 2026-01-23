# ⚠️ 06 — Tratamento de Erros em Java.  

## 🎯 Objetivo do Módulo:  

Este módulo tem como objetivo apresentar **como o Java lida com erros e situações excepcionais**, indo além do uso mecânico de `try/catch`.

Ao final deste módulo, a pessoa estudante deverá:

* Entender o que são exceções e por que elas existem
* Conhecer a hierarquia de exceções do Java
* Diferenciar exceções **checked** e **unchecked**
* Ler e escrever código com tratamento de erros claro e consciente
* Criar exceções customizadas quando fizer sentido
* Pensar em exceções como **parte do fluxo da aplicação**, não como remendo

Este módulo prioriza **entendimento conceitual e boas decisões**, não quantidade de blocos `try/catch`.

---

## 🧠 Por que o Tratamento de Erros é Importante?

Erros fazem parte de qualquer sistema real:

* Dados inválidos.  
* Falhas de comunicação.  
* Arquivos inexistentes.  
* Regras de negócio violadas.  

O tratamento correto de erros:

* Evita falhas inesperadas.  
* Melhora a legibilidade do código.  
* Facilita manutenção e debug.  
* Comunica corretamente o problema.  

Em Java, exceções são a principal ferramenta para lidar com esses cenários.

---

## 🧩 O que são Exceções?

Uma exceção representa uma **situação anormal** que interrompe o fluxo normal da execução do programa.

Quando uma exceção ocorre:

1. O fluxo normal é interrompido.  
2. O Java procura um bloco que saiba lidar com aquela exceção.  
3. Se não encontrar, o programa é encerrado.  

Tratar exceções não é evitar erros, é **saber lidar com eles**.

---

## 📂 Organização do Módulo:  

```text
06-tratamento-erros/
│
├── README.md
│
├── conceitos/
│   ├── o-que-sao-excecoes.md
│   ├── checked-vs-unchecked.md
│   └── hierarquia-de-excecoes.md
│
├── exemplos/
│   ├── ExcecaoBasica.java
│   ├── MultiplosCatch.java
│   └── FinallyExemplo.java
│
└── praticas/
    ├── ExcecaoCustomizada.java
    └── ValidacaoComExcecao.java
```

Cada pasta tem um papel claro:

* **conceitos/** → entendimento teórico
* **exemplos/** → funcionamento do Java
* **praticas/** → aplicação em cenários reais.

## 📚 Conteúdos do módulo:  

1. [O que são exceções](./o-que-sao-excecoes.md). 
2. Hierarquia de exceções. 
3. Try, catch e finally. 
4. Checked vs Unchecked Exceptions. 
5. Criando exceções customizadas. 
6. Boas práticas no tratamento de erros. 

---

## 📌 Boas Práticas desde o Início:  

* Não use exceções para controle normal de fluxo.  
* Trate apenas o que você consegue resolver.  
* Mensagens de erro devem ser claras.  
* Exceções são parte do design da aplicação.  

---

## 🔗 Conexão com os Módulos Anteriores:  

Este módulo se conecta diretamente com:

* Estruturas de controle (fluxo interrompido).  
* Programação funcional (tratamento de falhas).  
* Código limpo e legível.  

Com exceções bem utilizadas, o código se torna **mais confiável e profissional**.

---

> Tratar erros bem é sinal de maturidade técnica. Ignorá-los é adiar problemas.
