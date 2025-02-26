package solidPrinciples;
/*
Single responsibility principle means a class can have only one reason to change
 */
class Report {
    public void generateReport() {
        System.out.println("Generating Report");
    }
    public void saveToFile() {
        System.out.println("Saving the report to the file");
    }
}
public class badSRP {
    public static void main(String[] args) {
        Report obj = new Report();
        obj.generateReport();
        obj.saveToFile();
    }
}
