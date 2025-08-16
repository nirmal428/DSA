package Array;

import java.util.Scanner;

public class doublet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array length : ");
        int n = sc.nextInt();
        System.out.print("enter target value : ");
        int x = sc.nextInt();
        System.out.print("enter array element : ");
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        for(int i=0;i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == x ){
                    System.out.println(arr[i] +" "+arr[j]);
                }
            }
        }

    }
}
