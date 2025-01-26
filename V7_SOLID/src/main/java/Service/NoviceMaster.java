package Service;

public class NoviceMaster extends Master implements Advisor, Repairer, Maintainer {
    public NoviceMaster(String name) {
        super(name, "NoviceMaster");
    }

    @Override
    public void askForAdvice() {
        System.out.println(description + " asks for advice.");
    }

    @Override
    public void giveAdvice() {
        System.out.println(description + " gives basic advice.");
    }

    @Override
    public void performRepair() {
        System.out.println(description + " performs a basic repair.");
    }

    @Override
    public void performMaintenance() {
        System.out.println(description + " performs basic maintenance.");
    }
}
