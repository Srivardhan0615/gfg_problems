class Solution {
    public int minSwaps(int[] arr) {
        // code here
        int count = 0;
        
        for(int i : arr){
            if( i == 1){
                count++;
            }
        }
        if(count == 0) return -1;
        int window = 0;
        for(int i = 0; i < count; i++){
            if(arr[i] == 0){
                window++;
            }
        }
        
        int min = window;
        
        for(int i = count; i < arr.length; i++){
            
            if(arr[i] == 0) window++;
            if(arr[i - count] == 0) window--;
            
            min = Math.min(min, window);
        }
        return min;
    }
}
