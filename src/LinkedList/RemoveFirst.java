package LinkedList;

import java.util.LinkedList;

public class RemoveFirst {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public int remove(){
        int val =head.data;
        head=head.next;
        return  val;
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

    }
}
