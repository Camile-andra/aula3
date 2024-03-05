import java.util.Scanner;

public class antesEdps {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = s.nextInt();
        int antes = numero - 1;
        int depois = numero + 1;

        System.out.println("o antecessosr e sucessor sao respectivamente " + antes + " " + depois);
    }
}
