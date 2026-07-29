package Day_16_Sorting;

public class Bubble {
    public static void BubbleSort(int arr[]){
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }

            }
            
        }
    }

    public static void main(String[]args){
        int[]arr={13,26,46,24,52,20,9};
        System.out.println("Before sorting");

        for(int num:arr){
            System.out.println(num+"");
        }
            BubbleSort(arr);
            System.out.println("After Sorting");
            for(int num:arr){
                System.out.println(num+" ");
            }
    }
}
