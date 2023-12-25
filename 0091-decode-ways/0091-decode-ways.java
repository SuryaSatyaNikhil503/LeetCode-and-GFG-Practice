class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        char[] checkWord = s.toCharArray();
        int n = checkWord.length;

        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (checkWord[i - 1] != '0') {
                dp[i] += dp[i - 1];
            }

            if (i > 1 && isValidTwoDigit(checkWord[i - 2], checkWord[i - 1])) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }

    public boolean isValidTwoDigit(char first, char second) {
        int num = (first - '0') * 10 + (second - '0');
        return num >= 10 && num <= 26;
    }
}
