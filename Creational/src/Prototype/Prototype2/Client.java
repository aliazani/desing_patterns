package Prototype.Prototype2;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        int employeeId = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter Employee Designation: ");
        String employeeDesignation = scanner.nextLine();

        System.out.print("Enter Employee Address: ");
        String employeeAddress = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double employeeSalary = Double.parseDouble(scanner.nextLine());

        EmployeeRecord e1 = new EmployeeRecord(employeeId, employeeName,
                employeeDesignation, employeeSalary, employeeAddress);
        e1.showRecord();

        System.out.println();

        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
        e2.showRecord();
    }
}
