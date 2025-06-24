
/*sum,mean,median,mode */
import java.util.*;

public class Arr1 {
    public static void fun(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum: " + sum);
        System.out.println("average: " + sum / arr.length);

    }

    public static void fun2(int[] arr) {
        int res;
        Arrays.sort(arr);
        if (arr.length % 2 != 0) {
            res = arr[arr.length / 2];
        } else {
            int a = arr[arr.length / 2];
            int b = arr[(arr.length / 2) - 1];
            res = (a + b) / 2;
        }
        System.out.println(res);

    }

    public static void fun3(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) > 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        fun(arr);
        fun2(arr);
        fun3(arr);
        sc.close();
    }
}
