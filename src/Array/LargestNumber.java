package Array;

public class LargestNumber {

    public static int Large(int arr[]){
        int large=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(large<arr[i]){
                large = arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int arr[] = {10,30,20,50,48,33};
        System.out.println(Large(arr));
    }
}
