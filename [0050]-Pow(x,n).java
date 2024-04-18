class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        
        if(n < 0){
            return 1 / power(x, -n);
        }
      
        return power(x, n);
    }
    
    private double power(double x, int n) {
        if(n == 0) {
            return 1;
        }
        
        double half = power(x, n/2);     // Recursive call
        
        if(n%2 == 0){                    // If power is even
            return half * half;
        } 
        else{
            return x * half * half;      // If power is odd
        }
    }
}
