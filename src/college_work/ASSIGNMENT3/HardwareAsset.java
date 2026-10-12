package college_work.ASSIGNMENT3;

public class HardwareAsset extends Asset {
    private String serialNumber;

    public HardwareAsset(String id, String name, String serialNumber) {
        super(id, name);
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", Serial: " + serialNumber;
    }
}