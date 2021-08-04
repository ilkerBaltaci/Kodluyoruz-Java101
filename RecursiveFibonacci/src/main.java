import java.util.Scanner;

public class main {
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, temp = 1;
        System.out.print("Adım Sayısını giriniz: ");
        sayi = input.nextInt();
        while(temp <= sayi) {
            System.out.print(fib(temp) + " ");
            temp++;
        }
    }
}
