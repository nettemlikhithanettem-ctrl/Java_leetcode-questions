import java.util.HashMap;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                pairs += map.get(num);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return pairs;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums));
    }
}