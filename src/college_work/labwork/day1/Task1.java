package college_work.labwork.day1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in);

        System.out.println("--- ENTER STUDENT DETAILS ---");

        // 1. byte (Stores whole numbers from -128 to 127)
        System.out.print("Enter Semester (e.g., 2): ");
        byte semester = input.nextByte();

        // 2. short (Stores whole numbers from -32,768 to 32,767)
        System.out.print("Enter Admission Year: ");
        short admissionYear = input.nextShort();
        input.nextLine(); // Consumes the leftover "Enter" key press!

        // 3. String (Stores a sequence of characters)
        System.out.print("Enter Roll No: ");
        String rollNo = input.nextLine();

        // 4. long (Stores huge whole numbers, perfect for 10-digit phone numbers)
        System.out.print("Enter Mobile No (without country code): ");
        long mobileNo = input.nextLong();

        // 5. float (Stores fractional numbers)
        System.out.print("Enter Attendance %: ");
        float attendance = input.nextFloat();

        // 6. double (Stores fractional numbers with double the precision of a float)
        System.out.print("Enter CGPA: ");
        double cgpa = input.nextDouble();

        // 7. char (Stores a single character)
        System.out.print("Enter Section (e.g., A, B): ");
        char section = input.next().charAt(0);

        // 8. boolean (Stores true or false values)
        System.out.print("Are you a hosteller? (true/false): ");
        boolean isHosteller = input.nextBoolean();

        // --- DISPLAYING THE DATA ---
        System.out.println("\n==================================");
        System.out.println("      STUDENT PROFILE SAVED       ");
        System.out.println("==================================");
        System.out.println("Semester:         " + semester);
        System.out.println("Admission Year:   " + admissionYear);
        System.out.println("Roll No:          " + rollNo);
        System.out.println("Mobile No:        " + mobileNo);
        System.out.println("Attendance:       " + attendance + "%");
        System.out.println("CGPA:             " + cgpa);
        System.out.println("Section:          " + section);
        System.out.println("Hosteller:        " + (isHosteller ? "Yes" : "No"));

        // Always close the scanner when done to free up resources
        input.close();
    }
}