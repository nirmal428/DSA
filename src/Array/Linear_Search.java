package Array;

public class Linear_Search {

    public static int Lsearch(int arr[],int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,8,5,9};
        int key=11;
        int index=Lsearch(arr,key);
        if(index== -1){
            System.out.println("Key not found ");
        }
        else System.out.println("key is at "+index);
    }
}
