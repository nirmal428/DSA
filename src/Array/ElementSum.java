package Array;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ElementSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array ");
        int n = sc.nextInt();
        System.out.print("enter array elements ");
        int[] arr=new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0; i<=n-1; i++){
            sum += arr[i];
        }
        System.out.print("Sum of all elements of the array = "+sum);
    }
}
