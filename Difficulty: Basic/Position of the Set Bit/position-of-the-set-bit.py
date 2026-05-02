class Solution:
    def findPosition(self, n):
        # code here 
        if (n & (n-1))!=0:
            return -1
        pos=0
        while n>0:
            n=n>>1
            pos+=1
        return pos