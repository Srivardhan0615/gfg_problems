class Solution {
    public int visibleBuildings(int arr[]) {
        
        int prevmax = arr[0];
        int count = 1;
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] >= prevmax){
                prevmax = arr[i];
                count++;
            }
        }
            
        // code here
        return count;
        
    }
}