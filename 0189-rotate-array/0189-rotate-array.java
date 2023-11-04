class Solution 
{
    static void reverse(int arr[], int start, int end) 
    {
        while (start <= end) 
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) 
    {
        int n = nums.length;
        if(n==0) return;
        k = k % n;
        if(k==0) return;
        
        reverse(nums , 0 , n-1);
        reverse(nums , 0 , k-1);
        reverse(nums , k , n-1);
    }
}