package college_work.AssignmentOne;

abstract class Patient {
    int id;
    String name;
    int days;

    Patient(int id, String name, int days) {
        this.id = id;
        this.name = name;
        this.days = days;
    }

    abstract double calculateBill();
}

class GeneralTreatment extends Patient {
    GeneralTreatment(int id, String name, int days) {
        super(id, name, days);
    }

    @Override
    double calculateBill() {
        return 500 + (1000 * days);
    }
}

class EmergencyTreatment extends Patient {
    EmergencyTreatment(int id, String name, int days) {
        super(id, name, days);
    }

    @Override
    double calculateBill() {
        return 1000 + (2000 * days) + 2500;
    }
}

class ICUTreatment extends Patient {
    ICUTreatment(int id, String name, int days) {
        super(id, name, days);
    }

    @Override
    double calculateBill() {
        return 1500 + (5000 * days) + (2000 * days);
    }
}

public class HospitalBilling {
    public static void main(String[] args) {
        Patient[] patients = {
                new GeneralTreatment(101, "Rohan", 3),
                new EmergencyTreatment(102, "Karan", 1),
                new ICUTreatment(103, "Aditi", 5),
                new GeneralTreatment(104, "Meera", 2),
                new ICUTreatment(105, "Suresh", 7)
        };

        double maxBill = 0;
        String maxPatient = "";

        for (Patient p : patients) {
            double bill = p.calculateBill();
            System.out.println("Patient: " + p.name + " | Bill: " + bill);

            if (bill > maxBill) {
                maxBill = bill;
                maxPatient = p.name;
            }
        }

        System.out.println("Patient with highest bill: " + maxPatient + " (" + maxBill + ")");
    }
}