import java.util.Scanner;

public class Main2{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        double area,n,raio;

        n = 3.14159;
        raio = ler.nextDouble();

        area = n * raio * raio;

        System.out.printf("A=%.4f%n",area);

        ler.close();
    }
}