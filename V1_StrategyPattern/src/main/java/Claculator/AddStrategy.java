package Claculator;

public class AddStrategy implements CalculationStrategy {

    public AddStrategy() {
    }

    @Override
    public double calculation(double a, double b) {
        return a + b;
    }
}
