# 03 — Estruturas de Controle em Java.  

## 🎯 Objetivo do Módulo:  

Este módulo tem como objetivo apresentar as **estruturas de controle do Java**, responsáveis por definir o **fluxo de execução** de um programa.

Ao final deste módulo, a pessoa estudante deverá:

* Entender como o Java toma decisões.  
* Utilizar estruturas condicionais para controlar caminhos do código.  
* Aplicar estruturas de repetição para executar ações repetidas.  
* Ler e escrever código com fluxo lógico claro.  

---

## 🧠 O que são Estruturas de Controle?

Estruturas de controle determinam **como e quando** determinadas instruções serão executadas em um programa.

Elas permitem:

* Tomar decisões.  
* Repetir ações.  
* Controlar o fluxo de execução.  

Sem estruturas de controle, um programa executaria instruções apenas de forma sequencial.

---

## 🔀 Estruturas Condicionais

As estruturas condicionais permitem executar blocos de código **com base em uma condição**.

### `if / else`

```java
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

### `switch`

```java
switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    default:
        System.out.println("Dia inválido");
}
```

Essas estruturas são detalhadas nos exemplos práticos do módulo.

---

## 🔁 Estruturas de Repetição:  

Permitem executar um bloco de código **várias vezes**.

### `for`

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### `while`

```java
int contador = 0;
while (contador < 5) {
    contador++;
}
```

### `do-while`

```java
int numero = 0;
do {
    numero++;
} while (numero < 5);
```

---

## 🧭 Controle de Fluxo:  

Java oferece comandos para alterar o fluxo normal de execução:

* `break` → interrompe um loop ou switch.  
* `continue` → pula para a próxima iteração.  
* `return` → encerra a execução de um método.  

Esses comandos devem ser usados com cuidado para manter a legibilidade do código.

---

## 📁 Conteúdo deste Diretório:  

* `EstruturasCondicionais.java` → exemplos com if/else e switch
* `EstruturasRepeticao.java` → exemplos com loops
* `README.md` → explicação conceitual do módulo

---

## 📌 Observações Importantes:  

* Clareza lógica é mais importante que complexidade.  
* Evite aninhamentos excessivos.  
* Estruturas de controle bem usadas tornam o código legível e previsível.  

---

> Programar é ensinar o computador a tomar decisões de forma lógica.
