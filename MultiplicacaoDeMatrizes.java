import java.util.Scanner;

public class MultiplicacaoDeMatrizes {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita ao usuário as dimensões das matrizes
            System.out.println("Digite a ordem da primeira matriz: ");
            int linhasA = scanner.nextInt();
            int colunasA = scanner.nextInt();

            System.out.println("Digite a ordem da segunda matriz: ");
            int linhasB = scanner.nextInt();
            int colunasB = scanner.nextInt();

            // Verifica se as matrizes podem ser multiplicadas
            if (colunasA != linhasB) {
                System.out.println("As matrizes não podem ser multiplicadas.");
                System.exit(0);
            }

            // Cria as matrizes
            int[][] matrizA = new int[linhasA][colunasA];
            int[][] matrizB = new int[linhasB][colunasB];

            // Lê os valores das matrizes
            System.out.println("Digite os valores da primeira matriz: ");
            for (int i = 0; i < linhasA; i++) {
                for (int j = 0; j < colunasA; j++) {
                    matrizA[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Digite os valores da segunda matriz: ");
            for (int i = 0; i < linhasB; i++) {
                for (int j = 0; j < colunasB; j++) {
                    matrizB[i][j] = scanner.nextInt();
                }
            }

            // Multiplica as matrizes
            int[][] matrizC = new int[linhasA][colunasB];
            for (int i = 0; i < linhasA; i++) {
                for (int j = 0; j < colunasB; j++) {
                    for (int k = 0; k < colunasA; k++) {
                        matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }

            // Imprime a matriz resultante
            System.out.println("A matriz resultante é: ");
            for (int i = 0; i < linhasA; i++) {
                for (int j = 0; j < colunasB; j++) {
                    System.out.print(matrizC[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
