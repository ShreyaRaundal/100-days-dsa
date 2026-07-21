package Day_12_Numbers;

public class reverse {
    public static void main(String[] args){
        int number=-568-86;
        int result=reverseNumber(number);
        System.out.println(result);
    }
    public static int reverseNumber(int number){
        int reverse=0;
        while(number>0){
            int digit=number%10;
            reverse=reverse*10+digit;
            number=number/10;
        }
        return reverse;

    }
    
}

// 1 2 3 4 5 6
// 6 5 4 3 2 1 


// 12345   %10 5   5
// 1234    4       4
// 123     3       3
// 12      2       2
// 1       1       54321
// 0   stop        54321