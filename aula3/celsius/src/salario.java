import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o salario: ");
        double salario = s.nextDouble();
        double salarioMinimo = 1302;
        double conta = salario/salarioMinimo;
        double novoSalario = (salario*0.1)+salario;
        System.out.print("A quantidade de salario minimo que fulaninho recebe é "+conta);
        System.out.println(" , e com um almento de 10% fica "+novoSalario);
    }

}
