Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 25/05/2023
Var
// Seção de Declarações das variáveis 
      ano_atual, ano_nasc, idade: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
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