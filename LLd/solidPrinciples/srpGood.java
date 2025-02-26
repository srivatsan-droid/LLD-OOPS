package solidPrinciples;
class reportGeneration {
    public void generateReport() {
        System.out.println("Generating Report...");
    }
}
class saveReport {
    public void saveTheReport() {
        System.out.println("Saving the file");
    }
}
public class srpGood {
    public static void main(String[] args) {
        reportGeneration obj = new reportGeneration();
        obj.generateReport();
        saveReport obj2 = new saveReport();
        obj2.saveTheReport();
    }
}
