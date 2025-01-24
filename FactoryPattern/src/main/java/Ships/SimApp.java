package Ships;

public class SimApp {
    public static void main(String[] args) {
        Simulator simulator = new Simulator("Jack","Pearl",25);
        simulator.runSimulation(Simulator.ShipFactoryCreator.createShipFactory(Simulator.ShipFactoryCreator.ShipType.PIRATE));
    }
}
