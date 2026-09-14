package college_work.classwork;

import java.util.Scanner;

class Order {
    private String orderId;
    private double baseAmount;
    private ShippingAddress address;

    public Order(String orderId, double baseAmount, String city, int pinCode) {
        this.orderId = orderId;
        this.baseAmount = baseAmount;
        this.address = new ShippingAddress(city, pinCode);
    }

    public double calculateFinalBill() {
        return baseAmount + (baseAmount * 0.05);
    }

    public void displayDetails() {
        System.out.println("\n=============================");
        System.out.println("        ORDER SUMMARY        ");
        System.out.println("=============================");
        System.out.println("Order ID        : " + orderId);
        System.out.println("Shipping City   : " + address.city);
        System.out.println("Final Bill      : $" + String.format("%.2f", calculateFinalBill()));
    }

    protected double getBaseAmount() {
        return baseAmount;
    }

    protected ShippingAddress getAddress() {
        return address;
    }

    public class ShippingAddress {
        String city;
        int pinCode;

        public ShippingAddress(String city, int pinCode) {
            this.city = city;
            this.pinCode = pinCode;
        }

        public boolean isDeliverable() {
            return (pinCode >= 100000 && pinCode <= 999999);
        }
    }
}

class PremiumOrder extends Order {
    private double discountRate;

    public PremiumOrder(String orderId, double baseAmount, String city, int pinCode, double discountRate) {
        super(orderId, baseAmount, city, pinCode);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateFinalBill() {
        if (getAddress().isDeliverable()) {
            double discountAmount = getBaseAmount() * (discountRate / 100.0);
            double discountedBase = getBaseAmount() - discountAmount;
            return discountedBase + (discountedBase * 0.05);
        } else {
            return 0.0;
        }
    }

    @Override
    public void displayDetails() {
        if (getAddress().isDeliverable()) {
            super.displayDetails();
            System.out.println("Premium Discount: " + discountRate + "% Applied");
            System.out.println("=============================\n");
        } else {
            System.out.println("\n=============================");
            System.out.println("        ORDER SUMMARY        ");
            System.out.println("=============================");
            System.out.println("Error: Address is not deliverable.");
            System.out.println("Reason: Invalid Pin Code entered.");
            System.out.println("=============================\n");
        }
    }
}

public class OrderProcessingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Enter Order Information ---");

        System.out.print("Enter Order ID: ");
        String orderId = scanner.nextLine();

        System.out.print("Enter Base Amount: ");
        double baseAmount = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter Shipping City: ");
        String city = scanner.nextLine();

        System.out.print("Enter Pin Code (6 digits): ");
        int pinCode = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Premium Discount Rate (%): ");
        double discountRate = Double.parseDouble(scanner.nextLine());

        PremiumOrder order = new PremiumOrder(orderId, baseAmount, city, pinCode, discountRate);
        order.displayDetails();

        scanner.close();
    }
}