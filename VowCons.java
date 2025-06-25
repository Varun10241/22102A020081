public class VowCons {
    public static void main(String[] args) {
        String s = "hello";
        int left = 0;
        int right = s.length() - 1;
        int vow = 0;
        int cons = 0;
        while (left < right) {
            if (s.charAt(left) == 'a' || s.charAt(left) == 'e' || s.charAt(left) == 'i' || s.charAt(left) == 'o'
                    || s.charAt(left) == 'u') {
                vow++;
            } else {
                cons++;
            }
            if (s.charAt(right) == 'a' || s.charAt(right) == 'e' || s.charAt(right) == 'i' || s.charAt(right) == 'o'
                    || s.charAt(right) == 'u') {
                vow++;
            } else {
                cons++;
            }
            left++;
            right--;
        }
        if (s.charAt(left) == 'a' || s.charAt(left) == 'e' || s.charAt(left) == 'i' || s.charAt(left) == 'o'
                || s.charAt(left) == 'u') {
            vow++;
        } else {
            cons++;
        }
        System.out.println("vowels: " + vow);
        System.out.println("consonents: " + cons);
    }
}
