class Solution {
    public boolean isPathCrossing(String path) {
    HashSet<Pair<Integer, Integer>> isVisited = new HashSet<>();
    
    int x = 0;
    int y = 0;
    
    isVisited.add(new Pair<>(x, y));
    
    for(int i = 0; i < path.length(); i++) {
        
        if(path.charAt(i) == 'N')
            y += 1;
        else if(path.charAt(i) == 'S')
            y -= 1;
        else if(path.charAt(i) == 'E')
            x += 1;
        else
            x -= 1;
        
        Pair<Integer, Integer> newPair = new Pair<>(x, y);
        
        if(isVisited.contains(newPair))
            return true;
        else
            isVisited.add(newPair);
    }
    
    return false;
    }
}