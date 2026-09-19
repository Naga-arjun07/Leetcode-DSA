class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        int ans = -1 ;
        int max = 0 ;
        for(int num : nums){
            map.put(num , map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            int val = entry.getValue();
            int key = entry.getKey();
            if(key % 2 == 0){
            if(val > max|| val == max && key < ans){
                ans = entry.getKey();
                max = val ;
            }
            }
        }
        return ans ;
    }
}