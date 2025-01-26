package OpenSourceProgrammingProject;

import java.util.ArrayList;
import java.util.List;

public class OpenSourceProject implements Project {
    private String projectName;
    private List<Programmer> programmers;

    public OpenSourceProject(String projectName) {
        this.projectName = projectName;
        programmers = new ArrayList<>();
    }

    @Override
    public void addProgrammer(Programmer programmer) {
        if (!programmers.contains(programmer)) {
            programmers.add(programmer);
            System.out.println("added new programer to " + projectName + " : " + programmer);
        } else {
            System.out.println("programmer: " + programmer + " is already in this project!");
        }
    }

    @Override
    public void removeProgrammer(Programmer programmer) {
        if (programmers.contains(programmer)) {
            programmers.remove(programmer);
            System.out.println("programmer: " + programmer + " is removed from project: " + projectName);
        } else {
            System.out.println("Programmer: " + programmer + " is not working on this project: " + projectName);
        }
    }

    @Override
    public void notifyAllProgrammers(Programmer programmer) {
        for (Programmer programmer1 : programmers){
            programmer1.update(projectName,programmer);
        }

    }

    public void makeDifferenceInCode(ProjectProgrammer programmer){
        if (programmers.contains(programmer)){
            System.out.println("Programmer made a difference in code!, " + programmer);
            notifyAllProgrammers(programmer);
        } else {
            System.out.println("This programmer is not working on this project!");
        }
    }
}
