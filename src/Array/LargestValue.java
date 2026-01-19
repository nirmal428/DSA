package Array;

import java.util.Scanner;

public class LargestValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array ");
        int n = sc.nextInt();
        System.out.println("Enter array elements ");
        int[] arr=new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0; i<=n-1; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(max);
    }
}
