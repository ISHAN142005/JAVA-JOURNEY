package college_work.DeviceLogAnalyzer;

public class DeviceRecord {
    private String deviceId;
    private String timestamp;
    private int statusCode;
    private String message;

    public DeviceRecord(String deviceId, String timestamp, int statusCode, String message) {
        this.deviceId = deviceId;
        this.timestamp = timestamp;
        this.statusCode = statusCode;
        this.message = message;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void display() {
        System.out.println("Device: " + deviceId + ", Time: " + timestamp + ", Status: " + statusCode + ", Message: " + message);
    }
}