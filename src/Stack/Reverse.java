package Stack;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(20);
        st.push(33);
        st.push(47);
        System.out.println(st);

        Stack<Integer> re_st = new Stack<>();
        while(!st.isEmpty()){
//            int element=st.pop();
//            re_st.push(element);

            re_st.push(st.pop());
        }
        System.out.println(re_st);
    }
}
