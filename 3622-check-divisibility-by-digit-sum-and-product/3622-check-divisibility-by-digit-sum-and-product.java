class Solution {
    public boolean checkDivisibility(int n) {
        int d = n;     // d = divident;
        int dsum = 0;
        int product = 1;
        while(d>0){
           int rem = d%10;
            product = product * rem;
            dsum += rem;
            d = d/10;
        }
        int sum = dsum + product;
        if(n%sum == 0){
            return true;
        } else
        return false;
        
    }
}