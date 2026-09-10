class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        String ans = "";
        for(int i = 0 ; i < n - 1 ;i++){
            String prefix = s.substring(0 , i+1);
            if(s.endsWith(prefix)){
                if(prefix.length()>ans.length()){
                    ans = prefix ;
                }                
            }
        }
        return ans ;
    }
}