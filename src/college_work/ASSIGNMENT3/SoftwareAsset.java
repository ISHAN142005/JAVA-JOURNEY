package college_work.ASSIGNMENT3;

public class SoftwareAsset extends Asset {
    private String licenseKey;

    public SoftwareAsset(String id, String name, String licenseKey) {
        super(id, name);
        this.licenseKey = licenseKey;
    }

    public String getLicenseKey() {
        return licenseKey;
    }

    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    @Override
    public String toString() {
        return super.toString() + ", License: " + licenseKey;
    }
}