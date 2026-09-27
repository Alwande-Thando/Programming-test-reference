class RoadAccidents {
    protected String vehicleType;
    protected String city;
    protected int numberOfAccidents;

    public RoadAccidents(String vehicleType, String city, int numberOfAccidents) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.numberOfAccidents = numberOfAccidents;
    }
}

class RoadAccidentReport extends RoadAccidents {
    public RoadAccidentReport(String vehicleType, String city, int numberOfAccidents) {
        super(vehicleType, city, numberOfAccidents);
    }

    public void printAccidentReport() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("City: " + city);
        System.out.println("Number of Accidents: " + numberOfAccidents);
    }
}

public class AccidentReportExample {
    public static void main(String[] args) {
        RoadAccidentReport report =
                new RoadAccidentReport("Car", "Cape Town", 25);

        report.printAccidentReport();
    }
}
