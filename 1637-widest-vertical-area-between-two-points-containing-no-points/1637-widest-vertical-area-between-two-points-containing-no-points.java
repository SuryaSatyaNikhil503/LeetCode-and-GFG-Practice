class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xValues = new int[points.length];

        for(int i=0;i<points.length;i++){

            xValues[i]=points[i][0];

        }

        Arrays.sort(xValues);

        int widestArea = 0;

        for(int i=0;i<xValues.length-1;i++){
            widestArea = Math.max(widestArea, xValues[i+1]-xValues[i]);
        }

        return widestArea;
    }
}