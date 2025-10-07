package Stack;

import java.util.Stack;

public class ReverseStackRecursively {
    public static void display(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top =st.pop();
        System.out.print(top+" "); //reverse order
        display(st);
        st.push(top);
        System.out.print(top+" ");  // original order
    }

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        display(st);
    }
}
