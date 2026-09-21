package college_work.TechStoreInventory;

import java.util.Scanner;

public class TechStoreInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store store = new Store();

        store.addItem(new Electronic("Laptop", 55000.0, 5, 12));
        store.addItem(new Accessory("Mouse", 500.0, 20, "USB"));

        int choice = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n===== TechStore Inventory Menu =====");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. List Items");
            System.out.println("4. Search Item");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter item type (1-Electronic, 2-Accessory): ");
                    int type = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter quantity: ");
                    int quantity = Integer.parseInt(scanner.nextLine());

                    if (type == 1) {
                        System.out.print("Enter warranty (months): ");
                        int warranty = Integer.parseInt(scanner.nextLine());
                        store.addItem(new Electronic(name, price, quantity, warranty));
                    } else if (type == 2) {
                        System.out.print("Enter compatible with: ");
                        String compatible = scanner.nextLine();
                        store.addItem(new Accessory(name, price, quantity, compatible));
                    } else {
                        System.out.println("Invalid type.");
                    }
                    break;

                case 2:
                    System.out.print("Enter name of item to remove: ");
                    String removeName = scanner.nextLine();
                    store.removeItem(removeName);
                    break;

                case 3:
                    store.listItems();
                    break;

                case 4:
                    System.out.print("Enter name of item to search: ");
                    String searchName = scanner.nextLine();
                    store.searchItem(searchName);
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
