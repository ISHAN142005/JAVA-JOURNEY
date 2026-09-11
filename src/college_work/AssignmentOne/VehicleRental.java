package college_work.AssignmentOne;

abstract class Vehicle {
    String vehicleNumber;
    String customerName;

    Vehicle(String vehicleNumber, String customerName) {
        this.vehicleNumber = vehicleNumber;
        this.customerName = customerName;
    }

    abstract double calculateCost(int days);
}

class Bike extends Vehicle {
    Bike(String vehicleNumber, String customerName) {
        super(vehicleNumber, customerName);
    }

    @Override
    double calculateCost(int days) {
        return 500 * days;
    }
}

class Car extends Vehicle {
    Car(String vehicleNumber, String customerName) {
        super(vehicleNumber, customerName);
    }

    @Override
    double calculateCost(int days) {
        return (1200 * days) + (200 * days);
    }
}

class SUV extends Vehicle {
    SUV(String vehicleNumber, String customerName) {
        super(vehicleNumber, customerName);
    }

    @Override
    double calculateCost(int days) {
        return (2000 * days) + (400 * days) + 1000;
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Vehicle[] fleet = {
                new Bike("KA01-1234", "Raj"),
                new Car("DL02-5678", "Simran"),
                new SUV("MH03-9012", "Vikram"),
                new Car("TN04-3456", "Anita"),
                new Bike("UP05-7890", "Deepak"),
                new SUV("RJ06-1122", "Priya")
        };

        int rentalDays = 4;
        double maxRent = 0;
        String topVehicle = "";

        for (Vehicle v : fleet) {
            double cost = v.calculateCost(rentalDays);
            System.out.println(v.customerName + " (" + v.vehicleNumber + ") Cost: " + cost);
            if (cost > maxRent) {
                maxRent = cost;
                topVehicle = v.vehicleNumber;
            }
        }

        System.out.println("\nVehicle with maximum rental amount: " + topVehicle);
    }
}