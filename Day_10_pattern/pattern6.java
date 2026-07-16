package Day_10_pattern;

public class pattern6 {
    public static void main(String[] args){
        int n=5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
// *****n
// ****n-i+1
// ***
// **
// *

// 1   5
// 2    4
// 3    3
// 4     2
// 5      1

// n-i+1

// 5-1+1=5
// 5-2+1=4
// 5-3+1=3
// 5-4+1=2
// 5-5+1=1
// j<=n-i+1
