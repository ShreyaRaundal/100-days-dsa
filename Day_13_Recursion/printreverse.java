package Day_13_Recursion;

public class printreverse {
    public static void reverse(int i,int n){
        if(i<1){
            return ;
        }
       
        reverse(i-1,n);
         System.out.println(n);

    }
    public static void main(String[] args){
        reverse(1,5);
    }
}
