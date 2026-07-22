package Day_13_Recursion;

public class printnamen {
    static void printName(int i,int n){
        if(i>n){
            return;
        }
            System.out.println("shreya");
            printName(i+1, n);
        
    }

    public static void main(String[] args) {
        printName(1, 5);
        
    }
}