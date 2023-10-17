import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        int nota100 =0;

        while (valor >100){
            nota100 = + 100;
            if(nota100>valor){
                nota100 = nota100-100;
            }

        }
        System.out.println(nota100);
    }
}