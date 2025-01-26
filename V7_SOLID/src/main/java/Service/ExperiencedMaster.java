package Service;
public class ExperiencedMaster extends Master implements Advisor, Repairer, Maintainer {
    public ExperiencedMaster(String name) {
        super(name, "ExperiencedMaster");
    }

    @Override
    public void askForAdvice() {
        System.out.println(description + " asks for advice.");
    }

    @Override
    public void giveAdvice() {
        System.out.println(description + " gives expert advice.");
    }

    @Override
    public void performRepair() {
        System.out.println(description + " performs an advanced repair.");
    }

    @Override
    public void performMaintenance() {
        System.out.println(description + " performs advanced maintenance.");
    }
}

