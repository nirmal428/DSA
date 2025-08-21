package Recurson;

public class lastOccurence {

    public static int loccu(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=loccu(arr,key, i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }


    public static void main(String[] args) {
        int arr[]={1,0,4,2,3,6,8,5,8,9};
        System.out.println(loccu(arr,8,0));
    }
}
