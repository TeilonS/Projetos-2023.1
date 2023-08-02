package vscode;

import java.util.Arrays;
import java.util.Scanner;

class TOS_AV3_teste {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " da matriz A: ");
            A[i] = scanner.nextInt();

            int somatorio = 0;
            int fatorial = 1;
            for (int j = 0; j <= i; j++) {
                somatorio += A[j];
                fatorial = 1;
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