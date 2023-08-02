import java.util.Scanner;

public class Ordena01 {
        public static void main(String args[]) {
            Scanner entrada = new Scanner(System.in);
            int num [] = new int[5];
            int cont, i, j, Aux;
            for (cont=0;cont<num.length;cont++)
            { System.out.print("Digite o " + (cont+1) + "o numero: ");
              num[cont] = entrada.nextInt();
        }
        System.out.println("Estes foram os números digitados: ");
        for (cont=0;cont<num.length;cont++)
            System.out.println("Posição " + (cont) + " numero: " + num[cont]);
        for (i=0;i<(num.length-1);i++)
            for (j=i+1;j<num.length;j++) {
                if (num[i] > num[j]) {
                    Aux = num[i];
                    num [i]=num[j];
                    num [j]=Aux;
                }
            }
            System.out.println("Estes foram os números digitados e ordenados: ");
            for (cont=0;cont<num.length;cont++)
                System.out.println("Posição " + (cont) + " numero: " + num[cont]);
        }
    }
                  