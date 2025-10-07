package Stack;

import java.util.Stack;

public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(20);
        st.push(33);
        st.push(47);
        System.out.println(st);
        int new_element=50;
        Stack<Integer> cst=new Stack<>();
        while (st.size()>0){
            cst.push(st.pop());
        }
        st.push(new_element);
        while (cst.size()>0){
            st.push(cst.pop());
        }
        System.out.println(st);
    }
}
