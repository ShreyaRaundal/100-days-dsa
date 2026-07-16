package Day_10_pattern;

public class pattern8 {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
//      *
//     **
//     * * *

//     rows 
//     1     2   1
//     2   3     3
//     3    2    5
//     4  1       7
//     5    0      9


//     spaces=n-i
//     2*i-1