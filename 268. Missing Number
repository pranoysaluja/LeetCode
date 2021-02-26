class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        int l=nums.length;
        int s=0;
         for(int i=1;i<=l;i++)
        {
            s=s+i;
        }
        int x=s-sum;
        return x;
    }
}
