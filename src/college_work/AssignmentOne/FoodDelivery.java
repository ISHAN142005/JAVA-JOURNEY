package college_work.AssignmentOne;

import java.util.Scanner;

interface PaymentSystem {
    double calculatePayment();
}

abstract class DeliveryPartner implements PaymentSystem {
    int partnerId;
    String name;
    double distanceTravelled;

    DeliveryPartner(int partnerId, String name, double distanceTravelled) {
        this.partnerId = partnerId;
        this.name = name;
        this.distanceTravelled = distanceTravelled;
    }

    double getBonus() {
        return distanceTravelled > 100 ? 500 : 0;
    }

    double getTotalEarnings() {
        return calculatePayment() + getBonus();
    }
}

class BicyclePartner extends DeliveryPartner {
    BicyclePartner(int id, String name, double dist) {
        super(id, name, dist);
    }

    public double calculatePayment() {
        return distanceTravelled * 8;
    }
}

class BikePartner extends DeliveryPartner {
    BikePartner(int id, String name, double dist) {
        super(id, name, dist);
    }

    public double calculatePayment() {
        return (distanceTravelled * 10) + 50;
    }
}

class CarPartner extends DeliveryPartner {
    CarPartner(int id, String name, double dist) {
        super(id, name, dist);
    }

    public double calculatePayment() {
        return (distanceTravelled * 15) + 100;
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeliveryPartner[] partners = new DeliveryPartner[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Partner " + (i + 1) + " Type (Bicycle/Bike/Car): ");
            String type = sc.next();
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Distance: ");
            double dist = sc.nextDouble();

            if (type.equalsIgnoreCase("Bicycle")) partners[i] = new BicyclePartner(id, name, dist);
            else if (type.equalsIgnoreCase("Bike")) partners[i] = new BikePartner(id, name, dist);
            else partners[i] = new CarPartner(id, name, dist);
        }

        double highestEarnings = 0;
        String topPartner = "";

        for (DeliveryPartner dp : partners) {
            double earnings = dp.getTotalEarnings();
            System.out.println(dp.name + " earned: " + earnings);
            if (earnings > highestEarnings) {
                highestEarnings = earnings;
                topPartner = dp.name;
            }
        }

        System.out.println("Partner with highest earnings: " + topPartner);
        sc.close();
    }
}