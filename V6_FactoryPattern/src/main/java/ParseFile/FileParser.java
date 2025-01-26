package ParseFile;

import java.io.File;
import java.util.List;

public interface FileParser {
    List<Record> parse(File file);
}
