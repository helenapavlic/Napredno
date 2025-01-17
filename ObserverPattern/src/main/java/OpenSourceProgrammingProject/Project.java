package OpenSourceProgrammingProject;

import java.util.List;

public interface Project {

    void addProgrammer(Programmer programmer);

    void removeProgrammer(Programmer programmer);

    void notifyAllProgrammers(Programmer programmer);

}
