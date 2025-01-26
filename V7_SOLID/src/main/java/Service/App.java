package Service;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Master> masters = new ArrayList<>();
        masters.add(new Apprentice("Stipe"));
        masters.add(new NoviceMaster("Marko"));
        masters.add(new ExperiencedMaster("Josipa"));
        masters.add(new SupremeMaster("Vedrana"));

        // Iterate over all Masters
        for (Master master : masters) {
            master.bringTools();
            if (master instanceof Advisor advisor) {
                advisor.askForAdvice();
                try {
                    advisor.giveAdvice();
                } catch (UnsupportedOperationException e) {
                    System.out.println(e.getMessage());
                }
            }
            if (master instanceof Repairer repairer) {
                repairer.performRepair();
            }
            if (master instanceof Maintainer maintainer) {
                maintainer.performMaintenance();
            }
        }

        // SupremeMaster evaluates others
        SupremeMaster supreme = (SupremeMaster) masters.get(3);
        for (Master master : masters) {
            if (!master.equals(supreme)) {
                supreme.evaluateWork(master);
            }
        }
    }
}
