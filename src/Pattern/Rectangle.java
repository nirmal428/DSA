package Pattern;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row number :");
        int n=sc.nextInt();
        System.out.print("Enter row columns :");
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
