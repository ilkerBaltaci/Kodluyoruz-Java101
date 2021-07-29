import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double tutar;

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Mesafeyi km cinsinden giriniz : ");
            mesafe = input.nextInt();

            System.out.print("Yaşınızı giriniz : ");
            yas = input.nextInt();

            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
            yolculukTipi = input.nextInt();

            if((mesafe <= 0) || (yas <= 0) || ((yolculukTipi != 1) && (yolculukTipi != 2))){
                System.out.println("Hatalı Veri Girdiniz !");
            } else{
                break;
            }
        }

        if (yas < 12){
            tutar = (mesafe * 0.1) * 0.5;
        }
        else if (yas >= 12 && yas <= 24){
            tutar = (mesafe * 0.1) * 0.9;
        }
        else if (yas > 65){
            tutar = (mesafe * 0.1) * 0.7;
        } else {
            tutar = mesafe * 0.1;
        }

        if (yolculukTipi == 2){
            tutar = (tutar * 0.8) * 2;
        }

        System.out.println("Toplam Tutar = " + tutar);


    }
}
