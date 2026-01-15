package Loop;

import java.util.Scanner;

public class APWithoutMath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of tern n :");
        int n=sc.nextInt();
        System.out.print("Enter starting number a :");
        int a=sc.nextInt();
        System.out.print("number of skip s :");
        int s = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(a);
            a+=s;
        }
    }
}
