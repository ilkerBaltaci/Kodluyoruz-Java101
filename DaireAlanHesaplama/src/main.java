import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double yarıcap, merkezacı;
        double pi = 3.14;
        double alan;

        System.out.print("Yarıçapı giriniz: ");
        yarıcap = input.nextInt();

        System.out.print("Merkez açıyı giriniz: ");
        merkezacı = input.nextInt();

        alan = (pi * (yarıcap * yarıcap) * merkezacı) / 360;

        System.out.println("Daire diliminin alanı: " + alan);

    }
}
