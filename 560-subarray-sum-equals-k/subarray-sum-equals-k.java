class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        int currsum = 0;
        int count= 0 ;
        for(int num :nums){
            currsum += num ;
        int required = currsum - k ;
        if(map.containsKey(required)){
            count += map.get(required);
        }
        map.put(currsum , map.getOrDefault(currsum  , 0)+1);
        }
        return count ;
    }
}