import java.util.Scanner;

public class main {
    static int asal(int a, int i){
        if(i == 1){
            return 1;
        }
        else{
            if(a%i == 0) {
                return 0;
            } else {
                return asal(a, i-1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, checker;
        System.out.print("Sayıyı giriniz: ");
        number = input.nextInt();

        checker = asal(number, number/2);

        if (checker == 1) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }
    }
}
