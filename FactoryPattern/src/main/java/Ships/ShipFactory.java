package Ships;

public interface ShipFactory {
    Captain createCaptain(String name);
    Ship createShip(String name);
    Crew createCrew(int num);
    PropulsionSystem createPropulsionSystem();
}
