package ParseFile;

public class CSVBatchProcessor extends BatchProcessor{
    @Override
    public FileParser createFileParser() {
        return new CSVFileParser();
    }
}
