class Solution 
{
    public int[][] onesMinusZeros(int[][] mat) 
    {
        int n = mat.length,m=mat[0].length;
        int[] row = new int[n];  int[] col = new int[m];        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1) {
                    row[i]++;col[j]++;
                }
                else{
                     row[i]--;col[j]--;
                }    
            }
        }
        int[][] diff = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                diff[i][j]=row[i]+col[j];
            } 
        }
        return diff;
    }
}