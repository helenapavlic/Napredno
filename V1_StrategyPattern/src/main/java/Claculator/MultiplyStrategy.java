package Claculator;

public class MultiplyStrategy implements CalculationStrategy {

    public MultiplyStrategy() {
    }

    @Override
    public double calculation(double a, double b) {
        return a * b;
    }
}
