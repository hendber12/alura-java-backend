public class Main {
    static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();

        conversor.setCelsius(67);
        System.out.println("67 celsius em fahrenheit são " + conversor.celsiusParaFahrenheit());
        conversor.setFahrenheit(67);
        System.out.println("67 fahrenheit em celsius são " + conversor.fahrenheitParaCelsius());
    }
}
