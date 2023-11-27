class Solution 
{
    public String truncateSentence(String s, int k) 
    {
        String[] words = s.split(" ");
        StringBuilder truncatedSentence = new StringBuilder();

        for (int i = 0; i < k; i++) {
            truncatedSentence.append(words[i]);
            if (i < k - 1) {
                truncatedSentence.append(" ");
            }
        }

        return truncatedSentence.toString();
    }
}