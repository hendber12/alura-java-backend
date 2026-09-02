public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public double convertaDolarParaReal(double dolar) {
        return dolar * 5;
    }
}
