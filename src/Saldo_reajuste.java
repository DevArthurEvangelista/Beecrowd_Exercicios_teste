import java.util.Scanner;

public class Saldo_reajuste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double salario;
        double resultado,calculo;

        System.out.println("Qual o seu salário em reais?");
        salario = ler.nextDouble();
        System.out.println("Vamos reajustar seu salário em 1%");
        resultado = salario +(salario/100);
        System.out.println("Seu novo salário é de: " + resultado);

    }
}
