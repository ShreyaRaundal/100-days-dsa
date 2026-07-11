package Day-01-Basics;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Population: ");
        long population = sc.nextLong();

        System.out.print("Enter Price: ");
        float price = sc.nextFloat();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Grade: ");
        char grade = sc.next().charAt(0);

        System.out.print("Enter Name: ");
        String name = sc.next();

        sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.println("\n----- Output -----");
        System.out.println("Age       : " + age);
        System.out.println("Population: " + population);
        System.out.println("Price     : " + price);
        System.out.println("Salary    : " + salary);
        System.out.println("Grade     : " + grade);
        System.out.println("Name      : " + name);
        System.out.println("Address   : " + address);

        sc.close();
    }
}