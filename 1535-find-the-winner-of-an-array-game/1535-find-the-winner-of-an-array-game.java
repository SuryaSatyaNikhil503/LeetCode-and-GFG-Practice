class Solution {
    public int getWinner(int[] arr, int k) {
        int n = arr.length;
        int currentWinner = arr[0];
        int currentCount = 0;

        for(int i = 1; i < n && currentCount < k; i++) {
            if(currentWinner > arr[i]) {
                currentCount++;
            } 
            else {
                currentWinner = arr[i];
                currentCount = 1;
            }
        }

        return currentWinner;
    }
}