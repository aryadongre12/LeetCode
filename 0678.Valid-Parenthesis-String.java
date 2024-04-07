class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> lstk = new Stack<>();      // left stack
        Stack<Integer> sstk = new Stack<>();      // star stack

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                lstk.push(i);
            }
            else if (c == '*'){
                sstk.push(i);
            } 
            else{                        // when encountering ')'
                if (!lstk.isEmpty()){
                    lstk.pop();
                } 
                else if (!sstk.isEmpty()) {
                    sstk.pop();
                } 
                else {
                    return false;       // if no '(' or '*' left to balance ')'
                }
            }
        }

        // Match remaining '(' with '*' (if available)
        while (!lstk.isEmpty() && !sstk.isEmpty()) {
            if (lstk.pop() > sstk.pop()) {                // sstk can have more elements than lstk as here '*' is also considered as empty string
                return false;                             // '*' is placed before '('
            }
        }
        return lstk.isEmpty();
    }
}
