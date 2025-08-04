package Array;
import java.util.Arrays;
public class builtInMethod {
    public static void main(String[] args) {
        int[] arr ={5,8,3,9,1,6,7,2,4};
        for(int x:arr){  // foe each loop
            System.out.print(x+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
