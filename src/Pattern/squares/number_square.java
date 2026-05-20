package Pattern.squares;

import java.util.Scanner;

public class number_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row or column numbers ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
