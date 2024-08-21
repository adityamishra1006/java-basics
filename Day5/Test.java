import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(18);
        st.push(10);
        st.push(24);
        st.push(56);
        st.push(27);

        operate(st);

        // Display the stack after operation
        System.out.println(st);
    }

    private static void operate(Stack<Integer> st) {
        for (int i = 0; i < 3 && !st.isEmpty(); i++) {
            if (!st.isEmpty() && st.peek() % 3 == 0) {
                st.pop();
                if (!st.isEmpty()) {
                    int temp = st.pop();
                    st.push(temp + 1);
                    st.push(temp + 2);
                }
            } else {
                st.pop();
            }
        }
    }
}
