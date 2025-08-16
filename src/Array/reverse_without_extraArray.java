package Array;

import java.util.Scanner;

public class reverse_without_extraArray {
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
       // int i=1 , j=4; reverse part of array
        int i=0 , j=n-1;
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
