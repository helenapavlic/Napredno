package Claculator;

public abstract class Calculator {

    protected CalculationStrategy strategy;

    protected double performCalculation(double a, double b) {
        return strategy.calculation(a, b);
    }

    protected abstract void display();


    public void setStrategy(CalculationStrategy strategy) {
        this.strategy = strategy;
    }

}
