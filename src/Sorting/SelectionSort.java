package Sorting;

public class SelectionSort {
    public static void Selection(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPon=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPon] > arr[j]){
                    minPon = j ;
                }
            }
            int temp = arr[minPon];
            arr[minPon]= arr[i];
            arr[i]=temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={5,4,1,3,2};
        Selection(arr);
        printArr(arr);
    }
}
