import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 9};
        int[] c = {9, 9, 9};

        System.out.println(Arrays.toString(plusOne(a)));
        System.out.println(Arrays.toString(plusOne(b)));
        System.out.println(Arrays.toString(plusOne(c)));
    }
}