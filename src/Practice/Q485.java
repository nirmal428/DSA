package Practice;

public class Q485 {

    public static int findMaxConsecutiveOnes(int[] arr){
        int count =0;
        int max=0;
        for(int i=0; i<arr.length ; i++){
            if(arr[i]==1){
                count++;
            }
            else {
                max=Math.max(max,count);
                count=0;
            }
        }
        return Math.max(max,count);
    }

    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1,1,0};
        System.out.print(findMaxConsecutiveOnes(arr));
    }
}
