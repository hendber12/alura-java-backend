public class Main {
    static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setPreco(67);
        ProdutoFisico produto1 = new ProdutoFisico();
        produto1.setPreco(67);

        System.out.println(livro1.calculaPrecoFinal());
        System.out.println(produto1.calculaPrecoFinal());

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.calculaPreco(livro1));
        System.out.println(calculadora.calculaPreco(produto1));

    }
}
