// https://replit.com/@TEILONOLIVEIRA

// Teilon Oliveira Santos

//1) Fazer um programa onde se leiam 10 elementos de uma matriz A do tipo vetor. Construir 2 matrizes B e C de mesmo tipo, observando a seguinte lei de formação: todo elemento de B deverá ser o somatório do elemento de A correspondente e todo elemento de C deverá ser o fatorial do elemento de A correspondente. Montar uma rotina de pesquisa binária, para pesquisar os elementos armazenados na matriz A e a resposta deve mostrar o valor do somatório correspondente armazenado na matriz B e o fatorial correspondente armazenado na matriz C. A rotina de pesquisa deverá dar ao usuário a opção de continuar pesquisando ou não ao final de cada pesquisa.Ex.: A[0] = 3 // B[0] = 6 // C[0]=6, A[1] = 4 // B[1]= 10 // C[1]= 24... Ao se pesquisar o valor 4 o sistema deve dar a seguinte resposta: “O valor 4 foi encontrado na posição 1, o seu somatório é 10 e o fatorial é 24.”; ou então se o valor pesquisado não for encontrado a resposta deve ser: “Valor X não encontrado.” (3,0)//

import java.util.Arrays;
import java.util.Scanner;

class TOS_AV3 {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " da matriz A: ");
            A[i] = scanner.nextInt();

            int somatorio = 0;
            for (int j = 0; j <= i; j++) {
                somatorio += A[j];
            
            int fatorial = 1;
                for (int k = 1; k <= A[j]; k++) {
                    fatorial *= k;
                }
                C[j] = fatorial;
            }
            B[i] = somatorio;
        }

        Arrays.sort(A);

        boolean continuar = true;
        while (continuar) {
            System.out.print("Digite o valor a ser pesquisado: ");
            int valorPesquisado = scanner.nextInt();
            int inicio = 0;
            int fim = A.length - 1;
            boolean encontrado = false;
            int posicao = -1;
            while (inicio <= fim) {
                int meio = (inicio + fim) / 2;
                if (A[meio] == valorPesquisado) {
                    encontrado = true;
                    posicao = meio;
                    break;
                } else if (A[meio] < valorPesquisado) {
                    inicio = meio + 1;
                } else {
                    fim = meio - 1;
                }
            }
            if (encontrado) {
                System.out.println("O valor " + valorPesquisado + " foi encontrado na posição " + posicao +
                        ", o seu somatório é " + B[posicao] + " e o fatorial é " + C[posicao] + ".");
            } else {
                System.out.println("Valor " + valorPesquisado + " não encontrado.");
            }

            System.out.print("Deseja continuar pesquisando? (S/N): ");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }
        scanner.close();
    }
}