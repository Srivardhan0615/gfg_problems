class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int n = arr.length;
        int count = 0;
        for(int i : arr){
            if(i == 0){
                count++;
            }
        }
        for(int i = 0; i < n; i++){
            if(i < count){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
        
    }
}
