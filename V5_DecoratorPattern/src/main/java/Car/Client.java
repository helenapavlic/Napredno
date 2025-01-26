package Car;

public class Client {
    public static void main(String[] args) {
        AbstractCarPackage basicPackage = new BasicCarPackage("BMW");
        System.out.println(basicPackage);
        DieselEngineTypeDecorator dieselPack = new DieselEngineTypeDecorator();
        dieselPack.setCarToDecorate(basicPackage);
        System.out.println(dieselPack);

        GasolineEngineTypeDecorator gasPack = new GasolineEngineTypeDecorator();
        gasPack.setCarToDecorate(basicPackage);
        System.out.println(gasPack);

    }
}
