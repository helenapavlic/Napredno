package WeatherInfoWeb;

public class WeatherStationClient {

    private static PrimaryInterface objMes;
    public static void main(String[] args) {
//        MetricWeatherServiceStation metricWeatherServiceStation = new MetricWeatherServiceStation();
//        metricWeatherServiceStation.readWindSpeedMs();
//        metricWeatherServiceStation.readTempC();
//        metricWeatherServiceStation.showWhetherData();

        objMes = new MetricWeatherServiceStation();
        objMes.readTempC();
        objMes.readWindSpeedMs();
        objMes.showWhetherData();
        objMes = new Adapter(new NoMetricWeatherServiceAdaptee());
        objMes.readTempC();
        objMes.readWindSpeedMs();
        objMes.showWhetherData();

    }
}
