class Solution {
    private final Map<Integer, Map<Integer, Integer>> ROLL_COUNT_CACHE = new HashMap<>();
    private final static int MOD = 1_000_000_007;
    
    public int numRollsToTarget(int n, int k, int target) {

         return checkRolls(0, n, k, target);
     }

    
    public int checkRolls(int currentRollTotal, int numDice, int numFaces, int target) {

        if (currentRollTotal > target) return 0;
        if (numDice == 0) return currentRollTotal == target ? 1 : 0;

        var cache = ROLL_COUNT_CACHE.get(currentRollTotal);
        if (Objects.nonNull(cache) && cache.containsKey(numDice)) { return cache.get(numDice); }

        int targetRollWays = 0;
        for (int i = 1; i <= numFaces; i++) {

            targetRollWays = (targetRollWays + checkRolls(currentRollTotal + i, numDice - 1, numFaces, target)) % MOD;
        }

        ROLL_COUNT_CACHE.computeIfAbsent(currentRollTotal, x -> new HashMap<>()).put(numDice, targetRollWays);

        return targetRollWays % MOD;
    }
}