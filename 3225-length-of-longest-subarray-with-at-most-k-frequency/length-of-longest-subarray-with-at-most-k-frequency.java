class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length ;
        Map<Integer , Integer> map = new HashMap<>();
        int res = 0 ;
        int left = 0 ;
        for(int i = 0 ; i < n ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] ,0)+1);
            int curr = nums[i];
            while(map.get(nums[i]) > k){
                int last = nums[left];
                map.put(last , map.get(last)-1);
                left++ ;
            }
            res = Math.max(i - left+1 , res);
        }
        return res ;
    }
}