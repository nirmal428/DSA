package Array;
import java.util.Arrays;
public class copyOfArray {
    public static void main(String[] args) {
        int[] arr ={5,8,3,9,1,6,7,2,4};
        for(int x:arr){  // foe each loop
            System.out.print(x+" ");
        }
        System.out.println();

        int[] num =arr;   //Shallow copy
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        int[] brr =Arrays.copyOf(arr,arr.length);
        brr[0]=100;  //DEEP COPY
        for(int ele:brr){
            System.out.print(ele+" ");
        }
    }
}
