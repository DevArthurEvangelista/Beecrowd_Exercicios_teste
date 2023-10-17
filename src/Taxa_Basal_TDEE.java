import java.util.Scanner;

public class Taxa_Basal_TDEE {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int altura,peso;
        short idade;
        String genero,atividadeF;
        double brm;
        double resultado;
        brm = 1;
        System.out.println("*******************");
        System.out.println(" CALCULADORA TDEE ");
        System.out.println("*******************");
        System.out.println();

        System.out.println("Digite seu genero, sendo M para masculino e F para feminino");
        genero = ler.nextLine();
        System.out.println("Qual sua altura em cm?");
        altura = ler.nextInt();
        System.out.println("Qual seu peso em kg?");
        peso = ler.nextInt();
        System.out.println("Qual sua idade?");
        idade = ler.nextShort();



        if (genero.equals("M")) {
           brm = (10 * peso) +  (6.25 * altura) - (5 * idade + 5) -1 ;
        }  else if (genero.equals("F")) {
            brm = (10 * peso) + (6.25 * altura) - (5 * idade - 161) -1;
        }

        System.out.println("Digite seu nível de atividade física");
        System.out.println();
        System.out.println("1- Pouco ou quase nenhum exercício físico");
        System.out.println("2- Exercicio leve, 1-3 dias por semana");
        System.out.println("3- Exercicio moderado, 3-5 dias por semana");
        System.out.println("4- Exercicio pesado, 6-7 dias por semana");
        System.out.println("5- Exercicio muito pesado, nível profissional");
        atividadeF = ler.next();

        System.out.println();


        switch (atividadeF){
            case "1" :
                resultado = (brm * 1.2);
                System.out.println("Sua taxa de metabolismo basal é:" + resultado);
                break;

            case "2" :
                resultado = (brm * 1.375);
                System.out.println("Sua taxa de metabolismo basal é: " + resultado);
                break;

            case "3" :
                resultado = (brm * 1.55);
                System.out.println("Sua taxa de metabolismo basal é:" + resultado);
                break;

            case "4" :
                resultado = brm * 1.725;
                System.out.println("Sua taxa de metabolismo basal é " + resultado);
                break;

            case "5" :
                resultado = brm * 1.9;
                System.out.println("Sua taxa de metabolismo basal é " + resultado);
                break;

        }


    }



}