package Day_16_Sorting;

public class Selection {
    public static void seletionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                minIndex=j;

            }
            int temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;

        }
    }
    public static void main(String[] args){
        int[]arr={13,46,24,52,20,9};

        for(int num:arr){
            System.out.println(num);
        }
        seletionSort(arr);
        for(int num:arr){
            System.out.println(num);
        }
    }
}
