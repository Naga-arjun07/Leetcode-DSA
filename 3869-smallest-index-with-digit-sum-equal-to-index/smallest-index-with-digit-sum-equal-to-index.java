class Solution {
    public int smallestIndex(int[] nums) {
        //int sum = 0 ;
        int n = nums.length ;
        int[] sum = new int[n];
        for(int i = 0 ; i < n ;i++){
            if(nums[i] >= 10){
                while(nums[i] >0){
                    int dig = nums[i] % 10;
                    sum[i] +=dig;
                    nums[i]/=10 ;
                }
            }
            else {
                 sum[i]= nums[i];
            }
        }
        for(int i = 0 ; i< n ; i++){
            if(sum[i] == i)return i;
        }
        return -1 ;
        
    }
}