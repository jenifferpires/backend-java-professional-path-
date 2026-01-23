# O que são Exceções em Java. 

## 🎯 Objetivo do conteúdo:  

Este material tem como objetivo explicar **o conceito de exceções em Java**, deixando claro:

* O que são exceções
* Por que elas existem
* Como afetam o fluxo de execução do programa

Aqui **não entramos ainda em detalhes de código avançado**. O foco é construir uma base conceitual sólida, essencial para compreender `try/catch`, hierarquia de exceções e boas práticas nos próximos arquivos do módulo.

---

## 🧠 O que é uma exceção?

Em Java, uma **exceção** é um evento que ocorre **durante a execução do programa** e que **interrompe o fluxo normal** das instruções.

Ela indica que algo inesperado ou inválido aconteceu, como:

* Divisão por zero.  
* Acesso a uma posição inexistente de um array.  
* Tentativa de usar um objeto `null`.  
* Falha ao acessar arquivos, banco de dados ou APIs.  

📌 Importante:

> Exceções **não são erros de sintaxe**.
> O código compila normalmente, mas falha **em tempo de execução**.

---

## 🔁 Fluxo de execução: normal vs exceção:  

Antes de aprender a tratar exceções, é fundamental entender **como o Java executa o código**.

### 🟢 Fluxo normal

```text
Início
  ↓
Instrução 1
  ↓
Instrução 2
  ↓
Instrução 3
  ↓
Fim
```

O programa executa as instruções **sequencialmente**, sem interrupções.

---

### 🔴 Fluxo com exceção: 

```text
Início
  ↓
Instrução 1
  ↓
Instrução 2
  ↓
💥 Ocorre uma exceção
  ↓
Java interrompe o fluxo normal
  ↓
Procura um tratamento (try/catch)
```

A partir desse ponto, dois cenários são possíveis:

```text
✔ Exceção tratada → execução continua
✖ Exceção não tratada → aplicação encerra
```

## 📊 Infográfico — Fluxo de execução em Java:  

```text
🟢 FLUXO NORMAL
Início → Código → Código → Código → Fim

🔴 FLUXO COM EXCEÇÃO
Início → Código → 💥 Exceção
                   ↓
            try/catch existe?
              ↓            ↓
           Sim ✔        Não ✖
              ↓            ↓
       Execução segue   Aplicação encerra
```

📌 **Ponto-chave:**

Quando uma exceção acontece, o Java **para imediatamente** a execução normal e muda para o **fluxo de tratamento de erro**.

---

## ❓ Por que exceções existem?

Exceções existem para:

* Evitar que a aplicação continue em um estado inconsistente.  
* Tornar falhas explícitas e rastreáveis.  
* Permitir tratamento controlado de erros.  
* Separar lógica de negócio de lógica de erro.  

Sem exceções, o código ficaria repleto de verificações confusas, difíceis de ler e manter.

---

## ⚠️ Erro comum de iniciantes.  

### ❌ Usar exceções como controle de fluxo:  

Um erro muito comum é usar exceções para situações previsíveis:

```java
try {
    int resultado = 10 / 0;
} catch (Exception e) {
    System.out.println("Erro");
}
```

🚫 Problemas dessa abordagem:

* Usa exceção para algo previsível.  
* Captura `Exception` de forma genérica.  
* Esconde a causa real do problema.  

---

### ✅ Abordagem correta:  

Situações previsíveis devem ser tratadas com **validações**, não com exceções.

```java
if (divisor == 0) {
    System.out.println("Divisão inválida");
} else {
    int resultado = 10 / divisor;
}
```

📌 **Regra prática:**

> Se você consegue prever o problema, provavelmente **não é caso de exceção**.

---

## 📌 O que você deve levar deste conteúdo

Ao finalizar este arquivo, você deve compreender que:

* Exceções interrompem o fluxo normal do programa.  
* Elas ocorrem em tempo de execução.  
* O Java exige que exceções sejam tratadas ou propagadas.  
* Um código profissional **não abusa de exceções**.  

No próximo conteúdo, avançaremos para a **hierarquia de exceções em Java**, entendendo como o Java organiza erros e exceções através de classes.

---


