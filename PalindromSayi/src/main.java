import java.util.Scanner;

public class main {

    static boolean isPalindrom(int number) {
        int temp, reverseNumber=0, digit=0;
        temp = number;
        while (temp > 0) {
            digit = temp % 10;
            reverseNumber = reverseNumber * 10 + digit;
            temp = temp/10;
        }
        if ( reverseNumber == number ){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deneme = 3, sayi;
        while(deneme > 0){
            System.out.print("Sayı giriniz: ");
            sayi =  input.nextInt();
            if (isPalindrom(sayi)) {
                System.out.println(sayi + " palindrom sayıdır.");
            } else {
                System.out.println(sayi + " palindrom sayı değildir.");
            }
            deneme--;
        }

    }
}
