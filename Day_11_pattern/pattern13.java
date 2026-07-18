package Day_11_pattern;
// 4 4 4 4 4 4 4
// 4 3 3 3 3 3 4
// 4 3 2 2 2 3 4
// 4 3 2 1 2 3 4  2*n-1  n=4 2*4-1=7
// 4 3 2 2 2 3 4  tp=i  l=j  nottom =size-1-i   right =size-1-j   minimum distance
// 4 3 3 3 3 3 4
// 4 4 4 4 4 4 4

public class pattern13 {
    public static void main(String[] args) {
        int n=4;
        int size=2*n-1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                int top=i;
                int left=j;
                int right=size-1-j;
                int bottom=size-1-i;
                int min=Math.min(Math.min(top,bottom),Math.min(left,right));
                System.out.print((n-min)+" ");

            }
            System.out.println();
        }
    }
}

// 0(n)2
// 0(n)
