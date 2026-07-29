package Day_16_Sorting;

public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int n=arr.length;

        for(int i=n-1;i>=0;i--){
            boolean didSwap=false;
            for(int j=0;j<=i-1;j++){
                if(arr[i]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    didSwap=true;
                }
            }

            if(!didSwap){
                break;
            }
        }
    }
    public static void main(String[] args){
        int[]arr={13,26,46,24,20};
        bubbleSort(arr);

        for(int num:arr){
            System.out.println(num+" ");
        }
    }
}
