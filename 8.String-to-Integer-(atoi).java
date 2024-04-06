class Solution {
    public int myAtoi(String s) {
        // Remove leading spaces
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        
        // Handle sign character
        int sign = 1;
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }
        
        // Process digits
        long result = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;
            
            // Check for overflow
            if (result > Integer.MAX_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            i++;
        }
        
        return (int) (result * sign);
    }
}
