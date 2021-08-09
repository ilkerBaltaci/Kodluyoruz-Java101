import java.util.Arrays;

public class Main {

    public static double harmonikOrt(int[] list){
        int size = list.length;
        double harmonikOrt = 0.0;
        for(int i : list) {
            harmonikOrt += 1.0/i ;
        }

        harmonikOrt = size / harmonikOrt;
        return harmonikOrt;

    }

    public static void main(String[] args) {
        int[] list = {4, 6};
        double harmonikOrt = harmonikOrt(list);

        System.out.println(Arrays.toString(list) + " listesinin harmonik ortalaması :");
        System.out.println(harmonikOrt);
    }
}
