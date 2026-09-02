public class Livro extends Biblioteca implements Calculavel{

    @Override
    public double calculaPrecoFinal() {
        return getPreco() * 0.90;
    }
}
