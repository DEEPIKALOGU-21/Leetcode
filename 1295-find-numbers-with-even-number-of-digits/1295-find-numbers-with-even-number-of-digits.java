class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        
        for(int i=0;i<nums.length;i++)
        {
            int even=0;
            while(nums[i]>0)
            {
            int digit=nums[i]%10;
            even++;
            nums[i]=nums[i]/10;
            }
            if(even%2==0)
            {
                count++;
            }
            
            
        }
        return count;
    }
}