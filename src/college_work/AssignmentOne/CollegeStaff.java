package college_work.AssignmentOne;

interface Responsibility {
    String getDescription();
}

abstract class Staff {
    int id;
    String name;
    double basicSalary;

    Staff(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    abstract double calculateSalary();
}

class Faculty extends Staff implements Responsibility {
    Faculty(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + (basicSalary * 0.25) + (basicSalary * 0.15);
    }

    @Override
    public String getDescription() {
        return "Teaching and Research";
    }
}

class LabAssistant extends Staff implements Responsibility {
    LabAssistant(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + (basicSalary * 0.20) + 3000;
    }

    @Override
    public String getDescription() {
        return "Maintaining Labs and assisting students";
    }
}

class AdministrativeStaff extends Staff implements Responsibility {
    AdministrativeStaff(int id, String name, double basicSalary) {
        super(id, name, basicSalary);
    }

    @Override
    double calculateSalary() {
        return basicSalary + (basicSalary * 0.20) + 2000;
    }

    @Override
    public String getDescription() {
        return "Managing college administration operations";
    }
}

public class CollegeStaff {
    public static void main(String[] args) {
        Staff[] staffList = {
                new Faculty(1, "Dr. Sharma", 50000),
                new LabAssistant(2, "Ramesh", 25000),
                new AdministrativeStaff(3, "Sunita", 30000)
        };

        double highestSal = 0;
        String highestEarner = "";

        for (Staff s : staffList) {
            double sal = s.calculateSalary();
            System.out.println("ID: " + s.id + " | Name: " + s.name);
            System.out.println("Responsibility: " + ((Responsibility) s).getDescription());
            System.out.println("Salary: " + sal + "\n");

            if (sal > highestSal) {
                highestSal = sal;
                highestEarner = s.name;
            }
        }
        System.out.println("Highest Salary Employee: " + highestEarner);
    }
}