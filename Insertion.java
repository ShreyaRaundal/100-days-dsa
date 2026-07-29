package Day_16_Sorting;

public class Insertion {
    public static void insertionSort(int[]arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[]args){
        int[]arr={13,46,24,52,20,9};
        System.out.println("Before sorting");

        for(int num:arr){
            System.out.println(num+" ");
        }
        insertionSort(arr);
        System.out.println("After insertion");

        for(int num:arr){
            System.out.println(num+" ");
        }
    }
    
}
