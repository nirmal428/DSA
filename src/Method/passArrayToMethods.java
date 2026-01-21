package Method;

public class passArrayToMethods {
    public static void main(String[] args) {
        int[] arr={1,23,44,15};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
    public static void change(int[] arr){
        arr[0]=10;
    }
}
