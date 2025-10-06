package LinkedList;

import java.util.LinkedList;

public class create {
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

    public void addFirst(int data){
        //step 1
        Node newNode=new Node(data);
        if(head==null){
            head =tail = newNode;
            return;
        }
        //step 2
        newNode.next=head; //link

        // step 3
        head=newNode;

    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}
