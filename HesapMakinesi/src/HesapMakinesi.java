import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi1, sayi2, select;
        System.out.print("İlk Sayıyı Giriniz: ");
        sayi1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        sayi2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam : " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Çarpma : " + (sayi1 * sayi2));
                break;
            case 4:
                if(sayi2 != 0){
                    System.out.println("Bölme : " + ((double)sayi1 / sayi2));
                } else{
                    System.out.println("Bir sayı 0'a bölünemez !");
                }

                break;
            default:
                System.out.println("Düzgün bir seçim yapınız!!!");
        }
    }
}
