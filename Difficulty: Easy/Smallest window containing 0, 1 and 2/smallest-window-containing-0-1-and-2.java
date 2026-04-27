class Solution {
    public int smallestSubstring(String s) {
        
        int last0 = -1;
        int last1 = -1;
        int last2 = -1;
        
        int maxLength = Integer.MAX_VALUE;
        
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == '0') last0 = i;
            if(s.charAt(i) == '1') last1 = i;
            if(s.charAt(i) == '2') last2 = i;
            
            if(last0 != -1 && last1 != -1 && last2 != -1){
                
                int currWindow = i - Math.min(last0, Math.min(last1, last2)) + 1;
                maxLength = Math.min(currWindow, maxLength);
            }
        }
        if(maxLength == Integer.MAX_VALUE){
            return -1;
        }else{
            return maxLength;
        }
        
    }
};
