package Loop;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        for(int i=1; i<=n*2-1; i+=2){
            System.out.println(i);
        }
    }
}
