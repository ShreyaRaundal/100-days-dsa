package Day_14_Recurssion2;

public class Fibonacci {
    static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args){
        int n=6;
        System.out.println(fibonacci(n));
    }


   
    
}

// N=6

// 0 1 1 2 3 5 8 13 21
// 0 0 
// 1  1
// 2  1
// 3   2
// 4  3
// 5   5
// 6   8


// fib(6)=fib(5)+fib(4)

// fib(5)=fib(4)+fib(3
// )
// fib(n)=fib(n-1)fib(n-2)


// n<=1
// 1

// fib(0)=0
