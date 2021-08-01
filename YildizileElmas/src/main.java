import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number, number2;
        System.out.print("Basamak Sayısını giriniz: ");
        number2 = input.nextInt();

        number = Math.round(number2/2);
        number2 = Math.floor(number2/2);

        for(int i = 1; i <= number; i++) {

            for(int j=0; j < (number-i); j++) {
                System.out.print(" ");
            }
            for (int k = (2*i-1) ; k > 0; k--){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i = (int)number2; i >= 0; i--) {

            for(int j=-1; j < (number2-i); j++) {
                System.out.print(" ");
            }
            for (int k = (2*i-1) ; k > 0; k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
