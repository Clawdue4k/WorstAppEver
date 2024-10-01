public class FuneralRecord {
    
    String name;
    String dateOfBirth;
    String dateOfDeath;
    String placeOfDeath;
    String causeOfDeath;
    String funeralDate;
    String funeralLocation;
    String funeralServiceProvider;
    String burialOrCremation;
    String burialPlotLocation;
    String cremationSite;
    double totalCost;
    String nextOfKinName;
    String nextOfKinPhone;

    // Constructor
    public FuneralRecord(String name, String dateOfBirth, String dateOfDeath, String placeOfDeath, String causeOfDeath,
                         String funeralDate, String funeralLocation, String funeralServiceProvider, String burialOrCremation,
                         String burialPlotLocation, String cremationSite, double totalCost, String nextOfKinName, String nextOfKinPhone) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.placeOfDeath = placeOfDeath;
        this.causeOfDeath = causeOfDeath;
        this.funeralDate = funeralDate;
        this.funeralLocation = funeralLocation;
        this.funeralServiceProvider = funeralServiceProvider;
        this.burialOrCremation = burialOrCremation;
        this.burialPlotLocation = burialPlotLocation;
        this.cremationSite = cremationSite;
        this.totalCost = totalCost;
        this.nextOfKinName = nextOfKinName;
        this.nextOfKinPhone = nextOfKinPhone;
    }

    FuneralRecord(String name, String dateOfBirth, String dateOfDeath, String placeOfDeath, String causeOfDeath, String funeralDate, String funeralLocation, String funeralServiceProvider, String burialOrCremation, String burialPlotLocationOrCremationSite, double totalCost, String nextOfKinName, String nextOfKinPhone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
