package Array;

import java.util.Scanner;

public class LinearSearch_BFT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array ");
        int n = sc.nextInt();
        System.out.print("enter search array elements (KEY) = ");
        int x=sc.nextInt();
        System.out.println("Enter array elements ");
        int[] arr=new int[n];
        for(int i=0; i<=n-1; i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false; // not found
        for(int i=0; i<=n-1; i++){
            if(arr[i]==x){
                flag=true; //found
                break;
            }
        }
        if(flag=true) System.out.print("Element found ");
        else System.out.print("not found");

    }
}
