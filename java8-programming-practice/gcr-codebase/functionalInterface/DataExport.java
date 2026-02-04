package functionalInterface;

interface DataExporter {

    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exporting data to JSON");
    }
}

class ReportExporter implements DataExporter {

    public void exportToCSV() {
        System.out.println("Exported CSV");
    }

    public void exportToPDF() {
        System.out.println("Exported PDF");
    }
}

public class DataExport {
    public static void main(String[] args) {
        DataExporter exporter = new ReportExporter();
        exporter.exportToCSV();
        exporter.exportToJSON();

    }
}
