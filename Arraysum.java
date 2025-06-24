import java.util.*;

public class Arraysum {
    public static int[] reverse(int[] a) {
        int[] n = new int[a.length];
        int index = -1;
        for (int i = a.length - 1; i >= 0; i--) {
            n[++index] = a[i];
        }
        return n;
    }

    public static int min(int[] a) {
        int m = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[m]) {
                m = i;
            }
        }
        return a[m];
    }

    public static int max(int[] a) {
        int m = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[m]) {
                m = i;
            }
        }
        return a[m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(c[i] + " ");
        }
        int[] revres = reverse(a);
        System.out.println(Arrays.toString(revres));
        System.out.println(min(a));
        System.out.println(max(a));
        sc.close();
    }

}
