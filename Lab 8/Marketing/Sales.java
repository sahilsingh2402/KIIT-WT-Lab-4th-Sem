package Marketing;

import java.util.*;
import General.*;

class Saless {
    public static double tallowance(double e) {
        return e * 0.05;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name , Employee id and Basic Salary : ");
        String name = sc.nextLine();
        int id = sc.nextInt();
        double sal = sc.nextDouble();
        Employee obj1 = new Employee(name, id, sal);
        obj1.printName();
        double e = obj1.earnings();
        System.out.println("Total Earnings of sales person : " + e);
        System.out.println("Travel Allowance : " + tallowance(e));
        System.out.println("Employee ID : " + id);
        sc.close();
    }
}
