import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int month, day;
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Ay değeri giriniz: ");
            month = input.nextInt();

            System.out.print("Gün değeri giriniz: ");
            day = input.nextInt();

            if((month<=0 || month>= 12) || (day<=0 || day >= 31)){
                System.out.println("Lütfen geçerli değerler giriniz");
            } else {
                break;
            }
        }

        if (month == 1) {
            if (day <= 21){
                System.out.println("Burç: Oğlak");
            } else {
                System.out.println("Burç: Kova");
            }
        } else if (month == 2) {
            if (day <= 19){
                System.out.println("Burç: Kova");
            } else {
                System.out.println("Burç: Balık");
            }
        } else if (month == 3) {
            if (day <= 20){
                System.out.println("Burç: Balık");
            } else {
                System.out.println("Burç: Koç");
            }
        } else if (month == 4) {
            if (day <= 20){
                System.out.println("Burç: Koç");
            } else {
                System.out.println("Burç: Boğa");
            }
        } else if (month == 5) {
            if (day <= 21){
                System.out.println("Burç: Boğa");
            } else {
                System.out.println("Burç: İkizler");
            }
        } else if (month == 6) {
            if (day <= 22){
                System.out.println("Burç: İkizler");
            } else {
                System.out.println("Burç: Yengeç");
            }
        } else if (month == 7) {
            if (day <= 22){
                System.out.println("Burç: Yengeç");
            } else {
                System.out.println("Burç: Aslan");
            }
        } else if (month == 8) {
            if (day <= 22){
                System.out.println("Burç: Aslan");
            } else {
                System.out.println("Burç: Başak");
            }
        } else if (month == 9) {
            if (day <= 22){
                System.out.println("Burç: Başak");
            } else {
                System.out.println("Burç: Terazi");
            }
        } else if (month == 10) {
            if (day <= 22){
                System.out.println("Burç: Terazi");
            } else {
                System.out.println("Burç: Akrep");
            }
        } else if (month == 11) {
            if (day <= 21){
                System.out.println("Burç: Akrep");
            } else {
                System.out.println("Burç: Yay");
            }
        } else if (month == 12) {
            if (day <= 21){
                System.out.println("Burç: Yay");
            } else {
                System.out.println("Burç: Oğlak");
            }
        }



    }
}
