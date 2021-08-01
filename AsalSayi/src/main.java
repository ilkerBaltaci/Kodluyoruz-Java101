public class main {
    public static void main(String[] args) {
        System.out.println("1-100 Arasındaki Asal Sayilari Bulan Program");
        boolean checker = true;
        for (int i = 1; i <= 100; i++) {
            for (int j = 2; j<i; j++) {
                if (i % j == 0) {
                    checker = true;
                    break;
                }
            }
            if(checker == true) {
                checker = false;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
