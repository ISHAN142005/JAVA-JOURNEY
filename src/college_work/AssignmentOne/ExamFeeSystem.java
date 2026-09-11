package college_work.AssignmentOne;

import java.util.Scanner;

abstract class Student {
    int rollNo;
    String name;
    String course;

    Student(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    abstract double calculateFinalAmount();

    abstract void displayBreakup();

    abstract String getCategory();
}

class RegularStudent extends Student {
    RegularStudent(int rollNo, String name, String course) {
        super(rollNo, name, course);
    }

    @Override
    double calculateFinalAmount() {
        return 1200 + 300;
    }

    @Override
    void displayBreakup() {
        System.out.println("Exam Fee: 1200\nLab Fee: 300");
    }

    @Override
    String getCategory() {
        return "Regular";
    }
}

class ScholarshipStudent extends Student {
    ScholarshipStudent(int rollNo, String name, String course) {
        super(rollNo, name, course);
    }

    @Override
    double calculateFinalAmount() {
        return (1200 * 0.5) + 300;
    }

    @Override
    void displayBreakup() {
        System.out.println("Exam Fee: 1200\nConcession: 600\nLab Fee: 300");
    }

    @Override
    String getCategory() {
        return "Scholarship";
    }
}

class SupplementaryStudent extends Student {
    SupplementaryStudent(int rollNo, String name, String course) {
        super(rollNo, name, course);
    }

    @Override
    double calculateFinalAmount() {
        return 1500 + 300 + 200;
    }

    @Override
    void displayBreakup() {
        System.out.println("Exam Fee: 1500\nLab Fee: 300\nProcessing Fee: 200");
    }

    @Override
    String getCategory() {
        return "Supplementary";
    }
}

public class ExamFeeSystem {
    public static void main(String[] args) {
        Student[] students = {
                new RegularStudent(1, "Aarav", "BTech"),
                new ScholarshipStudent(21, "Riya", "BSc"),
                new SupplementaryStudent(3, "Kabir", "BCom"),
                new RegularStudent(4, "Sneha", "BA"),
                new ScholarshipStudent(5, "Pooja", "BTech"),
                new SupplementaryStudent(6, "Vikram", "BCA")
        };

        double highestAmount = 0;
        String highestStudent = "";

        for (Student s : students) {
            System.out.println("Roll No: " + s.rollNo);
            System.out.println("Name: " + s.name);
            System.out.println("Category: " + s.getCategory());
            s.displayBreakup();
            double finalAmount = s.calculateFinalAmount();
            System.out.println("Final Amount: " + (int) finalAmount + "\n");

            if (finalAmount > highestAmount) {
                highestAmount = finalAmount;
                highestStudent = s.name;
            }
        }

        System.out.println("Student with highest payable amount: " + highestStudent + " (" + (int) highestAmount + ")");
    }
}