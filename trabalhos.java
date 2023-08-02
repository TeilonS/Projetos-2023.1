import java.util.Scanner;

public class trabalhos {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int num[] = new int[5];
            int cont;
            for (cont = 0; cont < 5; cont++) {
                System.out.print("Digite o " + (cont + 1) + "º número: ");
                num[cont] = entrada.nextInt();
            }
            System.out.println("Estes foram os números digitados:");
            for (cont = 0; cont < 5; cont++) {
                System.out.println("Posição " + (cont + 1) + " número: " + num[cont]);
            }
        }
    }
}
