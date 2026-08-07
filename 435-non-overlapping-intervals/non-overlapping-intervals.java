class Solution {
    public int eraseOverlapIntervals(int[][] arr) {
        int n = arr.length ;
        Arrays.sort(arr, (a, b) -> a[1] - b[1]); 
        int count = 1 ;
        int lastEndTime= arr[0][1];
        for(int i = 1 ; i < n ; i++){
            if(arr[i][0] >= lastEndTime){
                count ++ ;
                lastEndTime = arr[i][1]; 
            }
        }
        return n - count ;
    }
}