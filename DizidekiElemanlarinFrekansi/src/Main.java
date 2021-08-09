import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        HashMap<Integer, Integer> duplicates = new HashMap<Integer, Integer>();
        for (int i = 0; i < dizi.length; i++) {
            if(duplicates.containsKey(dizi[i])) {
                duplicates.put(dizi[i], duplicates.get(dizi[i]) + 1);
            } else {
                duplicates.put(dizi[i], 1);
            }
        }
        System.out.println("Tekrar Sayıları");
        for (int i : duplicates.keySet()) {
            System.out.println(i + " sayısı " + duplicates.get(i) + " kere tekrar edildi.");
        }
    }
}

