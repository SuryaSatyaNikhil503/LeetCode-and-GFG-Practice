class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> charToIndex = new HashMap<>();
    for (int i = 0; i < order.length(); i++) {
        charToIndex.put(order.charAt(i), i);
    }

    Character[] arr = s.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
    Arrays.sort(arr, (a, b) -> 
        charToIndex.getOrDefault(a, 26) - charToIndex.getOrDefault(b, 26));
    
    return Arrays.stream(arr).map(String::valueOf).collect(Collectors.joining());
    }
}