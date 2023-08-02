import java.util.Scanner;

public class L06A {

    public static void main(String[] args) {
        // Criando a matriz (vetor) vazia
        int[] matriz = new int[10];

        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lendo os 10 elementos da matriz
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento da posição " + i + ": ");
            matriz[i] = scanner.nextInt();
        }

        // Apresentando os elementos da matriz
        System.out.println("Os elementos da matriz são:");
        for (int i = 0; i < 10; i++) {
            System.out.println(matriz[i]);
        }
    }
}
