package Day_12_Numbers;

public class count {
    public static int count(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    public static void main(String[] args) {
        int num=1234567;
        System.out.println(count(num));
        
    }
    
}

// number 12345
// count 5
// 2345678
// count=?7
// 198100000
// 7 78 1000

// 12345   5     1
// 1234      4     2
// 12       3      3
// 1       2      4
// 0    stop     5