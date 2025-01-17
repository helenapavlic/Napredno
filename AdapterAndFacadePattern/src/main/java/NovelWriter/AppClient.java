package NovelWriter;

public class AppClient {
    public static void main(String[] args) {
        NovelWriter novelWriter = new NovelWriter("Famous novel writer");
        novelWriter.writeNovel(1);
        novelWriter.writeNovel(3);


        WriterAdapter writerAdapter = new WriterAdapter(new OldNovelist("Novel writer"));
        writerAdapter.writeNovel(10);
    }
}
