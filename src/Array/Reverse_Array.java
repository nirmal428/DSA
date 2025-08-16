package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array length : ");
        int n = sc.nextInt();
        System.out.print("enter array element : ");
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<n/2; i++){
            int j=n-1-i;
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
}
