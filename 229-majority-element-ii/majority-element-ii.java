class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n =  nums.length ;
        Map<Integer , Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            int val =entry.getValue();
            if(val > n/3){
                list.add(entry.getKey());
            }
        }
        return list ;
    }
}