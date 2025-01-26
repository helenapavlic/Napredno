package Service;

public class SupremeMaster extends Master implements Advisor, Repairer, Maintainer {
    public SupremeMaster(String name) {
        super(name, "SupremeMaster");
    }

    @Override
    public void askForAdvice() {
        System.out.println(description + " asks for advice.");
    }

    @Override
    public void giveAdvice() {
        System.out.println(description + " gives supreme advice.");
    }

    @Override
    public void performRepair() {
        System.out.println(description + " performs a master-level repair.");
    }

    @Override
    public void performMaintenance() {
        System.out.println(description + " performs master-level maintenance.");
    }

    // Evaluate work of other repairmen
    public void evaluateWork(Master master) {
        System.out.println(description + " is evaluating the work of " + master.description + ".");
    }
}
