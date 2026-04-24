class Solution {
    public boolean canSplit(int arr[]) {
        
        int totalsum = 0;
        for(int i : arr){
            totalsum += i;
        }
        if(totalsum % 2 != 0){
            return false;
        }
        
        int target = totalsum/2;
        
        int sum = 0;
        
        for(int i : arr){
            sum += i;
            if(sum == target){
                return true;
            }
        }
        return false;
        
    }
}