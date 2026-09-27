class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        int n = s.length();
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            //if(map.containsKey(s.charAt(i))){
            if (i - left + 1 == 3) {
                if(map.size() == 3){
                    count++;
                }
                char ch = s.charAt(left);
                map.put(ch ,map.get(ch)-1);
                if(map.get(ch) == 0)
                map.remove(ch);
                left++;
            }
        }
        return count;
    }
}