public class Produto extends Tipo implements Vendavel{
    @Override
    public double calculaPrecoTotal(int quantidade, double descontoPercentual) {
        if (quantidade < 10) {
            return quantidade * getPreco() * descontoPercentual;
        } else {
            return quantidade * getPreco() * 0.5;
        }
    }
}
