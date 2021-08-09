import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println("Dizi : " + Arrays.toString(dizi));
        int sayi;
        int lessClose=0, greaterClose=0 , lessDiff = Integer.MAX_VALUE, greaterDiff = Integer.MAX_VALUE;
        Scanner input = new Scanner(System.in);
        System.out.print("Girilen Sayı : ");
        sayi = input.nextInt();
        for (int i = 0; i < dizi.length; i++) {
            if ( (sayi < dizi[i]) && (greaterDiff > (dizi[i] - sayi)) ) {
                greaterClose = dizi[i];
                greaterDiff = dizi[i] - sayi;
            }

            if ( (sayi > dizi[i]) && (lessDiff > (sayi - dizi[i]) )) {
                lessClose = dizi[i];
                lessDiff = sayi - dizi[i];
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + lessClose);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + greaterClose);


    }
}
