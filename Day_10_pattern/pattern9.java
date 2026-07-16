package Day_10_pattern;

public class pattern9 {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(n-i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

// **********
//  *******
//   *****
//    ***
//     *

// row 
// 1     0  9
// 2     1  7
// 3     2   5
// 4     3    3
// 5     4    1

// i-1
// 2*(n-i)+1


// row 1 spaces =0 start9
// row 2 spaces 1 starts 7
// rpw 3 spaces 2 starts 5 
// row 4 spaces 3 starts 3
// row 5 spaces 4 starts 1
    