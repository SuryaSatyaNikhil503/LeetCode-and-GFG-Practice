class Food {
    String name;
    int rating;

    public Food(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }
}

class FoodRatings {
    private final Map<String, PriorityQueue<Food>> orderedRatings = new HashMap<>();
    private final Map<String, String> foodToCuisine = new HashMap<>();
    private final Map<String, Food> nameToFood = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        int n = foods.length;
        for (int i = 0; i < n; i++) {
            Food food = new Food(foods[i], ratings[i]);
            nameToFood.put(foods[i], food);
            foodToCuisine.put(foods[i], cuisines[i]);
            orderedRatings.computeIfAbsent(cuisines[i], e-> new PriorityQueue<>((f1, f2)-> {
                if (f1.rating == f2.rating)
                    return f1.name.compareTo(f2.name);
                return f2.rating - f1.rating;
            })).add(food);
        }
    }

    public void changeRating(String food, int newRating) {
        String cuisine = foodToCuisine.get(food);
        Food foodPointer = nameToFood.get(food);
        PriorityQueue<Food> maxHeap = orderedRatings.get(cuisine);
        Food newRecord = new Food(food, newRating);
        maxHeap.remove(foodPointer);
        maxHeap.add(newRecord);
        nameToFood.put(food, newRecord);
    }

    public String highestRated(String cuisine) {
        PriorityQueue<Food> maxHeap = orderedRatings.get(cuisine);
        return maxHeap.isEmpty() ? "" : maxHeap.peek().name;
    }
}
/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */