def soma(a, b):
  return a + b

def subtracao(a, b):
  return a - b

def multiplicacao(a, b):
  return a * b

def divisao(a, b):
  return a / b

print("Escolha o tipo de operação que deseja realizar:")
print("1. Soma")
print("2. Subtração")
print("3. Multiplicação")
print("4. Divisão")

operacao = int(input("Digite sua escolha: "))

if operacao == 1:
  numero1 = float(input("Digite o primeiro número: "))
  numero2 = float(input("Digite o segundo número: "))
  print(numero1, " + ", numero2, " = ", soma(numero1, numero2))

elif operacao == 2:
  numero1 = float(input("Digite o primeiro número: "))
  numero2 = float(input("Digite o segundo número: "))
  print(numero1, " - ", numero2, " = ", subtracao(numero1, numero2))

elif operacao == 3:
  numero1 = float(input("Digite o primeiro número: "))
  numero2 = float(input("Digite o segundo número: "))
  print(numero1, " * ", numero2, " = ", multiplicacao(numero1, numero2))

elif operacao == 4:
  numero1 = float(input("Digite o primeiro número: "))
  numero2 = float(input("Digite o segundo número: "))
  print(numero1, " / ", numero2, " = ", divisao(numero1, numero2))

else:
  print("Operação inválida.")