import java.util.Scanner;

public class celciusToF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o celsius: ");
        double celsius = s.nextDouble();
        double farem = ((celsius*9)/5)+32; 
        System.out.format("a temperatura %.1f °c em °f é %.1f", celsius, farem);
    }
}
