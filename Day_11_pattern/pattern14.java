package Day_11_pattern;
// *       *       *
//   *   *   *   *
//     *       *

// condition 1 (row +col)%4==0
// condition 2 row==2 && col%4==0
public class pattern14 {
    public static void main(String[] args) {
        int n=9;
        for(int i=0;i<3;i++){
            for(int j=0;j<n;j++){
                if((i+j)%4==0 ||(i==1 && j%4==2)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
