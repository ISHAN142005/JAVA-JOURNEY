package college_work.DeviceLogAnalyzer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LogParser parser = new LogParser();
        Analyzer analyzer = new Analyzer();

        String[] sampleData = {
                "D1,2024-01-01,200,OK",
                "D2,2024-01-02,404,Not Found",
                "D1,2024-01-03,500,Server Error",
                "D3,2024-01-04,200,OK",
                "D2,2024-01-05,200,OK",
                "D4,2024-01-06,403,Forbidden",
                "D1,2024-01-07,200,OK",
                "D5,2024-01-08,500,Server Error",
                "D3,2024-01-09,404,Not Found",
                "D4,2024-01-10,200,OK",
                "BAD_RECORD",
                "D6,2024-01-12,abc,Invalid Status"
        };

        for (String line : sampleData) {
            try {
                DeviceRecord record = parser.parseFromCsvLine(line);
                analyzer.addRecord(record);
            } catch (InvalidRecordException e) {
                System.out.println("Skipping malformed record: " + e.getMessage());
            }
        }

        boolean running = true;

        try {
            while (running) {
                System.out.println("\n===== Device Log Analyzer Menu =====");
                System.out.println("1. List All Records");
                System.out.println("2. Count Records by Status Code");
                System.out.println("3. Find Records by Device ID");
                System.out.println("4. Show Statistics");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice;
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    continue;
                }

                switch (choice) {
                    case 1:
                        analyzer.listAllRecords();
                        break;

                    case 2:
                        analyzer.countByStatusCode();
                        break;

                    case 3:
                        System.out.print("Enter device ID: ");
                        String deviceId = scanner.nextLine();
                        analyzer.findByDeviceId(deviceId);
                        break;

                    case 4:
                        analyzer.showStatistics();
                        break;

                    case 5:
                        running = false;
                        System.out.println("Exiting program. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } finally {
            scanner.close();
        }
    }
}