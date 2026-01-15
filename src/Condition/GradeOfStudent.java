package Condition;

import java.util.Scanner;

public class GradeOfStudent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the marks :");
        int n =sc.nextInt();

        if(n>=80) System.out.println("Very Good");
        else if(n>=61 ){
            System.out.println("Good");
        }
        else if(n>=41){
            System.out.println("Average");
        }
        if(n<=40){
            System.out.println("fail");
        }
    }
}
