class Solution {

    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int r = 0; r < 4; r++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
        int[][] rotated = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                
                rotated[j][n - 1 - i] = mat[i][j];
                
            }
        }
        mat = rotated;
        }
        if(Arrays.deepEquals(mat, target)){
            return true;
        }
        return false;
    }
}