class Solution {
    public int maxScore(String s) {
        int n = s.length(), max = 0;
        int[] prefix = new int[n], suffix = new int[n];
        prefix[0] = increment(s, 0, '0');
        suffix[n - 1] = increment(s, n - 1, '1');
        for (int i = 1; i < n; i++) {
            prefix[i] += prefix[i - 1] + increment(s, i, '0');
        }
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] += suffix[i + 1] + increment(s, i, '1');
        }
        if (n == 2) return prefix[0] + suffix[n - 1];
        for (int i = 1; i < n - 1; i++) {
            max = Math.max(max, suffix[i] + prefix[i]);
        }
        return max;
    }

    private static int increment(String s, int index, char x) {
        return s.charAt(index) == x ? 1 : 0;
    }
}