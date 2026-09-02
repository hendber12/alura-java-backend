public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    private double celsius;
    private double fahrenheit;

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }


    @Override
    public double celsiusParaFahrenheit() {
        return celsius * 9/5 + 32;
    }

    @Override
    public double fahrenheitParaCelsius() {
        return (fahrenheit - 32) * 5/9;
    }
}
