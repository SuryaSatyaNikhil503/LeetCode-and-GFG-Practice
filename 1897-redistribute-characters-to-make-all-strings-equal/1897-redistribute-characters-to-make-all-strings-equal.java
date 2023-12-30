class Solution 
{
    public boolean makeEqual(String[] words) 
    {
       
        Map<Character, Integer> charCount = new HashMap<>();

        // Count the frequency of each character in all strings.
        for (String word : words) {
            for (char c : word.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        // Check if any character has an odd frequency.
        for (int count : charCount.values()) {
            if (count % words.length != 0) {
                return false;
            }
        }

        // All characters have frequencies divisible by the number of strings, so all strings can be made equal.
        return true;
    }
}