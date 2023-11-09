class Solution 
{
    final int mod = (int) 1e9+7;
    public int countHomogenous(String s) 
    {
        int n = s.length();
        long result = 0;
        int count = 1;
        
        for (int i = 1; i < n; i++) 
        {
            if (s.charAt(i) == s.charAt(i - 1)) 
            {
                count++;
            } 
            else 
            {
                result = (result + (long) count * (count + 1) / 2) % mod;
                count = 1;
            }
        }
        
        result = (result + (long) count * (count + 1) / 2) % mod;

        return (int) result;
    }
}