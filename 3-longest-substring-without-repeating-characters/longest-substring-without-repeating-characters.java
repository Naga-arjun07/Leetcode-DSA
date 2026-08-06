class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length() ;
        int max = 0 ;
        Map<Character , Integer> map = new HashMap<>();
        int left = 0 ;
        int right = 0 ;
        while(right < n){
            if(map.containsKey(s.charAt(right)))
            left = Math.max(left , map.get(s.charAt(right)) +1);
            int len = right - left +1 ;
            max = Math.max(len , max);
            map.put(s.charAt(right) , right);
            right++ ;
        }
        return max ;
    }
}