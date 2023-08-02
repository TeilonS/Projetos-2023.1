Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 25/05/2023
Var
// Seção de Declarações das variáveis 
   preco, imposto: Real
   
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   Escreva ("Qual o preco do produto? US$")
   Leia (preco)
   imposto <- (preco * 60)/100
   Escreva ("O imposto sera de US$", imposto:5:2)
   
Fimalgoritmo