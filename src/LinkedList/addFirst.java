package LinkedList;

import java.util.LinkedList;

public class addFirst {
    public static class Node{
        int data;
        create.Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static create.Node head;
    public static create.Node tail;

    public void addFirst(int data){
        //step 1
        create.Node newNode=new create.Node(data);
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
