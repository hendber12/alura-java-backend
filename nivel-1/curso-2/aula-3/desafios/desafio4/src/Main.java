public class Main {
    static void main(String[] args) {
        NumerosPrimos numerosPrimos = new NumerosPrimos();
        GeradorPrimo geradorPrimo = new GeradorPrimo();

        System.out.println(geradorPrimo.gerarProximoPrimo(8));
    }
}