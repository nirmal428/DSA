package Stack;

import java.util.Stack;

public class CopyWithSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(20);
        st.push(33);
        st.push(47);
        System.out.println(st);

        Stack<Integer> tem_st=new Stack<>();
        while (!st.isEmpty()){
            tem_st.push(st.pop());
        }
        System.out.println(tem_st);

        Stack<Integer> final_st=new Stack<>();
        while (!tem_st.isEmpty()){
            final_st.push(tem_st.pop());
        }
        System.out.println(final_st);
    }
}
