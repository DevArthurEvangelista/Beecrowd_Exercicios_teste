import java.util.Scanner;

public class Calculo_salario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salarioMinimo,salarioUsuario;
        double calculo;


        System.out.println("Qual é o seu salário mínimo atual?");
        salarioMinimo = ler.nextDouble();

        System.out.println("Qual é o salário que você recebe?");
        salarioUsuario = ler.nextDouble();

        calculo = salarioUsuario/salarioMinimo;

        if (calculo > 1) {
            System.out.println("Seu salário é " +calculo +" vezes o salário mínimo");
        } else{
            System.out.println("Seu salário é " + calculo + " menor que o salário mínimo");
        }
        ler.close();
    }
}
