import java.util.ArrayList;
import java.util.List;

public class FuneralRecordDAO {
    
    List<FuneralRecord> records = new ArrayList<>();


    public void insertRecord(FuneralRecord record) {
        records.add(record);
        System.out.println("Funeral record for " + record.getName() + " added successfully.");
    }

    
    public List<FuneralRecord> getAllRecords() {
        return records;
    }
}
