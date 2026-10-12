package college_work.ASSIGNMENT3;

import java.util.TreeSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AssetManager<Asset> manager = new AssetManager<>();

        HardwareAsset laptop = new HardwareAsset("H1", "Dell XPS", "SN12345");
        laptop.addTag("Laptop");
        laptop.addTag("Workstation");

        SoftwareAsset office = new SoftwareAsset("S1", "Office 365", "KEY-98765");
        office.addTag("Productivity");

        HardwareAsset mouse = new HardwareAsset("H2", "Logitech Mouse", "SN99999");

        manager.add(laptop);
        manager.add(office);
        manager.add(mouse);

        manager.add(laptop);

        System.out.println("--- All Assets (Iterator) ---");
        manager.printAllUsingIterator();

        System.out.println("\n--- Search by ID (S1) ---");
        Asset found = manager.search("S1");
        System.out.println(found);

        System.out.println("\n--- Update Asset (H2) ---");
        mouse.setName("Logitech MX Master");
        manager.update(mouse);
        System.out.println(manager.search("H2"));

        System.out.println("\n--- Remove Asset (H2) ---");
        manager.remove("H2");

        System.out.println("\n--- Sorted Assets (Enhanced For-Loop) ---");
        TreeSet<Asset> sorted = manager.getSortedAssets();
        for (Asset a : sorted) {
            System.out.println(a);
        }

        System.out.println("\n--- Filter by Name (Dell) Using Streams ---");
        List<Asset> filtered = manager.filterByName("Dell");
        for (Asset a : filtered) {
            System.out.println(a);
        }
    }
}