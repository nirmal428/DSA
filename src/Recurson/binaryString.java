package Recurson;

public class binaryString {  //without consecutive ones(1)
    public static void binary(int n, int lastPlace , String str ){

        if(n==0){
            System.out.println(str);
            return;
        }

        binary(n-1,0,str+"0");
        if(lastPlace==0){
            binary(n-1,1,str+"1");
        }
    }

    public static void main(String[] args) {
        binary(3,0,"");
    }

}
