
/*return duplicates */
import java.util.*;

public class Arr4 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4, 5, 1, 5 };
        ArrayList<Integer> l = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) > 1) {
                l.add(i);
            }
        }
        System.out.println(l);
    }
}
