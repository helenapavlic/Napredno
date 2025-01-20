package WeatherInfoWeb;

public class Adapter implements PrimaryInterface {
    private double temp;
    private double spd;

    private NoMetricWeatherServiceAdaptee noMetricWeatherServiceAdaptee;

    public Adapter(NoMetricWeatherServiceAdaptee noMetricWeatherServiceAdaptee) {
        this.noMetricWeatherServiceAdaptee = noMetricWeatherServiceAdaptee;
    }

    @Override
    public void readTempC() {
        noMetricWeatherServiceAdaptee.readTemperatureF();
        this.temp = convertFintoC(noMetricWeatherServiceAdaptee.getTempF());
    }

    @Override
    public void readWindSpeedMs() {
        noMetricWeatherServiceAdaptee.readWindSpeedKn();
        this.spd= convertKnintoMs(noMetricWeatherServiceAdaptee.getWindSpeedKn());
    }

    @Override
    public void showWhetherData() {
        System.out.println("\n");
        System.out.println("******************* Weather data *********************");
        System.out.println("Input data from " + noMetricWeatherServiceAdaptee.getClass().getSimpleName() + ":");
        noMetricWeatherServiceAdaptee.showMeasuredData();
        System.out.println("Data after using adapter:");
        System.out.println(toString());

    }

    private double convertFintoC(double inF) {

        double convertedTmp = (inF - 32) * 0.556;
        return convertedTmp;
    }

    private double convertKnintoMs(double inKn) {
        double convertedSpd = inKn / 1.944;
        return convertedSpd;
    }

    @Override
    public String toString() {
        return "Adapter for [wthrSer = " + noMetricWeatherServiceAdaptee.getClass().getSimpleName() + ", Converted data -> temp = " + temp + " in Celsius, spd = " + spd + " m/s]";
    }
}
