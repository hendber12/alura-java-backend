public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private double altura;
    private double largura;

    @Override
    public double calculaArea() {
        return altura * largura;
    }

    @Override
    public double calculaPerimetro() {
        return altura * 2 + largura * 2;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
