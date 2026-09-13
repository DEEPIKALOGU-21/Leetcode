
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();

        // Find the maximum candies
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        // Check each kid
        for (int i = 0; i < candies.length; i++) {
            int sum = candies[i] + extraCandies;

            if (sum >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }
}
