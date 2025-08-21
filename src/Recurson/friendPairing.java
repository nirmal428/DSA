package Recurson;

public class friendPairing {
    public static int pair(int n){

        if(n==1 || n==2){
            return n;
        }
        //single
        int fnm1=pair(n-1);
        //pair
        int fnm2=pair(n-2);
        int pairWays=(n-1)*fnm2;
        //total ways
        int totalWays=fnm1+pairWays;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(pair(4));
    }
}
