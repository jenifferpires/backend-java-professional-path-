# ➗ Operadores em Java.  

## 🎯 Objetivo deste conteúdo:  

Este material apresenta os **operadores em Java**, que permitem realizar cálculos, comparações e tomadas de decisão dentro de um programa.

Ao final deste conteúdo, você deverá:

* Conhecer os principais tipos de operadores
* Entender quando e como utilizá-los
* Ler expressões Java com mais segurança

---

## 🧠 O que são operadores?

Operadores são **símbolos especiais** usados para realizar operações sobre valores e variáveis.

Eles são fundamentais para:

* cálculos matemáticos.  
* comparações.  
* decisões lógicas.  
* controle do fluxo do programa.  

---

## 🔢 Operadores Aritméticos:  

Utilizados para cálculos matemáticos.

| Operador | Descrição      | Exemplo |
| -------- | -------------- | ------- |
| `+`      | Adição         | `a + b` |
| `-`      | Subtração      | `a - b` |
| `*`      | Multiplicação  | `a * b` |
| `/`      | Divisão        | `a / b` |
| `%`      | Módulo (resto) | `a % b` |

📌 Atenção: divisão entre inteiros resulta em número inteiro.

---

## 🔁 Operadores de Atribuição:  

Utilizados para atribuir valores a variáveis.

| Operador | Exemplo  |
| -------- | -------- |
| `=`      | `x = 10` |
| `+=`     | `x += 5` |
| `-=`     | `x -= 3` |
| `*=`     | `x *= 2` |
| `/=`     | `x /= 4` |

Esses operadores tornam o código mais curto e legível.

---

## ⚖️ Operadores Relacionais:  

Utilizados para **comparar valores**. O resultado sempre é um `boolean`.

| Operador | Descrição      |
| -------- | -------------- |
| `==`     | Igual a        |
| `!=`     | Diferente de   |
| `>`      | Maior que      |
| `<`      | Menor que      |
| `>=`     | Maior ou igual |
| `<=`     | Menor ou igual |

---

## 🔀 Operadores Lógicos:  

Utilizados para combinar expressões booleanas.

| Operador | Significado |   |           |
| -------- | ----------- | - | --------- |
| `&&`     | E lógico    |   |           |
| `        |             | ` | OU lógico |
| `!`      | NÃO lógico  |   |           |

Esses operadores são muito usados em estruturas condicionais.

---

## 📌 Precedência de operadores:  

Assim como na matemática, operadores possuem **ordem de execução**.

Exemplo:

```java
int resultado = 2 + 3 * 4; // resultado será 14
```

Use parênteses para deixar a intenção clara:

```java
int resultado = (2 + 3) * 4; // resultado será 20
```

---

## 🧠 Boas práticas:  

* Prefira expressões simples e legíveis
* Use parênteses para evitar ambiguidades
* Não misture muitas operações na mesma linha

---

## 📌 Conclusão:  

Operadores são essenciais para dar **dinamismo** aos programas Java.

Compreendê-los bem é fundamental antes de avançar para estruturas condicionais e laços de repetição.

---

> Código claro começa com expressões bem escritas.
