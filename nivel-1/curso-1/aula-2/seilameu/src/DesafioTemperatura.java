public class DesafioTemperatura {

    public static void main(String[] args) {

        double temperaturaCelcius = 30.4;
        int temperaturaFahrenheit = (int) ((temperaturaCelcius * 1.8) + 32);
        System.out.println(String.format("A temperatura %.2f C é igual à %d F", temperaturaCelcius, temperaturaFahrenheit));

    }
}