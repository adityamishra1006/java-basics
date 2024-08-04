import java.util.Stack;

public class leetcode {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(') st.push(')');
            else if(c == '{') st.push('}');
            else if(c == '[') st.push(']');

            else return false;
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        
    }
}
