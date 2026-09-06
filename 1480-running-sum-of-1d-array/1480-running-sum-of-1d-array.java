class Solution {
    public int[] runningSum(int[] nums) {
        
       int start=0;
               for(int i=0;i<nums.length;i++)
        {
            start+=nums[i];
            nums[i]=start;
        }
        return nums;
        
    }
}