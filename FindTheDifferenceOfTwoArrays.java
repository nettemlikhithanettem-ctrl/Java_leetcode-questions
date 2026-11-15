import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int num : set1) {
            if (!set2.contains(num)) {
                a.add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                b.add(num);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(a);
        result.add(b);
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {2, 4, 6};
        System.out.println(findDifference(a, b));
    }
}