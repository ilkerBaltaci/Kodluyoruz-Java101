import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Sınır sayısını giriniz: ");
        number = input.nextInt();

        for(int i=1; i<number; i *= 4) {
            System.out.println(i);
        }

        for(int i=1; i<number; i *= 5) {
            System.out.println(i);
        }
    }
}
