class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        int n = arr.length;
        int nums[] = new int[n];
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            nums[i] = arr[i] * arr[i];
        }
        
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }
        
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(set.contains(nums[i] + nums[j])){
                return true;
                }
            }
        }
        return false;
        
    }
        
}