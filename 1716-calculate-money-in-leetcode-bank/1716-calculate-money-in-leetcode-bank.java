class Solution 
{
    public int totalMoney(int n) 
    {
        int total = 0;
        int currentMoney = 1;
        int currentDay = 1; 

        for (int day = 1; day <= n; day++) 
        {
            total += currentMoney;
            currentMoney++;

            if (currentDay == 7) 
            {
                currentDay = 1;
                currentMoney = day / 7 + 1;
            } 
            else 
            {
                currentDay++;
            }
        }

        return total;
    }
}