
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> ls = new ArrayList<>();

        for (int i = 0; i < m; i++) {

            // Find minimum in current row
            int min = Integer.MAX_VALUE;
            int colIdx = -1;

            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    colIdx = j;
                }
            }

            // Find maximum in that column
            int max = Integer.MIN_VALUE;

            for (int k = 0; k < m; k++) {
                if (matrix[k][colIdx] > max) {
                    max = matrix[k][colIdx];
                }
            }

            // Check lucky number
            if (min == max) {
                ls.add(min);
            }
        }

        return ls;
    }
}
