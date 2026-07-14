package Day8_functions;

public class Salary {
    static void updateSalary(int salary){
        salary=salary+10000;

        System.out.println("Inside function: "+salary);
    }
    public static void main(String[] args){
        int salary=500000;
        updateSalary(salary);
        System.out.println("main"+salary);

    }
}
