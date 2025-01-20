package AirConditioning;

public class Main {
    public static void main(String[] args) {
        AirConditioningFacade airConditioningFacade = new AirConditioningFacade();

        airConditioningFacade.startAirConditioningSystem();

        airConditioningFacade.stopAirConditioningSystem();

    }
}
