class Solution {
    public boolean canWinNim(int n) {
        while(n>=0)
        {
            n-=3;
            if(n<=0)
            {
                return true;
            }
            n-=1;
            if(n<=0)
            {
                return false;
            }
        }
        return true;
    }
}