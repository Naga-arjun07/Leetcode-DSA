class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length ;
        int minWindow = Integer.MAX_VALUE ;
        int currSum = 0; 
        int left = 0 , right = 0 ;
        while(right < n){
            currSum+=nums[right];
            right++ ;
            while(currSum >= target){
                int currWindow = right - left ;
                minWindow = Math.min(currWindow , minWindow);
                currSum -= nums[left];
                left++ ;
            }
        }
        if(minWindow == Integer.MAX_VALUE) return 0 ;
        return minWindow ;

    }
}