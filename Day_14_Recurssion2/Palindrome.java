package Day_14_Recurssion2;


public class Palindrome {
    public static boolean ispalindrome(String s,int i){
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return ispalindrome(s, i+1);
    }
    public static void main(String[] args){
        String str="HELLO";
        if(ispalindrome(str, 0)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }

}

// madam

// palindrome
// hello
// not palindrome
// m==m
// a==a
// d
// h=o


// i>=slength()/2;
// true;

// m==m
// a==a
// true
// turue
// true
