class Solution {
    int t0 = 0;
    int t1 = 1;
    int t2 = 1;
    int sum = 0;
    
    public int tribonacci(int n) {
        if(n == 1 || n == 2){
            return 1;
        }

        if(n > 2){
            sum = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = sum;

            tribonacci(n-1);
        }

        return sum;
    }
}
