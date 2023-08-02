import java.util.Scanner;

public class Ordena02 {
    public static void main (String args[]){
        try (Scanner entrada = new Scanner(System.in)) {
            String nome [] = new String[5], Aux;
            int cont, i, j;
            for (cont=0;cont<nome.length;cont++)
            { System.out.print("Digite o " + (cont+1) + "o nome: ");
            nome[cont] = entrada.next();
   }
   System.out.println("Estes foram os nomes digitados: ");
   for (cont=0;cont<nome.length;cont++)
            System.out.println("Posição " + (cont) + " nome: " + nome[cont]);
   for (i=0;i<nome.length;j++) 
            for (j=i+1;j<nome.length;j++) {
                if (nome[i].compareToIgnoreCase(nome[j]) > 0) {
                    Aux = nome[i];
                    nome[i]=nome[j];
                    nome[j]=Aux;
                }
            }
            System.out.println("Estes foram os números digitados e ordenados: ");
            for (cont=0;cont<nome.length;cont++)
                System.out.println("Posição " + (cont) + " numero: " + nome[cont]);
        }
    }
}