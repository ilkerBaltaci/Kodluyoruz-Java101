import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık giriniz : ");
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        if(heat >= 5 && heat <= 15){
            System.out.println("Sinemaya gidebilirsin.");
        }
        if(heat >= 15 && heat <= 25){
            System.out.println("Pikniğe gidebilirsin.");
        }
        if(heat >= 25){
            System.out.println("Yüzmeye gidebilirsin.");
        }

    }
}
