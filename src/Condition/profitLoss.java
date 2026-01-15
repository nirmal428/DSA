package Condition;

import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price :");
        int cp = sc.nextInt();
        System.out.print("Enter selling price :");
        int sp = sc.nextInt();

        if(sp>cp) System.out.println("profit");
        if(sp<cp) System.out.println("loss");
        else System.out.println("NO Profit No Loss");
    }
}