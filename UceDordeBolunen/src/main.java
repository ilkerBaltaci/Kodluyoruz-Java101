import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int k;
        int sum=0, numOfNumbers=0;
        double ort;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        k = input.nextInt();

        for(int i = 1; i < k; i++) {
            if (i % 3 == 0) {
                sum += i;
                System.out.println(i);
                numOfNumbers++;
            } else if (i % 4 == 0) {
                sum += i;
                System.out.println(i);
                numOfNumbers++;
            } else {
                continue;
            }
        }
        ort = (double)sum / numOfNumbers;
        System.out.println("Ortalama: " + ort);
    }
}
