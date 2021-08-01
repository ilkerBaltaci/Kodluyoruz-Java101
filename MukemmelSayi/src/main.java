import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner input  = new Scanner(System.in);
        int a = 0;
        while (a < 3){
            int number, toplam=0;
            System.out.print("Bir sayı giriniz: ");
            number = input.nextInt();

            for (int i = 1; i <= number/2; i++) {
                if (number % i == 0) {
                    toplam += i;
                }
            }

            if (toplam == number) {
                System.out.println(number+" Mükemmel sayıdır");
            } else {
                System.out.println(number+ " Mükemmel sayı değildir");
            }
            a++;
        }


    }
}
