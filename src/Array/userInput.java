package Array;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n=sc.nextInt();
        System.out.print("Enter Array Element :");
        int[] arr=new int[n];
//TAKE AAL INPUT
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
