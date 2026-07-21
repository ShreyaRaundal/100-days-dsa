package Day_12_Numbers;

public class palindrome {
    public static void main(String[] args){
        int num=123;
        if(ispalindrome(num)){
            System.out.println("is a palindrome number");
        }else{
            System.out.println("not a palindrome number");
        }
    }
    public static boolean ispalindrome(int num){
        int originalnumber=num;
        int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        return originalnumber==rev;
    }
    
}

// 121
// 1331
// 123  321

// 121  1   1
// 12   1   12
// 1    1   121
// 0 stop 121

// 121 121
