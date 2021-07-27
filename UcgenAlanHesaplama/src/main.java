import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        double u, alan;

        System.out.print("Üçgen 1. Kenar Uzunluğu: ");
        a = input.nextInt();

        System.out.print("Üçgen 2. Kenar Uzunluğu: ");
        b = input.nextInt();

        System.out.print("Üçgen 3. Kenar Uzunluğu: ");
        c = input.nextInt();

        u = (a + b + c) / 2.0;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin Alanı: " + alan);
    }
}
