class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length; i++) {
            map.put(nums[i],i);
        }
        
        for(int curr=0; curr<nums.length;curr++) {
            int search = target-nums[curr];
            
            if(map.containsKey(search) && curr!=map.get(search)) {
                int[] ans = new int[2];
                
                ans[0] = curr;
                ans[1] = map.get(search);
                // System.out.println(ans[0] + " " + ans[1]);
                return ans;
            }
        }
        // System.out.println(map);
        return null;
    }
}
