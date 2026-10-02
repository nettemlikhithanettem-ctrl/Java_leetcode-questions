public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10, 50};

        System.out.println("Duplicate elements:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    boolean printed = false;
                    for (int k = 0; k < i; k++) {
                        if (arr[k] == arr[i]) {
                            printed = true;
                            break;
                        }
                    }
                    if (!printed) {
                        System.out.println(arr[i]);
                    }
                    break;
                }
            }
        }
    }
}