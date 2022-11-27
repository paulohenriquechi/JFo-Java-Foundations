# Java Foundations
Exercícios - Seção 6

## Problema 1: Validando um PIN Bancário
Visão Geral

Desenvolva um programa Java para validar um PIN bancário de um cliente. Use um loop while para repetir o código até que um PIN válido seja inserido.
 
Tarefa

1. Declare um PIN inteiro válido.
2. Solicite que o usuário insira o PIN.
3. Em um loop while, execute as seguintes etapas:
- o	Compare o PIN inserido pelo usuário com o PIN já declarado. 
- o	Se o PIN inserido não for o mesmo, solicite que o usuário insira o PIN novamente.
- o	Repita o loop até que o PIN correto seja inserido.
4. Imprima uma mensagem confirmando que o PIN correto foi inserido e que agora o usuário tem 
acesso à conta.
 
O arquivo ValidatePin.java está disponível para ajudar você a começar.

## Problema 2: Exibindo Múltiplos de um Número
Visão Geral

Desenvolva um programa java para calcular os múltiplos de determinado número usando um loop for.

Tarefa

Faça com que o usuário insira um número e use um loop for para exibir todos os múltiplos desse número 
de 1 a 12.

Saída Esperada:
- 7*1 = 7
- 7*2 = 14
- 7*3 = 21
- 7*4 = 28
- 7*5 = 35
- 7*6 = 42
- 7*7 = 49
- 7*8 = 56
- 7*9 = 63
- 7*10 = 70
- 7*11 = 77
- 7*12 = 84

## Problema 3: Arte ASCII Programática
Visão Geral

O uso de texto para criar uma imagem é um processo conhecido como arte ASCII. Na seção 2, criamos um gato usando arte ASCII. Para isso, precisamos digitar cada caractere na arte que queríamos criar. Neste exercício, você encontrará uma maneira de desenhar formas básicas de maneira programática em tamanhos personalizáveis.

- Retângulo 5x4
- Triângulo isósceles direito 5x5

Tarefa

Complete os dois métodos a seguir em LoopShape.java:
-	createRectangle(): este método aceita dois argumentos para largura e altura que devem ser usados para imprimir um retângulo.
-	createTriangle(): este método aceita um argumento para o tamanho de uma perna, que deve ser usado para imprimir um triângulo isósceles direito.

Tente mudar o valor dos argumentos de que você está fornecendo esses dois métodos do método principal. Certifique-se de que seu programa seja capaz de desenhar cada forma com um tamanho personalizado. 

Além disso, seu programa deve fazer o seguinte:
-	Recusar-se a desenhar formas com qualquer dimensão inferior a 1
-	Ser capaz de desenhar formas com qualquer dimensão igual a 1 (uma forma 1x1 deve imprimir 
um único caractere)

Se o problema parecer difícil, lembre-se de dividi-lo em desafios menores, como:
-	Como eu imprimo uma linha individual que seja um número variável com "#" caracteres de comprimento?
-	Como eu crio uma String que comece e termine com "#", mas tenha um número variável de espaços intermediários?

A conclusão de cada desafio menor é uma etapa vencida. Este problema abrange entender o funcionamento dos loops, bem como compreender como dividir um problema maior em tarefas menores.

O conhecimento adquirido nesta seção sobre loops será muito útil para completar este programa. Sinta-se livre para usar o tipo de instruções de loop que considerar mais apropriado. Você também precisará lembrar alguns conceitos sobre seções anteriores.  

Os arquivos LoopShape.java e LoopShapeTest.java estão disponíveis para ajudar você a começar.

