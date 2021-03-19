class Solution {
    public boolean search(int[] nums, int target) {
        int found=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                found=1;
                return true;
            }
        }
        return false;
    }
}
