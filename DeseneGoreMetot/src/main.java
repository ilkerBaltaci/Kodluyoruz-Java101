import java.util.Scanner;

public class main {
    static int globalInput=0;
    static boolean stateChecker = false;

    static int desen(int input) {

        if(globalInput < input) {
            globalInput = input;
        }

        if(input <= 0) {
            stateChecker = true;
        }
        System.out.print(input + " ");
        if(stateChecker){
            if (globalInput == input) {
                stateChecker = false;
                return 0;
            }
            return desen(input + 5);

        } else {
            return desen(input - 5 );
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.print("N sayısı: ");
        sayi = input.nextInt();
        System.out.print("Çıktısı: ");
        desen(sayi);
    }
}
