import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 0;

        do{
            System.out.print("Sayı Giriniz: ");
            number = input.nextInt();

            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }
        }while(number % 2 != 1);

        System.out.println("Toplam: " + sum);

    }
}
