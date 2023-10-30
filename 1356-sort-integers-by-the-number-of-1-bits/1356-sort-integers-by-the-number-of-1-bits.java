class Solution 
{
    public static int countSetBits(int num) 
    {
        int count = 0;
        while (num > 0) 
        {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }
    
    public int[] sortByBits(int[] arr) 
    {
        int[][] pairs = new int[arr.length][2];

        for (int i = 0; i < arr.length; i++) 
        {
            pairs[i][0] = arr[i];
            pairs[i][1] = countSetBits(arr[i]);
        }
        
        Arrays.sort(pairs, (a, b) -> {
            if (a[1] == b[1]) 
            {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });
        
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) 
        {
            sortedArr[i] = pairs[i][0];
        }

        return sortedArr;
    }
}