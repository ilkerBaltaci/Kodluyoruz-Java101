import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        int biggestNumber = Integer.MIN_VALUE;
        int lowestNumber = Integer.MAX_VALUE;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int option = input.nextInt();

        for (int i=1; i <= option; i++) {
            System.out.print(i+". Sayıyı giriniz: ");
            number = input.nextInt();
            if (biggestNumber < number) {
                biggestNumber = number;
            }
            if (lowestNumber > number) {
                lowestNumber = number;
            }
        }

        System.out.println("En büyük sayı: " + biggestNumber);
        System.out.println("En küçük sayı: " + lowestNumber);
    }
}
