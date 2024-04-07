class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0; i<=haystack.length()-needle.length(); i++){
            if(needle.equals(haystack.substring(i,i+needle.length()))){        // Compare needle to sub-string of haystack
                return i;
            }
        }
        return -1;
    }
}
