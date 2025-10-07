package Stack;

import java.util.Stack;

public class PushAtIndex {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(20);
        st.push(33);
        st.push(47);
        st.push(40);
        st.push(37);
        System.out.println(st);
        int new_element=50;
        Stack<Integer> cst=new Stack<>();
        while (st.size()>2){ //push on index 2
            cst.push(st.pop());
        }
        st.push(new_element);
        while (cst.size()>0){
            st.push(cst.pop());
        }
        System.out.println(st);
    }
}
