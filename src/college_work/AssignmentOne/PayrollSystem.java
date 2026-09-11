package college_work.AssignmentOne;

import java.util.Scanner;

class Employee {
    int id;
    String name;
    double basicSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    String getType() {
        return "Unknown";
    }
}

class PermanentEmployee extends Employee {
    PermanentEmployee(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + (basicSalary * 0.20) + (basicSalary * 0.10);
    }

    @Override
    String getType() {
        return "Permanent";
    }
}

class ContractEmployee extends Employee {
    ContractEmployee(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + 5000;
    }

    @Override
    String getType() {
        return "Contract";
    }
}

class Intern extends Employee {
    Intern(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    @Override
    double calculateSalary() {
        return 15000;
    }

    @Override
    String getType() {
        return "Intern";
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Employee " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Type (Permanent/Contract/Intern): ");
            String type = sc.next();
            System.out.print("Basic Salary: ");
            double basic = sc.nextDouble();

            if (type.equalsIgnoreCase("Permanent")) {
                employees[i] = new PermanentEmployee(id, name, basic);
            } else if (type.equalsIgnoreCase("Contract")) {
                employees[i] = new ContractEmployee(id, name, basic);
            } else {
                employees[i] = new Intern(id, name, basic);
            }
        }

        double highestSalary = 0;
        String highestEarner = "";

        for (Employee emp : employees) {
            double finalSalary = emp.calculateSalary();
            System.out.println(emp.id + " " + emp.name + " " + emp.getType() + " Salary = " + (int) finalSalary);

            if (finalSalary > highestSalary) {
                highestSalary = finalSalary;
                highestEarner = emp.name;
            }
        }

        System.out.println("Highest Salary:");
        System.out.println(highestEarner + " - " + (int) highestSalary);
        sc.close();
    }
}