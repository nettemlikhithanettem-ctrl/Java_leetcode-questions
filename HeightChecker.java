import java.util.Arrays;

public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int[] count = new int[101];

        for (int height : heights) {
            count[height]++;
        }

        int index = 0;
        int result = 0;

        for (int i = 0; i < heights.length; i++) {
            while (count[index] == 0) {
                index++;
            }

            if (heights[i] != index) {
                result++;
            }

            count[index]--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        System.out.println(Arrays.toString(heights));
        System.out.println(heightChecker(heights));
    }
}