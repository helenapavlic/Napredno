package OpenSourceProgrammingProject;

public class App {
    public static void main(String[] args) {
//         kreiraj projekt
        OpenSourceProject openSourceProject = new OpenSourceProject("Calculator");

//        kreiraj programere
        ProjectProgrammer programmer1 = new ProjectProgrammer("Ana");
        ProjectProgrammer programmer2 = new ProjectProgrammer("Lana");
        ProjectProgrammer programmer3 = new ProjectProgrammer("Nina");

//        prijavi programere na projekt
        openSourceProject.addProgrammer(programmer1);
        openSourceProject.addProgrammer(programmer2);
        openSourceProject.addProgrammer(programmer3);

        System.out.println("---------------------------------------");

//        pokreni promjenu u kodu
        openSourceProject.makeDifferenceInCode(programmer1);
        openSourceProject.makeDifferenceInCode(programmer3);

        System.out.println("---------------------------------------");


//        odjavi progreamera
        openSourceProject.removeProgrammer(programmer1);

        System.out.println("---------------------------------------");

//        nova promjena u kodu
        openSourceProject.makeDifferenceInCode(programmer1);

    }
}
