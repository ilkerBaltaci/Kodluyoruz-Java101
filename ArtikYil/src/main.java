import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int year, count = 0;
        Scanner input = new Scanner(System.in);



        while(true){
            System.out.print("Yıl giriniz : ");
            year = input.nextInt();

            if ((year % 100 == 0) && (year % 400 != 0)){
                System.out.println(year + " bir artık yıl değildir !");
            } else if (year % 4 == 0) {
                System.out.println(year + " bir artık yıldır !");
            } else {
                System.out.println(year + " bir artık yıl değildir !");
            }

            if (count == 4){
                count = 0;
                break;
            }
            count++;
        }

    }
}
