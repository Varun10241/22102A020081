/*array is sorted or not */
public class Arr3 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        boolean res = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                res = false;
                break;
            }
        }
        System.out.println(res);
    }
}
