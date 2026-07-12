package Day_03_Statements;
import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the age: ");


        int age=sc.nextInt();
        if(age>=18){
            System.out.println("you are able to vote");
        }else{
            System.out.println("not able to vote");
        }
        
    }
}
