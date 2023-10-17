import java.util.Scanner;

public class Soma_de_Medias {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a,b,c,d,e,f;
        double media_A,media_B,mediaDasDuas,mediadasMedias;
        a = 8;
        b = 9;
        c = 7;

        d = 4;
        e = 5;
        f = 6;
        media_A = (8 + 9 + 7)/3;
        media_B = (4+5+6)/3;
        System.out.println("A média aritmética de 8,9,7 é igual a: " + media_A);
        System.out.println("A média aritmética de 4,5,6 é igual a: " + media_B);
        mediaDasDuas = (media_A + media_B)/2;
        System.out.println("A média da soma das duas é de: " + mediaDasDuas);
        mediadasMedias =(8+9+7+4+5+6)/6;
        System.out.println("A média das médias é de: " + mediadasMedias);
    }
}
