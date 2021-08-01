import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        while (true) {
            System.out.print("n1 sayısını giriniz: ");
            n1 = input.nextInt();
            System.out.print("n2 sayısını giriniz: ");
            n2 = input.nextInt();
            if ( n1 < 0 || n2 < 0) {
                System.out.println("Lütfen pozitif sayı giriniz.");
            } else {
                break;
            }
        }

        if (n2 > n1) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        int ebob;
        int k = n1;
        while (k>=1) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                System.out.println("Ebob: " + ebob);
                break;
            }
            k--;
        }

        int i = n1*n2;
        int ekok=1;
        while(i > n2) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
            }
            i--;
        }
        System.out.println("Ekok: " + ekok);
    }
}
