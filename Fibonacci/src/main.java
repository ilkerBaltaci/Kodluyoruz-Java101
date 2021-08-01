import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int elemanlar;
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        elemanlar = input.nextInt();
        int number = 1;
        int temp=0,temp2;
        System.out.print(0 + " ");
        for(int i =0; i < elemanlar; i++){
            System.out.print(number + " ");
            temp2 = number;
            number += temp;
            temp = temp2;
        }
    }
}
