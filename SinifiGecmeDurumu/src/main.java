import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, numOfLectures = 5;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        if(mat < 0 || mat > 100){
            mat = 0;
            numOfLectures--;
        }
        if(turkce < 0 || turkce > 100){
            turkce = 0;
            numOfLectures--;
        }
        if(fizik < 0 || fizik > 100){
            fizik = 0;
            numOfLectures--;
        }
        if(kimya < 0 || kimya > 100){
            kimya = 0;
            numOfLectures--;
        }
        if(muzik < 0 || muzik > 100){
            muzik = 0;
            numOfLectures--;
        }
        if(numOfLectures == 0){
            System.out.println("Ders notlarınıza 0-100 arasında değerler giriniz!");
        } else {
            double average = (mat + fizik + turkce + kimya + muzik) / numOfLectures;
            if (average < 55){
                System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
                System.out.println("Ortalamanız: " + average);
            } else {
                System.out.println("Tebrikler, sınıfı geçtiniz !");
                System.out.println("Ortalamanız: " + average);
            }
        }



    }
}
