public class Main {
    static void main(String[] args) {
        Produto produto = new Produto();
        Servico servico = new Servico();
        Tipo tipo = new Tipo();

        produto.setPreco(67);
        servico.setPreco(67);

        System.out.println(tipo.calculaPrecoFinal(produto, 10, 0.10));
        System.out.println(tipo.calculaPrecoFinal(servico, 10, 0.10));
        System.out.println(tipo.calculaPrecoFinal(produto, 5, 0.15));
        System.out.println(tipo.calculaPrecoFinal(servico, 5, 0.15));
    }
}
