class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length ;
        int ans = -1 ;
        Map<Integer , Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num , map.getOrDefault(num , 0)+1);
        }
        for(int num : arr){
            int freq = map.get(num) ;
            if(num == freq)
            ans = Math.max(ans , freq);
        }
        return ans ;
    }
}