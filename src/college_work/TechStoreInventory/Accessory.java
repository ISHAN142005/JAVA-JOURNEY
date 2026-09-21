package college_work.TechStoreInventory;

public class Accessory extends Item {
    private String compatibleWith;

    public Accessory(String name, double price, int quantity, String compatibleWith) {
        super(name, price, quantity);
        this.compatibleWith = compatibleWith;
    }

    public String getCompatibleWith() {
        return compatibleWith;
    }

    public void setCompatibleWith(String compatibleWith) {
        this.compatibleWith = compatibleWith;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Compatible With: " + compatibleWith);
    }
}
