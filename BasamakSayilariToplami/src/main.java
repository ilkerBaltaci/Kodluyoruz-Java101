import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int number = input.nextInt();

        int temp1, toplam=0;

        while(number != 0) {
            temp1 = number % 10;
            toplam += temp1;
            number = number / 10;
        }

        System.out.println(toplam);
    }
}
