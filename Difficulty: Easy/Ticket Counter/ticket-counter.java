class Solution {
    public static int distributeTicket(int n, int k) {
        
        int i = 1;
        int j = n;
        
        while (i <= j) {
            
            // remove k from front
            i += k;
            if (i > j) return j;
            
            // remove k from back
            j -= k;
            if (j < i) return i;
        }
        
        return -1;
    }
}