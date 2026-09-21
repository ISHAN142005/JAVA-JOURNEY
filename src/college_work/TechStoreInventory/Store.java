package college_work.TechStoreInventory;

import java.util.ArrayList;

public class Store {
    private ArrayList<Item> items;

    public Store() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item added successfully.");
    }

    public void removeItem(String name) {
        boolean found = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equalsIgnoreCase(name)) {
                items.remove(i);
                found = true;
                System.out.println("Item removed successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found.");
        }
    }

    public void listItems() {
        if (items.isEmpty()) {
            System.out.println("No items in inventory.");
        } else {
            for (int i = 0; i < items.size(); i++) {
                items.get(i).displayInfo();
                System.out.println("-------------------------");
            }
        }
    }

    public void searchItem(String name) {
        boolean found = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equalsIgnoreCase(name)) {
                items.get(i).displayInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found.");
        }
    }
}
