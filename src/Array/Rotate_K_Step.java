package Array;

import java.util.Scanner;

public class Rotate_K_Step {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array length : ");
        int n = sc.nextInt();
        System.out.print("enter array step : ");
        int k = sc.nextInt();
        System.out.print("enter array element : ");
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=n-k;i<n;i++){

        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
