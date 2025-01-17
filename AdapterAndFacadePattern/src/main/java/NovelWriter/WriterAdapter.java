package NovelWriter;

public class WriterAdapter implements WriterInterface {
    private OldNovelist oldNovelist;

    public WriterAdapter(OldNovelist oldNovelist) {
        this.oldNovelist = oldNovelist;
    }

//    ova metoda prima int novel type, za bilo koji integer oldNovelis piše SF novel jer on zna pisat samo SF
    @Override
    public void writeNovel(int novelType) {
        if (novelType == (int) novelType) {
            oldNovelist.writeSFNovel();
        } else {
            System.out.println("input needs to be an integer");
        }
    }
}
