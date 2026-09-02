public class Tipo {
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calculaPrecoFinal(Vendavel vendavel, int quantidade, double descontoPercentual) {
        return vendavel.calculaPrecoTotal(quantidade, descontoPercentual);
    }
}
