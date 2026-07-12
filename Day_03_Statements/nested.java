package Day_03_Statements;

public class nested {
    public static void main(String[] args){

        int age=40;

        boolean haslicen=true;

        if(age<=18){
             if(haslicen){
            System.out.println("you can drive");
            }else{
                System.out.println("get licen");
            }

        }else{
            System.out.println("you are underage");
        }
       
    }



}
