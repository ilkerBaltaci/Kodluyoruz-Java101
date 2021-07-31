import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r,kombust=1, kombalt=1;

        System.out.println("Kombinasyon: C(n,r)");
        System.out.print("n: ");
        n = input.nextInt();
        System.out.print("r: ");
        r = input.nextInt();

        for(int i = n; i > n-r; i--) {
            kombust *= i;
        }
        for(int i = 1; i <= r; i++) {
            kombalt *= i;
        }
        System.out.println(kombust/kombalt);
    }
}
