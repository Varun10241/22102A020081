
/*return all except target */
import java.util.*;

public class Arr5 {
    public static ArrayList<Integer> fun(int[] arr, int tar) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != tar) {
                l.add(arr[i]);
            }
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        System.out.println(fun(arr, tar));
        sc.close();
    }
}
