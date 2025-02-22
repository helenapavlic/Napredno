package GUI_simpleApp;

import java.util.EventObject;

public class DataPanelEvent extends EventObject {

    private int id;
    private String name;
    private String sname;
    private ProgLangEnum prog;
    private ExperienceEnum exp;
    private String wrTme;

    public DataPanelEvent(Object source, Programmer prgm) {
        super(source);

        id = prgm.getId();
        name = prgm.getName();
        sname = prgm.getSname();
        prog = prgm.getProg();
        exp = prgm.getExp();
        wrTme = prgm.getWrTme();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSname() {
        return sname;
    }

    public ProgLangEnum getProg() {
        return prog;
    }

    public ExperienceEnum getExp() {
        return exp;
    }

    public String getWrTme() {
        return wrTme;
    }
}
