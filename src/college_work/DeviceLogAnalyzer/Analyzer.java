package college_work.DeviceLogAnalyzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Analyzer {
    private ArrayList<DeviceRecord> records;

    public Analyzer() {
        records = new ArrayList<DeviceRecord>();
    }

    public void addRecord(DeviceRecord record) {
        records.add(record);
    }

    public void listAllRecords() {
        if (records.isEmpty()) {
            System.out.println("No records available.");
            return;
        }
        for (DeviceRecord record : records) {
            record.display();
        }
    }

    public void countByStatusCode() {
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

        for (DeviceRecord record : records) {
            int code = record.getStatusCode();
            if (countMap.containsKey(code)) {
                countMap.put(code, countMap.get(code) + 1);
            } else {
                countMap.put(code, 1);
            }
        }

        for (Integer code : countMap.keySet()) {
            System.out.println("Status Code " + code + ": " + countMap.get(code) + " record(s)");
        }
    }

    public void findByDeviceId(String deviceId) {
        boolean found = false;
        for (DeviceRecord record : records) {
            if (record.getDeviceId().equalsIgnoreCase(deviceId)) {
                record.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No records found for device: " + deviceId);
        }
    }

    public void showStatistics() {
        if (records.isEmpty()) {
            System.out.println("No records available.");
            return;
        }

        String earliest = records.get(0).getTimestamp();
        String latest = records.get(0).getTimestamp();

        for (int i = 1; i < records.size(); i++) {
            String current = records.get(i).getTimestamp();
            if (current.compareTo(earliest) < 0) {
                earliest = current;
            }
            if (current.compareTo(latest) > 0) {
                latest = current;
            }
        }

        System.out.println("Earliest Timestamp: " + earliest);
        System.out.println("Latest Timestamp: " + latest);
    }
}