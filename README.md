# Exercicios_Java
Lista de exercícios referente às aulas de Técnica de Programação I   
Ambiente utilizado: **NetBeans IDE 8.0.1**

## AULA 01.1
### EXERCICIO 01
>1- DECLARE AS VARIÁVEIS N1, N2 COMO TIPO REAL, LEIA OS VALORES DE N1 E N2 E FAÇA AS 4 OPERAÇÕES MATEMÁTICAS (ADIÇÃO, SUBTRAÇÃO,DIVISÃO E MULTIPLICAÇÃO) COM ESTES VALORES DE N1 E N2.

>EXEMPLO: ADICAO = N1 + N2;

### EXERCICIO 02
>2- FAZER UM ALGORITMO QUE MOSTRE A MÉDIA ARITMÉTICA DAS NOTAS. LEIA AS NOTAS NOTA1, NOTA2,NOTA3. CALCULE A MÉDIA1. LEIA AS NOTAS4, NOTA5, NOTA6. CALCULE A MÉDIA2. DEPOIS FAÇA A SOMA DAS DUAS MÉDIAS.

>EXEMPLO:
>MEDIA1=(NOTA1+NOTA2+NOTA3)/3
>MEDIA2= (NOTA4+NOTA5+NOTA6)/3
>SOMA = MEDIA1+MEDIA2

### EXERCICIO 03
>3- FAÇA UM ALGORITMO E CRIE UMA VARIÁVEL
INTEIRA IDADE=(DIGITE SUA IDADE) E OUTRA
DIAS, VERIFIQUE QUANTOS DIAS VOCÊ JÁ VIVEU.
LEVE EM CONSIDERAÇÃO O ANO COM 365
DIAS.

>EXEMPLO:
>DIAS = IDADE * 365;

### EXERCICIO 04
>4- CRIE UM ALGORITMO QUE LEIA O VALOR DO
SALÁRIO MÍNIMO E COLOQUE UM VALOR DO SALÁRIO
DE UM FUNCIONÁRIO=(DIGITE SALARIO), CALCULE A
QUANTIDADE DE SALÁRIOS MÍNIMOS ESSE FUNCIONÁRIO
GANHA.

>EXEMPLO:
>QTDSAL = SALFUNC/SALMINIMO;

## AULA 01.2
### EXERCICIO 01
>1-Escreva um algoritmo para ler o salario mensal atual de um funcionario e o percentual de reajuste. Calcular e escrever o valor do novo
>salário.

>novosalario=salario+(Salario * percentual)/100

### EXERCICIO 02
>2- FAÇA UM ALGORITMO ,QUE LEIA O NÚMERODE LITROS, ABASTECIDO EM UM VEÍCULO

>CALCULE E MOSTRE O VALOR A SER PAGO PELO CLIENTE SABENDO-SE QUE O PREÇO DO LITRO DA GASOLINA É R$ 5,89.

>VALORPAGO <- NUMERO LITROS * 5.89

### EXERCICIO 03
>3- Leia: a descrição do produto (nome), a quantidade comprada e o preço unitário.
>Calcular e escrever o total a pagar. total = quantidadecomprada * preçounitario

>Mostre o nome do produto e o total a pagar

### EXERCICIO 04
>4- A PARTIR DAS MEDIDAS DOS LADOS DE UM RETÂNGULO, CALCULE A ÁREA E O PERÍMETRO DESTE RETÂNGULO
>CALCULE A ÁREA E O PERÍMETRO DESTE RETÂNGULO. LEIA A MEDIDA DO LADO A E LADO B EM CENTÍMETROS.

>AREA = A.B
>PERIMETRO = 2.A + 2.B

## AULA 01.3
### EXERCICIO 01
>1- Faça um algoritmo em Java que receba dois números inteiros,
>calcule e mostre o dobro do primeiro e o triplo do segundo

>Mostre os numeros e o resultado do dobro e o triplo

### EXERCICIO 02
>2- Faça um algoritmo em Java, que receba um número inteiro.
>Calcule e mostre este número elevado ao quadrado

>Quadrado = numero * numero

### EXERCICIO 03
>3- Uma loja de móveis paga a seu vendedor um fixo de R$1000 por mês, mais um bônus de R$50 por móvel vendido.
>Faça um algoritmo que leia a quantidade de móveis vendidos por um vendedorcalcule o salário total do funcionário.

>Mostre a quantidade que foi vendida, e mostre o salario total do funcionario

### EXERCICIO 04
>4- Crie um algoritmo para efetuar o calculo do valor de uma parcela em atraso. Leia o valor da prestação e a taxa de juros
>Leia o valor da parcela e a taxa de juros

>valoratraso = valor + (valor * (taxa/100) * tempo)

## AULA 01.5
### EXERCICIO 01
>FAÇA UM ALGORITMO PARA CALCULAR A ÁREA DE UMA CIRCUNFERÊNCIA.

>AREA = (3.14* (R*R) )

### EXERCICIO 02
>DESENVOLVA UM PROGRAMA LEIA O NOME, O VALOR E A QUANTIDADE VENDIDA, DE TRES PRODUTOS. CALCULE O VALOR TOTAL DA COMPRA. >CALCULE O VALOR DE CADA PRODUTO.MOSTRE O VALOR DE CADA PRODUTO E O VALOR TOTAL

>EXEMPLO:
>VALORPRODUTO1= VALOR1 * QUANTIDADE1
>VALORTOTAL= VALORPRODUTO 1+VALORPRODUTO2+VALORPRODUTO3

### EXERCICIO 03
>CALCULAR E APRESENTAR O VALOR DO VOLUME DE UM CILINDRO, UTILIZANDO A

>FÓRMULA: VOLUME = 3.14159 * raio * raio * ALTURA

### EXERCICIO 04
>UM SUPERMERCADO PRECISA DE UMA APLICAÇÃO QUE MOSTRE OS PRODUTOS A COMPRAR SEMANALMENTE.

>O NOME DO PRODUTO, A QUANTIDADE MAXIMA DO PRODUTO, E A QUANTIDADE EM ESTOQUE DO PRODUTO, SÃO INFORMAÇÕES DIGITADAS PELO >USUÁRIO. ELABORE UM ALGORITMO PARA ESTA APLICAÇÃO. CALCULE A QUANTIDADE A COMPRAR

>A APLICAÇÃO DEVE MOSTRAR O NOME DO PRODUTO E A QUANTIDADE A COMPRAR

>QUANTIDADE_COMPRAR = QUANTIDADE MAXIMA- QUANTIDADE ESTOQUE

## AULA 02.1
### EXERCICIO 01
>Passagem  
>&minus;nomePassageiro : String  
>&minus;telefone: String  
>&minus;RG: String  
>&minus;localViagem: String  
>&minus;data: String  
>&minus;horário: String  
>&minus;numpoltrona: String  
> -----------------------------------
>+cadastrarDadosPassageiros(): void  
>+cadastrarDadosPassagem():void  
>+mostrarDadosPassageiro():void  
>+mostrarDadosPassagem():void  

>Principal  
>+main(args{}: String): void

### EXERCICIO 02
>Cliente  
>&minus;nome : string  
>&minus;end : string  
>&minus;rg : string  
>-----------------------------------  
>&plus;cadastrarCliente:void()  
>&plus;listarCliente:void()  

>Principal  
>&plus;main(args[]:String):void()  

### EXERCICIO 03
>Fornecedores  
>&minus;nomeFornecedor : string  
>&minus;nomeProduto : string  
>&minus;descricaoProduto : string  
>&plus;cadastrarFornecedor:void()  
>&plus;listarFornecedor:void()  
>----------------------------------
>Principal    
>&plus;main(args[]:String):void()  

### EXERCICIO 04
>Dobro    
>&minus;numero : double    
>&minus;calculo : double  
>---------------------------------
>&plus;calcularDobro:void()

>Principal  
>&plus;main(args[]:String):void()    

## AULA 02.2
### EXERCICIO 01
>O programa deve calcular a multiplicação de um valor digitado por 4

>Multiplicacao  
>&minus;valor: int  
>&minus;resultado: int  
>--------------------------------
>+multiplicacao4()  
>&plus;MostrarMultiplicacao ():void  

>Principal  
>&plus;main(args{}: String): void  

### EXERCICIO 02
>O programa deve calcular o número digitado elevado ao quadrado  
>Exemplo: 4*4= 16

>Quadrado  
>&minus;numero: double  
>&minus;Resultado: double  
>-------------------------------
>&plus;calcularquadrado()  
>&plus;mostrarQuadrado():void  

Principal
>&plus;main(args{}: String): void  
   
### EXERCICIO 03
>O programa deve ser digitado o ano que a pessoa nasceu e calcular a idade  

>IdadePessoa
>&minus;ano: int  
>&minus;idade: int  
>-------------------------------
>+calcularldade()  
>+mostrarldade ():void  

>Principal  
>&plus;main(args{}: String): void  
  
### EXERCICIO 04
>O programa deve ler os dados da loja depois calcular o valor Total e mostrar  
>valorTotal = valorCompra * qtdltenComp  
>Os dados e valor total da compra  

>Loja  
>&minus;razaoSocial: String  
>&minus;cpfCliente: String  
>&minus;valorCompra: double;  
>&minus;qtdltensComp: double;  
>&minus;valorTotalCompra: double;  
>--------------------------------------  
>+inserirDadosLoja() : void  
>+mostrarDadosLoja(): String  
>+calcularCompraLoja():double  

>Principal  
>&plus;main(args(}: String): void  

## AULA 02.4
### EXERCICIO 01
### EXERCICIO 02
### EXERCICIO 03
### EXERCICIO 04
### EXERCICIO 05

## AULA 02.4
### EXERCICIO 01
### EXERCICIO 02
