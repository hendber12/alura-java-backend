public class Main {
    static void main(String[] args) {
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();

        calculadora.setAltura(67);
        calculadora.setLargura(42);

        System.out.println("A área é: " + calculadora.calculaArea());
        System.out.println("O perimetro é: " + calculadora.calculaPerimetro());
    }
}
