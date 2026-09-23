class Solution {
    public int similarPairs(String[] words) {
        int n = words.length;
        int count = 0 ;
        //Map<String , String> map = new HashMap<>()
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = i+1 ; j< n ; j++){
                count+=check(words[i] , words[j]);
            }
        }
        return count ;       
    }
    private int check(String s  , String t){
        Set set1 = new HashSet();
        for(char ch : s.toCharArray()){
            set1.add(ch);
        }
        Set set2 = new HashSet();
        for(char ch : t.toCharArray()){
            set2.add(ch);
        }
        if(set1.equals(set2)){
            return 1 ;
        }
        return 0 ;
    }
}