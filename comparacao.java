import java.util.Scanner;

public class comparacao {
    public static void main(String[] args) {
        String a, b;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a ");
        a = leia.next();
        System.out.print("Digite b ");
        b = leia.next();
        System.out.println(a.compareTo(b) );
    }
}
