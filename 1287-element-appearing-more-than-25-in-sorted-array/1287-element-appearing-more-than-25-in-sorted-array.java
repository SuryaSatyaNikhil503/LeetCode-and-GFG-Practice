class Solution {
    public int findSpecialInteger(int[] arr) {
        int threshold = arr.length / 4;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > threshold) {
                return num;
            }
        }
        return -1;
    }
}