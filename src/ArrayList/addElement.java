package ArrayList;

import java.util.ArrayList;

public class addElement {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(6);
        al.add(0,10);
        al.add(1,20);
        al.add(2,30);
        al.add(3,40);
        al.add(4,50);
        al.add(5,60);
        System.out.println(al.get(0));

        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
        System.out.println();
        System.out.println("size of array : "+al.size());
        al.add(100);
        System.out.println(al);
        System.out.println("size of array : "+al.size());
    }
}
