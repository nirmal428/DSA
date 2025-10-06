package Stack;

import java.util.Stack;

public class Basic {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();

        System.out.println(st.isEmpty());

        st.push(1);
        st.push(5);
        st.push(9);
        st.push(10);
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        st.push(23);
        st.push(14);
        System.out.println(st);
        System.out.println("stack size = "+st.size());

        while(st.size() >1){ //to access first element
            st.pop();
        }
        System.out.println("fist element is = "+ st.peek());
    }
}
