
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        int i = 0;      // first half
        int j = n;      // second half
        int index = 0;  // result index

        while (i < n) {
            result[index] = nums[i];
            index++;
            i++;
            result[index] = nums[j];
            index++;
            j++;
        }

        return result;
    }
}

