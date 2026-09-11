package college_work.AssignmentOne;

import java.util.Scanner;

interface Payment {
    double calculateTransactionCharge();

    String getMethodName();

    double getOriginalAmount();
}

abstract class BasePayment implements Payment {
    double amount;

    BasePayment(double amount) {
        this.amount = amount;
    }

    public double getOriginalAmount() {
        return amount;
    }

    double getDiscount() {
        return amount > 10000 ? 200 : 0;
    }
}

class UPI extends BasePayment {
    UPI(double amount) {
        super(amount);
    }

    public double calculateTransactionCharge() {
        return amount * 0.01;
    }

    public String getMethodName() {
        return "UPI";
    }
}

class CreditCard extends BasePayment {
    CreditCard(double amount) {
        super(amount);
    }

    public double calculateTransactionCharge() {
        return amount * 0.025;
    }

    public String getMethodName() {
        return "Credit Card";
    }
}

class NetBanking extends BasePayment {
    NetBanking(double amount) {
        super(amount);
    }

    public double calculateTransactionCharge() {
        return amount * 0.015;
    }

    public String getMethodName() {
        return "Net Banking";
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payment[] transactions = new Payment[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Transaction " + (i + 1) + " Amount: ");
            double amount = sc.nextDouble();
            System.out.println("Method (UPI/CC/NB): ");
            String method = sc.next();

            if (method.equalsIgnoreCase("UPI")) transactions[i] = new UPI(amount);
            else if (method.equalsIgnoreCase("CC")) transactions[i] = new CreditCard(amount);
            else transactions[i] = new NetBanking(amount);
        }

        double maxCharge = 0;
        String maxTransaction = "";

        for (Payment p : transactions) {
            double charge = p.calculateTransactionCharge();
            double discount = ((BasePayment) p).getDiscount();
            double finalAmount = p.getOriginalAmount() + charge - discount;

            System.out.println("Method: " + p.getMethodName());
            System.out.println("Original Amount: " + p.getOriginalAmount());
            System.out.println("Transaction Charge: " + charge);
            System.out.println("Discount: " + discount);
            System.out.println("Final Amount: " + finalAmount + "\n");

            if (charge > maxCharge) {
                maxCharge = charge;
                maxTransaction = p.getMethodName() + " (" + p.getOriginalAmount() + ")";
            }
        }
        System.out.println("Highest transaction charge: " + maxTransaction + " - Charge: " + maxCharge);
        sc.close();
    }
}