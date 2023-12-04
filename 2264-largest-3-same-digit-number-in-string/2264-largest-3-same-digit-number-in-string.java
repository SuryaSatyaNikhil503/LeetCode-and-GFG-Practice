class Solution 
{
    public String largestGoodInteger(String num) 
    {
        String maxSoFar = "";
    for (int i = 0; i < num.length() - 2; i++) {
      String current = num.substring(i, i + 3);
      if (current.chars().distinct().count() == 1 && current.compareTo(maxSoFar) > 0) {
        maxSoFar = current;
      }
    }
    return maxSoFar;
    }
}