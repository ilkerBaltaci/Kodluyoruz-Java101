import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yolUzunlugu;
        double ucret;

        System.out.print("Gidilecek yol uzunluğunu girin: ");
        yolUzunlugu = input.nextInt();

        ucret = 10 + (2.2 * yolUzunlugu);

        ucret = (ucret < 20) ? 20 : ucret;

        System.out.println("Toplam Tutar: " + ucret);

    }
}
