import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main (String[] args) {
        new Random();
        String[] hexadecimalNumbers = {
                "0", "1", "2", "3", "4", "5",
                "6", "7", "8", "9", "A",
                "B", "C", "D", "E", "F"
        };
        ArrayList<Integer> digitsToBeConverted = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            // Recebe de entrada um número decimal randômico.
            System.out.print("Digite um número decimal: ");
            int randomDecimalNumber = scanner.nextInt();
            boolean terminate = false;
            StringBuilder hexadecimalNumber = new StringBuilder();

            if (randomDecimalNumber < 16) {
                System.out.println("O número decimal sorteado para conversão foi: " + randomDecimalNumber);
                System.out.println("Seu correspondente em base hexadecimal é: " + hexadecimalNumbers[randomDecimalNumber]);
                return;
            }

            int quotient = randomDecimalNumber / 16;
            int restOfDivision = randomDecimalNumber % 16;
            digitsToBeConverted.add(restOfDivision);

            while (! terminate) {
                restOfDivision = quotient % 16;

                if (restOfDivision == quotient) {
                    digitsToBeConverted.add(0, restOfDivision);
                    terminate = true;
                }

                if (restOfDivision == 0) terminate = true;

                if (! terminate) {
                    quotient = quotient / 16;
                    digitsToBeConverted.add(0, restOfDivision);
                }
            }

            for (int digit : digitsToBeConverted) {
                hexadecimalNumber.append(hexadecimalNumbers[digit]);
            }

            System.out.println("O número decimal sorteado para conversão foi: " + randomDecimalNumber);
            System.out.println("Seu correspondente em base hexadecimal é: " + hexadecimalNumber);
        }
    }
}