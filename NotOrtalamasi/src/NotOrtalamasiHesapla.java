import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class NotOrtalamasiHesapla {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;

        boolean checker = (ortalama >= 60) && sinifiGecti();
        checker = !(ortalama >= 60) && siniftaKaldi();
    }

    public static boolean sinifiGecti() {
        System.out.println("Sınıfı Geçti");
        return true;
    }

    public static boolean siniftaKaldi() {
        System.out.println("Sınıfta Kaldı");
        return true;
    }
}
