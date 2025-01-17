package NovelWriter;

public class OldNovelist {

    private String novelistName;

    public OldNovelist(String novelistName) {
        this.novelistName = novelistName;

    }

    public void writeSFNovel() {
        System.out.println(novelistName + " is writing SF novel!");
    }

    @Override
    public String toString() {
        return "OldNovelist{" +
                "novelistName='" + novelistName + '\'' +
                '}';
    }
}
