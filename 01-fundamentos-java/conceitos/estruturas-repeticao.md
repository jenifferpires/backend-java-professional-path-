# 🔁 Estruturas de Repetição em Java.  

## 🎯 Objetivo deste conteúdo:  

Este material apresenta as **estruturas de repetição em Java**, utilizadas para executar um bloco de código várias vezes enquanto uma condição for satisfeita.

Ao final deste conteúdo, você deverá:

* Entender quando usar cada tipo de laço.  
* Utilizar `while`, `do while` e `for`.  
* Evitar loops infinitos e erros comuns.  

---

## 🧠 O que são estruturas de repetição?

Estruturas de repetição permitem **automatizar tarefas repetitivas**, evitando duplicação de código e tornando os programas mais eficientes.

São amplamente usadas para:

* percorrer listas e arrays.  
* repetir cálculos.  
* processar grandes volumes de dados.  

---

## 🔄 Estrutura `while`.  

Executa o bloco de código **enquanto** a condição for verdadeira.

```java
while (condicao) {
    // código executado enquanto a condição for verdadeira
}
```

📌 A condição é verificada **antes** da execução.

---

## 🔂 Estrutura `do while`.  

Semelhante ao `while`, porém garante que o bloco será executado **ao menos uma vez**.

```java
do {
    // código executado pelo menos uma vez
} while (condicao);
```

📌 A condição é verificada **após** a execução.

---

## 🔁 Estrutura `for`.  

Indicada quando se sabe **quantas vezes** o loop deve ser executado.

```java
for (int i = 0; i < 5; i++) {
    // código executado em cada iteração
}
```

Estrutura do `for`:

* inicialização.  
* condição.  
* incremento/decremento.  

---

## ⚠️ Cuidados importantes:  

* Sempre garanta que a condição será falsa em algum momento.  
* Evite loops infinitos não intencionais.  
* Use nomes claros para variáveis de controle (`i`, `contador`).  

---

## 🧠 Boas práticas:  

* Prefira `for` quando houver contador.  
* Use `while` para condições abertas.  
* Mantenha loops curtos e legíveis.  

---

## 📌 Conclusão:  

Estruturas de repetição são fundamentais para escrever código **eficiente e escalável** em Java.

Dominá-las é essencial para avançar para arrays, listas e algoritmos mais complexos.

---

> Repetir bem é programar melhor.
