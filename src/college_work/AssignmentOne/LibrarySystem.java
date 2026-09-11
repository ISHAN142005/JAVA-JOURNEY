package college_work.AssignmentOne;

import java.util.Scanner;

abstract class LibraryMember {
    String name;

    LibraryMember(String name) {
        this.name = name;
    }

    abstract int getMaxBooks();

    abstract double calculateFine(int daysLate);

    boolean issueBooks(int count) {
        if (count > getMaxBooks()) {
            System.out.println("Book issue limit exceeded for " + name);
            return false;
        }
        System.out.println("Issue accepted for " + name);
        return true;
    }
}

class StudentMember extends LibraryMember {
    StudentMember(String name) {
        super(name);
    }

    @Override
    int getMaxBooks() {
        return 3;
    }

    @Override
    double calculateFine(int daysLate) {
        return daysLate * 5;
    }
}

class FacultyMember extends LibraryMember {
    FacultyMember(String name) {
        super(name);
    }

    @Override
    int getMaxBooks() {
        return 10;
    }

    @Override
    double calculateFine(int daysLate) {
        return daysLate * 2;
    }
}

class ResearchScholar extends LibraryMember {
    ResearchScholar(String name) {
        super(name);
    }

    @Override
    int getMaxBooks() {
        return 8;
    }

    @Override
    double calculateFine(int daysLate) {
        return daysLate * 3;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryMember[] members = {
                new StudentMember("Alice"),
                new FacultyMember("Dr. Bob"),
                new ResearchScholar("Charlie")
        };

        int[] requestedBooks = {4, 5, 8};
        int[] lateDays = {2, 10, 5};

        double maxFine = 0;
        String maxFinePayer = "";

        for (int i = 0; i < members.length; i++) {
            boolean accepted = members[i].issueBooks(requestedBooks[i]);
            if (accepted) {
                double fine = members[i].calculateFine(lateDays[i]);
                System.out.println(members[i].name + " paid fine: " + fine);
                if (fine > maxFine) {
                    maxFine = fine;
                    maxFinePayer = members[i].name;
                }
            }
        }

        System.out.println("Member who paid maximum fine: " + maxFinePayer);
    }
}