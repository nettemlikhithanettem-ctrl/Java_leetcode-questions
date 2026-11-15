public class FindTheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;

        for (int value : gain) {
            current += value;
            if (current > max) {
                max = current;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));
    }
}