package ParseFile;

import java.io.File;
import java.util.List;

public class CSVFileParser implements FileParser{
    public CSVFileParser() {
        System.out.println("\n creating CSV file parser...");
    }

    @Override
    public List<Record> parse(File file) {
        System.out.println("Parsing process specific to the CSV file type!!!");
        System.out.println("Parsing file -> " + file.toString() + " and creating records...");
        return null;
    }
}
