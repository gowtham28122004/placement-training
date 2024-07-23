class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = 0;
        
        int currOnes = 0;
        
        for(int i = 0;i < nums.length;i++)
        {
            if(nums[i] == 1)
                currOnes++;
            else
            {
                max = Math.max(max,currOnes);
                currOnes = 0;
            }
        }
        return Math.max(max,currOnes);
    }
}
