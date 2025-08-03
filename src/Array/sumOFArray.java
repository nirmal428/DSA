package Array;

import java.util.Scanner;

public class sumOFArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int n=sc.nextInt();
        System.out.print("Enter Array element : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum +=arr[i];
        }
        System.out.println("Sum pf array = "+sum);
    }
}
