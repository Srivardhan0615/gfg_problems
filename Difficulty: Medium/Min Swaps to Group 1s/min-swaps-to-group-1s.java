class Solution {
    public int minSwaps(int[] arr) {
        // code here
        int ones = 0;
        
        for(int i : arr){
            if(i == 1){
                ones++;
            }
        }
        if(ones == 0) return -1;
        int zero = 0;
        
        for(int i = 0; i < ones; i++){
            if(arr[i] == 0){
                zero++;
            }
        }
        int minz = zero;
        
        for(int i = ones; i < arr.length; i++){
            if(arr[i] == 0){
                zero++;
            }
            if(arr[i - ones] == 0){
                zero--;
            }
            minz = Math.min(minz, zero);
        }
        return minz;
    }
}
