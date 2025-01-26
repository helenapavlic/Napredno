package Claculator;

public class App {
    public static void main(String[] args) {


        // Try part of solution soon as possible
//		DivisionStrategy ds = new DivisionStrategy();
//		System.out.println(ds.calculation(18.98, 0));

        double a = 20.11;
        double b = 11.10;

        SimpleCalculator sc = new SimpleCalculator();
        sc.setStrategy(new AddStrategy());
        System.out.println(sc.performCalculation(a, b));
        sc.display();

        System.out.println("-----------------");

        sc.setStrategy(new PowStrategy());
        System.out.println(sc.performCalculation(2,3));
        sc.display();

        System.out.println("-----------------");
        sc.setStrategy(new AverageStrategy());
        System.out.println(sc.performCalculation(7,10));
        sc.display();

    }
}
