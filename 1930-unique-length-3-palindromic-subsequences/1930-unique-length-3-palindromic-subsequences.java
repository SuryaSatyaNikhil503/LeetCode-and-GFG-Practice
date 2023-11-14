class Solution {
    public int countPalindromicSubsequence(String s) 
    {
        boolean take [] = new boolean [26];
        int count=0;

        for(int i=0; i<s.length(); i++){
            if(!take[s.charAt(i)-'a']){
                take[s.charAt(i)-'a']= true;
                int index = s.lastIndexOf(s.charAt(i));
                if(index != i){
                   boolean visited [] = new boolean [26];
                  for(int j= i+1; j<index; j++)
                     if(!visited[s.charAt(j)-'a']){
                        visited[s.charAt(j)-'a']=true;
                        count+=1;
                     }
                }
            } 
        }

        return count;
        
    }
}