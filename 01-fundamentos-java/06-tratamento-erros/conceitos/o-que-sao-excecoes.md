# ❓ O que são Exceções em Java. 

## 🎯 Objetivo deste Conceito:  

Este material tem como objetivo explicar **o que são exceções**, por que elas existem e qual o papel delas no fluxo de execução de um programa Java.

Aqui o foco não é código avançado, mas **modelo mental**.

---

## 🧠 O que é uma Exceção?

Uma exceção é um **evento inesperado ou anormal** que ocorre durante a execução de um programa e **interrompe o fluxo normal** das instruções.

Em termos simples:

> Uma exceção indica que algo deu errado e precisa de atenção.

Ela pode ser causada por:

* Dados inválidos.  
* Falta de recursos.  
* Erros de lógica.  
* Falhas externas (arquivo, rede, banco de dados).  

---

## 🔁 Fluxo Normal vs Fluxo com Exceção. 

### Fluxo normal: 

O programa executa instrução por instrução, de cima para baixo.

### Fluxo com exceção:  

Quando uma exceção ocorre:

1. A execução normal é interrompida.  
2. O Java cria um **objeto de exceção**.  
3. O sistema procura um local que saiba lidar com aquele erro.  
4. Se não encontrar, o programa é encerrado.  

Esse mecanismo evita que o sistema continue executando em um estado inconsistente.

---

## ⚙️ Exceções são Objetos:  

Em Java, exceções **são classes** e fazem parte da hierarquia da linguagem.

Isso significa que:

* Podem ser instanciadas.  
* Possuem atributos e métodos.  
* Podem ser estendidas (exceções customizadas).  

Essa abordagem torna o tratamento de erros **estruturado e previsível**.

---

## 🚫 Exceções não são Erros de Programação Simples

Nem todo erro deve ser tratado com exceção.

Exceções **não substituem**:

* Validações simples.  
* Uso correto de estruturas condicionais.  
* Testes.  

Elas existem para representar **situações fora do fluxo esperado**, não para controlar o fluxo normal da aplicação.

---

## 📌 Por que Entender Exceções é Importante?

Um bom tratamento de exceções:

* Evita falhas silenciosas.  
* Melhora a experiência do usuário.  
* Facilita manutenção.  
* Torna o código mais confiável.  

Saber **quando lançar**, **quando tratar** e **quando propagar** uma exceção é sinal de maturidade técnica.

---

## 🔗 Próximo Passo

Com o conceito claro, o próximo tema será:

👉 **Hierarquia de Exceções em Java**

Entender quem herda de quem é essencial para tratar erros corretamente.

---

> Exceções não são inimigas do código — são aliadas da confiabilidade.
