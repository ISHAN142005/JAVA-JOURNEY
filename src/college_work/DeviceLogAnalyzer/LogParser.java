package college_work.DeviceLogAnalyzer;

import java.util.Map;

public class LogParser {

    public DeviceRecord parseFromCsvLine(String line) throws InvalidRecordException {
        String[] parts = line.split(",");

        if (parts.length != 4) {
            throw new InvalidRecordException("Invalid record format: " + line);
        }

        String deviceId = parts[0].trim();
        String timestamp = parts[1].trim();
        String statusCodeStr = parts[2].trim();
        String message = parts[3].trim();

        if (deviceId.isEmpty() || timestamp.isEmpty() || message.isEmpty()) {
            throw new InvalidRecordException("Missing fields in record: " + line);
        }

        int statusCode;
        try {
            statusCode = Integer.parseInt(statusCodeStr);
        } catch (NumberFormatException e) {
            throw new InvalidRecordException("Invalid status code in record: " + line);
        }

        return new DeviceRecord(deviceId, timestamp, statusCode, message);
    }

    public DeviceRecord parseFromMap(Map<String, String> map) throws InvalidRecordException {
        String deviceId = map.get("deviceId");
        String timestamp = map.get("timestamp");
        String statusCodeStr = map.get("statusCode");
        String message = map.get("message");

        if (deviceId == null || timestamp == null || statusCodeStr == null || message == null) {
            throw new InvalidRecordException("Missing fields in map record.");
        }

        int statusCode;
        try {
            statusCode = Integer.parseInt(statusCodeStr);
        } catch (NumberFormatException e) {
            throw new InvalidRecordException("Invalid status code in map record.");
        }

        return new DeviceRecord(deviceId, timestamp, statusCode, message);
    }
}