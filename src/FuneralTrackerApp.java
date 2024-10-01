import java.util.Scanner;

public class FuneralTrackerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FuneralRecordDAO funeralRecordDAO = new FuneralRecordDAO();

        
        System.out.println("Enter the deceased's name:");
        String name = scanner.nextLine();

        System.out.println("Enter date of birth (YYYY-MM-DD):");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Enter date of death (YYYY-MM-DD):");
        String dateOfDeath = scanner.nextLine();

        System.out.println("Enter place of death:");
        String placeOfDeath = scanner.nextLine();

        System.out.println("Enter cause of death:");
        String causeOfDeath = scanner.nextLine();

        System.out.println("Enter funeral date (YYYY-MM-DD):");
        String funeralDate = scanner.nextLine();

        System.out.println("Enter funeral location:");
        String funeralLocation = scanner.nextLine();

        System.out.println("Enter funeral service provider:");
        String funeralServiceProvider = scanner.nextLine();

        System.out.println("Enter burial or cremation:");
        String burialOrCremation = scanner.nextLine();

        System.out.println("Enter burial plot location or cremation site:");
        String burialPlotLocationOrCremationSite = scanner.nextLine();

        System.out.println("Enter total cost:");
        double totalCost = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter next of kin name:");
        String nextOfKinName = scanner.nextLine();

        System.out.println("Enter next of kin phone:");
        String nextOfKinPhone = scanner.nextLine();

      
        FuneralRecord record = new FuneralRecord(name, dateOfBirth, dateOfDeath, placeOfDeath, causeOfDeath, funeralDate, funeralLocation, funeralServiceProvider, burialOrCremation, burialPlotLocationOrCremationSite, totalCost, nextOfKinName, nextOfKinPhone);

        funeralRecordDAO.insertRecord(record);

        System.out.println("Funeral record added successfully.");

        funeralRecordDAO.getAllRecords().forEach((r) -> {
            System.out.println("Record: " + r.getName());
        });
    }
}
