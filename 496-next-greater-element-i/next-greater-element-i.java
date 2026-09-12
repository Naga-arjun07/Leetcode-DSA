class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length ;
         int m = nums2.length ;
         Map<Integer , Integer> map = new HashMap<>();
         Stack<Integer> st = new Stack<>();
         for(int num : nums2){
            while(!st.isEmpty() && st.peek()<num){
                int smaller = st.pop();
                map.put(smaller , num);
            }
            st.push(num);
         }
         while(!st.isEmpty()){
            int ele = st.pop() ; 
            map.put(ele , -1);
         }
         int[] ans = new int[n];
         for(int i = 0 ; i < n ; i++){
            ans[i] = map.get(nums1[i]);
         }
         return ans ;
    }
}