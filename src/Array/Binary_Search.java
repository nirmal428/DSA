package Array;

public class Binary_Search {
    public static int binarySearch(int number[] , int key){
        int start =0 ,end=number.length-1;

        while(start <= end){
            int mid =(start+end)/2;

            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start = mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] number={1,2,3,4,6,8,9,14,34,45};
        int key=45;

        System.out.println("index for key is :"+binarySearch(number,key));
    }
}
