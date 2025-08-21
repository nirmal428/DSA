package Recurson;

public class firstOccurence {
    public static int occurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return occurence(arr,key,i+1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,5,3,7,9,4};
        System.out.println(occurence(arr,5,0));
    }
}
