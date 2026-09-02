public class Main {
    static void main(String[] args) {
        ConversorMoeda converte = new ConversorMoeda();
        double dolar = 25.67;
        double real = converte.convertaDolarParaReal(dolar);
        System.out.println(real);
    }
}
