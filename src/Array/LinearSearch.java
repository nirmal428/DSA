package Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int n=sc.nextInt();
        System.out.print("enter target value : ");
        int x=sc.nextInt();
        System.out.print("Enter Array element : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false;  // not found
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                flag=true; // found
                break;
            }
        }
        if(flag==true) System.out.println("Element found");
        else System.out.println(" Element not found ");
    }
}
