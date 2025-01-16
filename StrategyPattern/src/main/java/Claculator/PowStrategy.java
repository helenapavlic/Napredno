package Claculator;


public class PowStrategy implements CalculationStrategy{
    @Override
    public double calculation(double a, double b) {
        double rez = Math.pow(a,b);
        int intRez = (int) rez;
        return intRez;
    }
}
