class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer,Stack<Integer>> map = new HashMap<>();
        int counter=0;
        for(int i=0;i<nums.size();i++){
            for(int j=0;j<nums.get(i).size();j++){
                if(!map.containsKey(i+j)){
                    Stack<Integer> st = new Stack<>();
                    map.put(i+j,st);
                }
                map.get(i+j).push(nums.get(i).get(j));
                counter++;
            }

        }
        int[] ans = new int[counter];
        int index=0;
        for(int i=0;i<map.size();i++){
            Stack<Integer> st = map.get(i);
            while(!st.isEmpty())
            ans[index++]=st.pop();
        }
        return ans; 
    }
}