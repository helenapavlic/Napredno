package OpenSourceProgrammingProject;

public class ProjectProgrammer implements Programmer {
    private static int cntId = 100;
    private String name;
    private int id;

    public ProjectProgrammer(String name) {
        this.name = name;
        this.id = cntId++;
    }

    @Override
    public void update(String projectName, Programmer programmer) {
        System.out.println(name + " got notification: ");
        System.out.println("Programmer: " + programmer + " made a change in code on project: " + projectName);
    }

    @Override
    public String toString() {
        return "ProjectProgrammer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
