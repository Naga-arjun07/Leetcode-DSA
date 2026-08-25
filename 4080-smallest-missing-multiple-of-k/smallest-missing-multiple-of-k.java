class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length ;
        for(int num : nums)
        set.add(num);
        for(int i = 1 ; i <= n+1 ; i++){
            int value = k * i;
            if(!set.contains(value)){
                return value ;
            }
        }
        return -1 ;
    }
}