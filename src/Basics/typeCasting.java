package Basics;

import java.util.Scanner;

public class typeCasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x =sc.nextInt();
        double y =(double)x;
        System.out.println(y/2);

        double d=sc.nextDouble();
        int n = (int)d;
        System.out.println(n);
    }

}
