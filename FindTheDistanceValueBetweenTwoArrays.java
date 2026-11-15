import java.util.Arrays;

public class FindTheDistanceValueBetweenTwoArrays {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;

        for (int value : arr1) {
            if (isValid(arr2, value, d)) count++;
        }

        return count;
    }

    public static boolean isValid(int[] arr, int value, int d) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (Math.abs(arr[mid] - value) <= d) return false;

            if (arr[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 8};
        int[] arr2 = {10, 9, 1, 8};
        System.out.println(findTheDistanceValue(arr1, arr2, 2));
    }
}