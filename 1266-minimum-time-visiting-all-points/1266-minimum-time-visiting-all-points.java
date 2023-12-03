class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int t = 0;
        int hDist, vDist;
        
        for(int i=0, l=points.length; i<l-1; i++)
        {
            hDist = Math.abs(points[i][0]-points[i+1][0]);
            vDist = Math.abs(points[i][1]-points[i+1][1]);
            
            t += hDist + vDist - Math.min(hDist, vDist);
        }
        
        return t;
    }
}