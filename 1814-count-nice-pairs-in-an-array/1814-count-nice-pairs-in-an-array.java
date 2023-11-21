class Solution {
    public int countNicePairs(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int i :nums){
            int diff = i - rev(i);
            map.put(diff,map.getOrDefault(diff,0)+1);
        }
        int result=0;
        for(int i:map.values()){
            if(i>1){
                result += ((long)i*(i-1)/2) %1000000007;
            }
        }
        return result%1000000007;
        
    }

    public int rev(int a){
        StringBuilder str = new StringBuilder(a+"");
        return Integer.parseInt(str.reverse().toString());
    }
}