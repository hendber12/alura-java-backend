public class Servico extends Tipo implements Vendavel {
    @Override
    public double calculaPrecoTotal(int quantidade, double descontoPercentual) {
        return quantidade * getPreco() * (1-descontoPercentual);
    }
}
