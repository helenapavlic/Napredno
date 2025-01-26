package Claculator;

public class SimpleCalculator extends Calculator {

    public SimpleCalculator() {

    }

    public SimpleCalculator(CalculationStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    protected void display() {
        System.out.println(strategy.getClass().getSimpleName() + " performed calculation! ");

    }
}
