import java.util.*;

public class MaxArraySum {
    public static int findMax(int[] arr, int k) {
        int ws = 0;
        int maxsum = 0;
        for (int i = 0; i < k; i++) {
            ws = ws + arr[i];
        }
        maxsum = ws;
        for (int i = k; i < arr.length; i++) {
            ws = ws + arr[i] - arr[i - k];
            maxsum = Math.max(ws, maxsum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int maxsum = findMax(arr, k);
        System.out.println(maxsum);
        sc.close();
    }
}
