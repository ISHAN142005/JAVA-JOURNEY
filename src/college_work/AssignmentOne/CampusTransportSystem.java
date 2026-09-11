package college_work.AssignmentOne;

interface PassOperations {
    String getPassType();

    double calculateFinalAmount();
}

abstract class TransportPass implements PassOperations {
    String passID;
    String personName;
    int months;

    TransportPass(String passID, String personName, int months) {
        this.passID = passID;
        this.personName = personName;
        this.months = months;
    }

    abstract double getBaseAmount();

    abstract double getDiscountAmount();
}

class StudentPass extends TransportPass {
    StudentPass(String passID, String personName, int months) {
        super(passID, personName, months);
    }

    @Override
    double getBaseAmount() {
        return 800 * months;
    }

    @Override
    double getDiscountAmount() {
        return months >= 6 ? getBaseAmount() * 0.10 : 0;
    }

    @Override
    public double calculateFinalAmount() {
        return getBaseAmount() - getDiscountAmount();
    }

    @Override
    public String getPassType() {
        return "Student";
    }
}

class FacultyPass extends TransportPass {
    FacultyPass(String passID, String personName, int months) {
        super(passID, personName, months);
    }

    @Override
    double getBaseAmount() {
        return 1200 * months;
    }

    @Override
    double getDiscountAmount() {
        return months >= 12 ? getBaseAmount() * 0.15 : 0;
    }

    @Override
    public double calculateFinalAmount() {
        return getBaseAmount() - getDiscountAmount();
    }

    @Override
    public String getPassType() {
        return "Faculty";
    }
}

class GuestPass extends TransportPass {
    GuestPass(String passID, String personName, int months) {
        super(passID, personName, months);
    }

    @Override
    double getBaseAmount() {
        return 1500 * months;
    }

    @Override
    double getDiscountAmount() {
        return 0;
    }

    @Override
    public double calculateFinalAmount() {
        return getBaseAmount() + 300;
    }

    @Override
    public String getPassType() {
        return "Guest";
    }
}

public class CampusTransportSystem {
    public static void main(String[] args) {
        TransportPass[] passes = {
                new StudentPass("P101", "Aman", 6),
                new FacultyPass("P102", "Dr. Rao", 12),
                new GuestPass("P103", "Guest1", 1),
                new StudentPass("P104", "Simran", 3),
                new FacultyPass("P105", "Dr. Sen", 6),
                new GuestPass("P106", "Guest2", 2),
                new StudentPass("P107", "Rohan", 12),
                new FacultyPass("P108", "Dr. Das", 24)
        };

        double totalRevenue = 0;
        double highestAmount = 0;
        String highestPayer = "";

        for (TransportPass p : passes) {
            double finalAmount = p.calculateFinalAmount();
            totalRevenue += finalAmount;

            System.out.println("Pass ID: " + p.passID);
            System.out.println("Name: " + p.personName);
            System.out.println("Pass Type: " + p.getPassType());
            System.out.println("Duration: " + p.months + " months");
            System.out.println("Base Amount: ₹" + (int) p.getBaseAmount());
            System.out.println("Discount: ₹" + (int) p.getDiscountAmount());
            System.out.println("Final Amount: ₹" + (int) finalAmount + "\n");

            if (finalAmount > highestAmount) {
                highestAmount = finalAmount;
                highestPayer = p.personName;
            }
        }

        System.out.println("At the end:");
        System.out.println("Total Revenue: ₹" + (int) totalRevenue);
        System.out.println("Highest Paying Pass Holder:");
        System.out.println("Name: " + highestPayer);
        System.out.println("Amount: ₹" + (int) highestAmount);
    }
}