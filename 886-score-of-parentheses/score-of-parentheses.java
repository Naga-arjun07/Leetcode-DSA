class Solution {
    public int scoreOfParentheses(String s) {
        //int count = 0 ; 
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(0);
            }
            else {
                int inside = st.pop();
                int score = inside == 0 ? 1 : 2*inside ;
                int previous = st.pop();
                st.push(previous + score); 
            }
        }
        return st.pop();
    }
}