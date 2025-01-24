package ParseFile;

public class TXTBatchProcessor extends BatchProcessor{
    @Override
    public FileParser createFileParser() {
        return new TextFileParser();
    }
}
