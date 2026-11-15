import java.util.HashSet;
import java.util.Set;

public class CanMakeArithmeticProgressionFromSequence {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            set.add(num);
        }

        if ((max - min) % (n - 1) != 0) return false;

        int diff = (max - min) / (n - 1);

        if (diff == 0) return true;

        int current = min;

        for (int i = 0; i < n; i++) {
            if (!set.contains(current)) return false;
            current += diff;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1};
        System.out.println(canMakeArithmeticProgression(arr));
    }
}