package Array;

import java.util.Scanner;

public class Roll_no_student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int n=sc.nextInt();
        System.out.print("Enter Array element : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]<35){
                System.out.print(i +" ");
            }
        }
    }
}
