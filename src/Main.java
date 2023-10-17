import java.util.Scanner;

public class Main{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

      int valor = sc.nextInt();

      int nota100 = valor/100;

      int sobrante = valor-(nota100 * 100);
      int modulo = sobrante % 100;

      int nota50 = 0;
      int nota20 = 0;
      int nota10 = 0;
      int nota5 =0;
      int nota2 = 0;
      int nota1 = 0;



      if (sobrante >=50 && sobrante <100 ){
          nota50 = 1;
        }
      if (sobrante >= 20 && sobrante <= 30 || sobrante>=70 && sobrante <80){
          nota20 = 1;
      } else if (sobrante >=40 && sobrante <50 || sobrante >=90 && sobrante <100){
          nota20 = 2;

      } if (sobrante >=10 &&  sobrante <20 || sobrante >= 30 && sobrante <40 || sobrante >=60 && sobrante <70 || sobrante >=80 && sobrante <90) {
            nota10 = 1;

        } while (sobrante >5){
          nota5 = sobrante-10;
          if (nota5>)
        }

        System.out.println(nota100 + " nota(s) R$ 100,00");
        System.out.println(nota50 + " nota(s) R$ 50,00");
        System.out.println(nota20 + " nota(s) R$ 20,00");
        System.out.println(nota10 + " nota(s) R$ 10,00");



    }
}