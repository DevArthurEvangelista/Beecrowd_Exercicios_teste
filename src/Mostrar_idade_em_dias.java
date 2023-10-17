import java.util.Scanner;

public class Mostrar_idade_em_dias {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int ano_nascimento,mes_nascimento,dia_nascimento;
        int ano_atual = 2023;

        System.out.println("Qual seu ano de nascimento?");
         ano_nascimento = ler.nextInt();
        System.out.println("Qual mês você nasceu?");
         mes_nascimento = ler.nextInt();
        System.out.println("Em qual dia você nasceu?");
         dia_nascimento = ler.nextInt();

        int idade = (ano_atual-ano_nascimento);
        int resultado = (idade * 365) + (mes_nascimento * 30) +(dia_nascimento);
        System.out.println("Você já viveu: " + resultado + " dias nessa terra");

    }
}
