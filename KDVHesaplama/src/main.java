import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tutar;
        double kdvliTutar;
        System.out.print("Tutarı giriniz: ");
        tutar = input.nextInt();

        if(tutar >= 1000){
            kdv8(tutar);
        } else{
            kdv18(tutar);
        }
    }
    public static void kdv18(int tutar){
        double kdvli = (tutar * 118) / 100.0;
        double kdv = kdvli - tutar;
        System.out.println("KDV'siz Fiyat = "+ tutar);
        System.out.println("KDV'li Fiyat = " + kdvli);
        System.out.println("KDV tutarı = " + kdv);
    }

    public static void kdv8(int tutar){
        double kdvli = (tutar * 108) / 100.0;
        double kdv = kdvli - tutar;
        System.out.println("KDV'siz Fiyat = "+ tutar);
        System.out.println("KDV'li Fiyat = " + kdvli);
        System.out.println("KDV tutarı = " + kdv);
    }

}
