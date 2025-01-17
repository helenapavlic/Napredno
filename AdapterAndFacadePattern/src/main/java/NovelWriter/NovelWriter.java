package NovelWriter;

public class NovelWriter implements WriterInterface {
    private String writerName;

    public NovelWriter(String writerName) {
        this.writerName = writerName;
    }

    @Override
    public void writeNovel(int novelType) {
        if (novelType == 1) {
            System.out.println("writer " + writerName + " is writing history novel");

        } else if (novelType == 2) {
            System.out.println("writer " + writerName + " is writing romance novel");

        } else if (novelType == 3) {
            System.out.println("writer " + writerName + " is writing triller novel");

        } else {
            System.out.println("there is no such novel type");
        }
    }

    @Override
    public String toString() {
        return "NovelWriter{" +
                "writerName='" + writerName + '\'' +
                '}';
    }
}
