package Claculator;

public class DivisionStrategy implements CalculationStrategy {

    public DivisionStrategy() {
    }

    @Override
    public double calculation(double a, double b) {
        double rez = 0;
        if (b != 0) {
            rez = a / b;
        }
        return rez;
    }
}
