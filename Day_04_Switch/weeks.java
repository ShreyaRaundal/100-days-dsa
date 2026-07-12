package Day_04_Switch;
import java.util.Scanner;
public class weeks {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the number");
        int day=sc.nextInt();

        if(day==1){
            System.out.println("Monday");
        }
        else if(day==2){
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("thrusday");
        }else if(day==5){
            System.out.println("Friday");
        }else{
            System.out.println("Invalid days");
        }
    }

    
}
