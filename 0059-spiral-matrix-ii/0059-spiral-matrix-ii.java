class Solution {
    public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int num = 1;

        while (top <= bottom && left <= right) {

            // 1. Left to Right
            for(int col=left; col<=right; col++){
                matrix[top][col] = num;
                  num++;
            }
            top++;

            // 2. Top to Bottom
            for(int row=top; row<=bottom; row++){
                matrix[row][right] = num;
                  num++;
            }
            right--;

            // 3. Right to Left
            for(int col=right; col>=left; col--){
                if(top <= bottom){
                    matrix[bottom][col] = num;
                    num++;
                }
            }
            bottom--;

            // 4. Bottom to Top
            for(int row=bottom; row>=top; row--){
                if(left <= right){
                    matrix[row][left] = num;
                    num++;
                }
            }
            left++;

        }

        return matrix;
    }
}