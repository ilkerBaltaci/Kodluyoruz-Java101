public class main {
    static int usAlma(int a, int b){
        if(b == 1) {
            return a;
        }
        if (b == 0) {
            return 1;
        }

        return usAlma(a,b-1) * a;
    }
    public static void main(String[] args) {
        System.out.println(usAlma(6,2));
    }
}
