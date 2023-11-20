class Solution:
    def garbageCollection(self, garbage: List[str], travel: List[int]) -> int:
        
        amount_of_time = 0
        for gbage in ['M', 'G', 'P']:
            time = 0
            for i in range(len(garbage), -1, -1):
                if gbage in garbage[i-1]:
                    time = time + sum(travel[:i-1]) + (''.join(garbage)).count(gbage)
                    break
            amount_of_time += time
        return amount_of_time