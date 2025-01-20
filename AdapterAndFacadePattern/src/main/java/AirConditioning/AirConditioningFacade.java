package AirConditioning;

public class AirConditioningFacade {
    private SubSystem1 subSystem1 = new SubSystem1();
    private SubSystem2 subSystem2 = new SubSystem2();
    private SubSystem3 subSystem3 = new SubSystem3();
    private SubSystemEnergy subSystemEnergy = new SubSystemEnergy();
    private SubSystemTimer subSystemTimer = new SubSystemTimer();

    public void startAirConditioningSystem() {
        System.out.println("pokretanje klimatizacijskog sustava...");
        subSystem1.setMode("cooling");
        subSystem2.setTemperature(22.5f);
        subSystem2.fanSpeed(3);
        subSystem3.turnIonizer(true);
        subSystemEnergy.on();
        subSystemEnergy.mode("Eco");
        subSystemEnergy.start();
        subSystemTimer.program(2);
        subSystemTimer.on(true);
        System.out.println("klimatizacijski sustav pokrenut!");
    }

    public void stopAirConditioningSystem() {
        System.out.println("Gašenje klimatizacijskog sustava...");
        subSystemTimer.on(false);
        subSystemEnergy.off();
        subSystem3.turnIonizer(false);
        System.out.println("Klimatizacijski sustav isključen.");
    }


}
