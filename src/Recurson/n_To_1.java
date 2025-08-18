package Recurson;

public class n_To_1 {
    public static void nTo1(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        nTo1(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        nTo1(n);
    }
}
