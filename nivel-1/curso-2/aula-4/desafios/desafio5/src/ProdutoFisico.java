public class ProdutoFisico extends Biblioteca implements Calculavel {

    @Override
    public double calculaPrecoFinal() {
        return getPreco() + 10.67;
    }
}
