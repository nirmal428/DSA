package Pattern;

import java.util.Scanner;

public class marksOfStudent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of student ");
        int n =sc.nextInt();
        System.out.print("Enter student mark : ");
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<=n-1;i++){
            if(arr[i]<35){
                System.out.println(i+" ");
            }
        }
    }
}
