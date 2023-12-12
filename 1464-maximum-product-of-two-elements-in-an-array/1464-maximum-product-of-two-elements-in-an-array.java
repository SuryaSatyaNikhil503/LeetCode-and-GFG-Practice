class Solution 
{
    public int maxProduct(int[] nums) 
    {
        int Large=Integer.MIN_VALUE;
      int secLarge=Integer.MIN_VALUE;
        
      for(int i:nums)
      {
          if(i>=Large)
          {
              secLarge=Large;
              Large=i;
          }
          if(i<Large && i>secLarge) secLarge=i;
      }  
        
        return (Large-1)*(secLarge-1);
    }
}