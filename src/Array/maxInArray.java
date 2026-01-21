package Array;

import java.util.Scanner;

public class maxInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a array size: ");
        int n =sc.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[n];
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        System.out.print("max value= "+ mx);
    }
}
