import java.util.Scanner;

public class Le_algoritmo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int ipi,cod1,val1,qtd1;
        int cod2, val2,qtd2;
        double formula;

        System.out.println("Digite a porcentagem(sem %) do IPI a ser acrescido");
        ipi = ler.nextInt();
        System.out.println("Qual é o código da peça 1?");
        cod1 = ler.nextInt();
        System.out.println("Qual é o valor da peça 1?");
        val1 = ler.nextInt();
        System.out.println("Qual a quantidade de peças 1?");
        qtd1 = ler.nextInt();

        System.out.println("Agora vamos para a 2 peça a ser calculada");
        System.out.println("Qual é o código da peça 2?");
        cod2 = ler.nextInt();
        System.out.println("Qual é o valor da peça 2?");
        val2 = ler.nextInt();
        System.out.println("Qual é a quantidade da peça 3?");
        qtd2 = ler.nextInt();

        formula = (val1*qtd1 + val2*qtd2)*(ipi/100+1);

        System.out.println("O valor total a ser pago é de: " + formula);



    }
}
