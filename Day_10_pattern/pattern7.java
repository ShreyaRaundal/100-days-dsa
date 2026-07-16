package Day_10_pattern;

public class pattern7 {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
// 12345
// 1234
// 123
// 12
// 1


// row    no
// 1      12345
// 2     1234
// 3 123
// 4 12
// 5 1

// int j=1;j<=n-i+1;j++

// n=5
// j=1 print 1
// j=2 rint 2
// j=3  print 3
// j=4 print 4
// j=5 print 5

// 1 2 3 4 5


// 5-2+1=4
// 12345
// 1234
// ]


//  i=3
//  5-3+1=3

//  12345
//  1234
//  123


//  i=4
//  5-4+1=2
//  12345
//  1234
//  123
//  12

//  i=5
//  5-5+1=1
//  12345
//  1234
//  123
//  12
//  1