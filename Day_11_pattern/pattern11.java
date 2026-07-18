
package Day_11_pattern;
// *              *  1 1   8 1 leftdtar 1  space 2*(n-i)  right i
// **            **   2 2 6  2
// ***          ***  3    4    3 
// ****        ****  4   2   4
// *****      *****  5   5   0  5
// ****        ****  4    2   4
// ***          ***  3   4     3
// **            **  2   6    2
// *              *   1 8  1    lest satrt 1i spacs 2*(n-i)   right i
public class pattern11 {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }


            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.println("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    
}
