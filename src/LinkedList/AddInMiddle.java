package LinkedList;

import java.util.LinkedList;

public class AddInMiddle {
    // Node class
    public static class Node {
        int data;
        LinkedList.addLast.Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static LinkedList.addLast.Node head;
    public static LinkedList.addLast.Node tail;


    public void add(int ind , int data){
        Node newNode = new Node(data);
        Node tem = head;
        int i=0;

        while(i<ind-1){
            tem =tem.next;
            i++;
        }

    }
    public static void main(String[] args) {
        LinkedList<Integer> st = new LinkedList<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
    }
}
