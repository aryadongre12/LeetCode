// Using Stack

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){                // Closing parenthesis is pushed in the stack when opening parenthesis is found
                st.push(')');
            }
            else if(c == '['){
                st.push(']');
            }
            else if(c == '{'){
                st.push('}');
            }
            else if(st.isEmpty() || st.pop() != c){       // so now if the closing paranthesis we get != the one in the stack, return false
                return false;
            }
        }
        return st.isEmpty();
    }
}
