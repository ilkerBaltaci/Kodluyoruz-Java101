import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double toplamTutar = 0;

        double armutTutar = 2.14;
        double elmaTutar = 3.67;
        double domatesTutar = 1.11;
        double muzTutar = 0.95;
        double patlicanTutar = 5;

        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;

        System.out.print("Armut Kaç Kilo ? :");
        armutKilo = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        elmaKilo = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        domatesKilo = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        muzKilo = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicanKilo = input.nextDouble();

        toplamTutar = (armutTutar*armutKilo) + (elmaKilo*elmaTutar) + (domatesKilo*domatesTutar) +
                (muzKilo*muzTutar) + (patlicanKilo*patlicanTutar);
        System.out.println("Toplam Tutar : " + toplamTutar);
    }
}
