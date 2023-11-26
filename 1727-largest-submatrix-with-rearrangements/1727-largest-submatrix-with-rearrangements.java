class Solution 
{
    public int largestSubmatrix(int[][] matrix) 
    {
        int m = matrix.length;
        int n = matrix[0].length;

        // Convert the matrix to heights of consecutive 1's ending at each row
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] += matrix[i - 1][j];
                }
            }
        }

        // Sort each row in non-decreasing order
        for (int i = 0; i < m; i++) {
            Arrays.sort(matrix[i]);
        }

        // Calculate the area of the largest submatrix
        int maxArea = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int width = n - j;
                int height = matrix[i][j];
                maxArea = Math.max(maxArea, width * height);
            }
        }

        return maxArea;
    }
}