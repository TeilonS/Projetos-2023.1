Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 25/05/2023
Var
// Se��o de Declara��es das vari�veis 
      ano_atual, ano_nasc, idade: inteiro

Inicio
// Se��o de Comandos, procedimento, fun��es, operadores, etc... 
      Escreva ("Em que ano nos estamos?" )
      Leia (ano_atual)
      Escreva ("Em que ano eu nasci?" )
      Leia (ano_nasc)
      idade <- ano_atual - ano_nasc
      Escreva ("Em ", ano_atual, " voce tera ", idade, " anos.")
      Se (idade >= 18) entao
      Escreval ("Voce ja atingiu a maioridade. ")
      Fimse

Fimalgoritmo