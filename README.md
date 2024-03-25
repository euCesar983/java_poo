# Java | Orientação a Objetos

<p>Uma das linguagens mais populares para desenvolvimento back-end, e explore o poder da Orientação a Objetos, bem como as principais bibliotecas do mundo Java</p>
<hr>
<p>Começando com o primeiro programa em java, o famoso olá, mundo</p>

```java

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo");
    }
}
```

<p>Então, nesse começo o código diz que eu terei um método principal, e nele vamos ter as nossas sequencias e condições</p>

<p>No processo de executar nossa main, ele ira criar um arquivo ".class", esse arquivo é o código que é compilado(transformado) para a máquina conseguir entender nosso código fonte</p>

<h2>Operadores de atribuição:</h2>

<p>Os operadores de atribuição são usados para atribuir um valor a uma variável. O operador de atribuição básico é o "=" (sinal de igual). Por exemplo:</p>

```java
int valor =  5;  //Atribui o valor 5 à variável valor
```

<p>Existem também operadores de atribuição combinados, que são uma forma abreviada de atribuição. Por exemplo, o operador "+=" adiciona um valor à variável existente. Assim:</p>

```java
int valor =  10;
valor += 15;  //Equivalente a valor = valor + 15, atribui o valor 25 à variável valor
```

<h2>Operadores aritméticos:</h2>

<p>Os operadores aritméticos são usados para realizar operações matemáticas básicas. São eles:

    "+" (adição)
    "-" (subtração)
    "*" (multiplicação)
    "/" (divisão)
    "%" (resto da divisão)

</p>

<p>Por exemplo:

int a = 10 + 5; // Atribui o valor 15 à variável a
int b = 10 - 5; // Atribui o valor 5 à variável b
int c = 10 \* 5; // Atribui o valor 50 à variável c
int d = 10 / 5; // Atribui o valor 2 à variável d
int e = 10 % 3; // Atribui o valor 1 à variável e (o resto da divisão de 10 por 3 é 1)</p>

<h2>Operadores relacionais:</h2>

<p>Os operadores relacionais são usados para comparar valores. Eles retornam um valor booleano (verdadeiro ou falso). Trabalharemos melhor com eles quando estivermos na aula de condicionais, onde vamos modificar o fluxo da aplicação dada alguma condição. São eles:

    "==" (igual a)
    "!=" (diferente de)
    ">" (maior que)
    ">=" (maior ou igual a)
    "<" (menor que)
    "<=" (menor ou igual a)

</p>

<h2>Operadores lógicos:</h2>

<p>Esses operadores são usados quando queremos verificar duas ou mais condições e/ou expressões na aplicação. Eles fazem a comparação de valores booleanos e retornam também um resultado booleano.

São três operadores: AND (&&), OR (||) e NOT (!).

O operador AND (&&), que traduzindo para o português seria o E, é usado para verificar se duas condições são verdadeiras. Se ambas as condições forem verdadeiras, o resultado será verdadeiro. Caso contrário, o resultado será falso. Aqui está um exemplo:

</p>

```java
boolean a = true;
boolean b = false;
if (a && b) {
// Este código não será executado, já que a é verdadeiro e b é falso.
}
```

<p>O operador OR (||), que traduzindo para o português seria o OU, é usado para verificar se pelo menos uma das condições é verdadeira. Se pelo menos uma das condições for verdadeira, o resultado será verdadeiro. Caso contrário, o resultado será falso. Aqui está um exemplo:
</p>

```java
boolean a = true;
boolean b = false;
if (a || b) {
// Este código será executado, já que a é verdadeiro, mesmo que b seja falso.
}
```

<p>O operador NOT (!) é usado para negar uma condição. Se a condição for verdadeira, o resultado será falso. Se a condição for falsa, o resultado será verdadeiro. Aqui está um exemplo:
</p>

```java
boolean a = true;
if (!a) {
// Este código não será executado, já que a é verdadeiro.
}
```

<h2>Casting</h2>

<p>
Casting é um recurso utilizado em Java para converter um tipo de dado em outro. Essa conversão pode ser feita de forma automática pelo compilador (conversão implícita), quando o tipo de dado de destino é compatível com o tipo de dado de origem, ou de forma manual (conversão explícita), utilizando o operador de casting.

O casting é utilizado para permitir que tipos de dados incompatíveis possam ser utilizados em uma mesma operação ou expressão. Por exemplo, se um método espera um parâmetro do tipo int e o valor que se deseja passar é do tipo double, é necessário fazer um casting para converter o valor em int.
Casting implícito

O casting implícito é realizado automaticamente pelo compilador quando o tipo de dado de origem é compatível com o tipo de dado de destino. Por exemplo, é possível atribuir um valor de tipo int a uma variável do tipo double, pois o tipo double é maior e suporta todos os valores que o tipo int pode armazenar:

</p>

```java
double x = 10.5;
int y = (int) x; // casting explícito
```

<h2>Scanner</h2>

<p>
A classe Scanner do Java é utilizada para ler dados de entrada em um programa Java. Esses dados podem ser lidos a partir de várias fontes de entrada, como arquivos, fluxos de entrada, Strings e até mesmo a entrada do usuário através do teclado
</p>

```java
public class ExemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o valor que pretende investir esse mês: ");
        double valor = scanner.nextDouble();

        System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + valor + " esse mês.");

        scanner.close();
    }
}
```

<h2>Laço de Repetição</h2>

<p>
Em Java, os laços de repetição são estruturas fundamentais para executar um bloco de código várias vezes. Existem três tipos principais de laços de repetição em Java:
</p>

```java
for (int i = 0; i < 5; i++) {
    // Bloco de código a ser repetido
}

int contador = 0;
while (contador < 5) {
    // Bloco de código a ser repetido
    contador++;
}

```



