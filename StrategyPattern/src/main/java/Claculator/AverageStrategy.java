package Claculator;

public class AverageStrategy implements CalculationStrategy{
    @Override
    public double calculation(double a, double b) {
        return (a+b)/2;
    }
}
