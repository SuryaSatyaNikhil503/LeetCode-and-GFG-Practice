class Solution 
{
    
    static boolean canFormWord(String word, Map<Character, Integer> charCount) 
    {
        for (char c : word.toCharArray()) 
        {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) 
            {
                return false; // Character not present or exhausted
            }
            charCount.put(c, charCount.get(c) - 1);
        }
        return true;
    }
    
    public int countCharacters(String[] words, String chars) 
    {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count characters in chars
        for (char c : chars.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int result = 0;

        // Check each word
        for (String word : words) {
            if (canFormWord(word, new HashMap<>(charCount))) {
                result += word.length();
            }
        }

        return result;
    }
}