
class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

        int[][] result = new int[rows * cols][2];

        int r = rStart;
        int c = cStart;

        int count = 0;
        int steps = 1;
        int dir = 0;
        int turns = 0;

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        // Store starting position
        result[count][0] = r;
        result[count][1] = c;
        count++;

        while (count < rows * cols) {

            for (int i = 0; i < steps; i++) {

                r += dr[dir];
                c += dc[dir];

                // Check whether position is inside grid
                if (r >= 0 && r < rows &&
                    c >= 0 && c < cols) {

                    result[count][0] = r;
                    result[count][1] = c;
                    count++;
                }
            }

            // Change direction clockwise
            dir = (dir + 1) % 4;

            turns++;

            // Increase steps after every two turns
            if (turns == 2) {
                steps++;
                turns = 0;
            }
        }

        return result;
    }
}
