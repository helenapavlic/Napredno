package Claculator;

public class SubsStrategy implements CalculationStrategy {

    public SubsStrategy() {
    }

    @Override
    public double calculation(double a, double b) {
        return a - b;
    }
}
