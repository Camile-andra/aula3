import java.util.Scanner;

public class distancia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite o x do primeiro ponto: ");
        double x1 = s.nextDouble();
        System.out.print("Digite o y do segundo ponto: ");
        double y1 = s.nextDouble();

        System.out.print("Digite o x do primeiro ponto: ");
        double x2 = s.nextDouble();
        System.out.print("Digite o y do segundo ponto: ");
        double y2 = s.nextDouble();
        
        double conta = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(conta);
    }
}
