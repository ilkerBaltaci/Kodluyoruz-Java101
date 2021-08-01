import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int basamakSayisi;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısını giriniz: ");
        basamakSayisi = input.nextInt();
        int tempBasamak = basamakSayisi;
        for (int i = 1; i <= basamakSayisi; i++) {
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int k = (2*tempBasamak-1); k > 0; k--) {
                System.out.print("*");
            }
            System.out.println("");
            tempBasamak--;
        }

    }
}
