import java.util.Locale;
import java.util.Scanner;

public class Udemy_Teste1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code =5290;
        char gender = 'F';

        double price1 = 2100;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("Computer,wich price is $ %.2f%n",price1);
        System.out.printf("Office desk, wich price is $ %.2f%n",price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %s%n",age,code,gender);
        System.out.println();
        System.out.printf("Measue with eight decimal places: %.8f%n",measure);
        System.out.printf("Rouded (three decimal places): %.3f%n",measure);
        System.out.printf("Us decimal point: %.3f%n",measure);
        Locale.setDefault(Locale.US);

    }
}
