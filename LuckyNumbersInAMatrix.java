import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int minCol = 0;

            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minCol = j;
                }
            }

            boolean lucky = true;

            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][minCol] > min) {
                    lucky = false;
                    break;
                }
            }

            if (lucky) result.add(min);
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {3, 7, 8},
            {9, 11, 13},
            {15, 16, 17}
        };

        System.out.println(luckyNumbers(matrix));
    }
}