import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, toplam=1;

        System.out.print("Üssü alınacak sayı: ");
        num1 = input.nextInt();
        System.out.print("Üs olacak sayı: ");
        num2 = input.nextInt();

        for (int i=1; i <= num2; i++) {
            toplam *= num1;
        }

        System.out.println(toplam);
    }
}
