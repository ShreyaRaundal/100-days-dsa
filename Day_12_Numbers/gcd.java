package Day_12_Numbers;

public class gcd {

    public static int findGcd(int num1,int num2){
        while(num2!=0){
            int rem=num1 % num2;
            num1=num2;
            num2=rem;
        }
        return num1;
    }
    public static void main(String[] args){
        int num1=12;
        int num2=18;

        int result=findGcd(num1, num2);
            System.out.println(result);
        
    }
    
}
// gdc (12,18)=6

// gcd(20,30)=10
// gcd(7,5)=1

// 12  18 12
// 18 12   6
// 12  6   0