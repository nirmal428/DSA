package Basics;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r =sc.nextDouble();
        double a =3.141592*r*r;
        System.out.print("area of circle is : " + a);
    }

}
