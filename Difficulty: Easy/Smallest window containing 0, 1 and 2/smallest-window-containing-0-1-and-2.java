class Solution {
    public int smallestSubstring(String s) {
        // code here
        int zero = -1;
        int one = -1;
        int two = -1;
        
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0') zero = i;
            if(s.charAt(i) == '1') one = i;
            if(s.charAt(i) == '2') two = i;
            
            if(zero != -1 && one != -1 && two != -1){
                int minidx = Math.min(zero, Math.min(one, two));
                int maxidx = i;
                
                minimum  = Math.min(minimum, (maxidx - minidx + 1));
            }
            
        }
        return(minimum == Integer.MAX_VALUE) ? -1 : minimum;
    }
};
