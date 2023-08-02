import java.util.Scanner;

public class L06B {

    public static void main(String[] args) {
        // Criando a matriz A e a matriz B
        int[] matrizA = new int[8];
        int[] matrizB = new int[8];

        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lendo os elementos da matriz A e construindo a matriz B
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o elemento da matriz A na posição " + i + ": ");
            matrizA[i] = scanner.nextInt();
            matrizB[i] = matrizA[i] * 3;
        }

        // Apresentando a matriz B
        System.out.println("Os elementos da matriz B são:");
        for (int i = 0; i < 8; i++) {
            System.out.println(matrizB[i]);
        }
    }
}
