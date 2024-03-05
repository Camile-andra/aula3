import java.util.Scanner;

public class distancia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o primeiro ponto: ");
        double n1 = s.nextDouble();
        System.out.print("Digite o segundo ponto: ");
        double n2 = s.nextDouble();
        double conta = n1 - n2;

        System.out.println(conta);
    }
}
