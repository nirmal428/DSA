package Recurson;

public class tillingProblem {

    public static int tilling(int n){

        if(n==0 || n==1){
            return 1;
        }
        //vertical Tiles
        int fnm1 = tilling(n-1);
        // Horizontal
        int fnm2=tilling(n-2);

        int toWays=fnm1+fnm2;
        return toWays;
    }

    public static void main(String[] args) {
        System.out.println(tilling(3));
    }
}
